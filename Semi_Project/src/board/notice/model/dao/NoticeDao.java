package board.notice.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import static common.JDBCTemplate.*;
import board.notice.model.vo.Notice;

public class NoticeDao {

	//공통 특성인 Properties 사용부분 생성자로 명시
	Properties prop = new Properties();
	public NoticeDao() {
		String fileName = NoticeDao.class.getResource("/sql/driver.properties").getPath();
		try {
			prop.load(new FileReader(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int insertNotice(Connection conn, Notice noticeBoard) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "INSERT INTO BOARD VALUES(BOARD_NUM.NEXTVAL,?,'1',SYSDATE,?)";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, noticeBoard.getNoti_title());
			pstmt.setString(2, noticeBoard.getNotice());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		} 
		return result;
		
	}

	public int getListCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "SELECT COUNT(*) FROM BOARD";
		int listCount = 0;
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				listCount = rset.getInt(1);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			close(stmt);
			close(rset);
		}
		
		return listCount;
	}

	public ArrayList<Notice> selectList(Connection conn, int currentPage, int limit) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Notice> list = new ArrayList<>();
		
		String query ="SELECT * FROM BOARD WHERE NOTI_NO BETWEEN ? AND ?"; 
		
		
		//쿼리문 실행시 조건절에 넣을 변수를 (ROWNUM에 대한 조건 시 필요) 연산 처리
		int startRow = (currentPage -1)*limit +1;
		int endRow = startRow + limit -1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Notice n = new Notice(rset.getInt("NOTI_NO"),
									rset.getString("NOTI_TITLE"),
									rset.getString("NOTI_CATE"),
									rset.getDate("NOTI_DATE"),
									rset.getString("NOTICE"));
				list.add(n);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		System.out.println("NoticeDao:게시글 출력 확인_"+list);
		return list;
	}

	public Notice selectNotice(Connection conn, int noti_no) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Notice n = null;
		
		String query = "SELECT * FROM BOARD WHERE NOTI_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noti_no);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				n = new Notice(rset.getInt("noti_no"),
							   rset.getString("noti_title"),
							   rset.getString("noti_cate"),
							   rset.getDate("noti_date"),
							   rset.getString("notice"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		return n;
	}

}
