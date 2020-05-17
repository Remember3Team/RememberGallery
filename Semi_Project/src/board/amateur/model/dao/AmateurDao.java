package board.amateur.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import board.amateur.model.vo.Amateur;
import board.amateur.model.vo.FileManagement;
public class AmateurDao {

	public int insertBoard(Connection conn, Amateur a) {
		PreparedStatement pstmt = null;
		
		int result = 0;
		String query = "INSERT INTO EVENT VALUES(EVENT_SEQ.NEXTVAL, ?,?,SYSDATE,?,DEFAULT,DEFAULT)";
		
		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, a.getEvent_title());
			pstmt.setString(2, a.getUser_id());
			pstmt.setString(3, a.getEvent());
			
			System.out.println("[dao] insert data _ 제목:"+a.getEvent_title());
			System.out.println("[dao] insert data _ 작성자:"+a.getUser_id());
			System.out.println("[dao] insert data _ 내용:"+a.getEvent());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int insertAmateurFile(Connection conn, ArrayList<FileManagement> fileList) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "INSERT INTO EVENT_FILE VALUES(EVENT_SEQ.CURRVAL,?,?)";
		
		try {
			for(int i = 0; i<fileList.size();i++) {
				FileManagement fm = fileList.get(i);
				pstmt = conn.prepareStatement(query);
				
				pstmt.setString(1, fm.getEvent_file());
				pstmt.setString(2, fm.getEvent_path());
				
				result=pstmt.executeUpdate();
			}
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
		String query = "SELECT COUNT(*) FROM EVENT";
		int listCount = 0;
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			
			if(rset.next()) {
				listCount = rset.getInt(1);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rset);
		}
		return listCount;
	}

	public ArrayList<Amateur> selectList(Connection conn, int currentPage, int limit) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Amateur> list = new ArrayList<>();
		
		String query = "SELECT * FROM EVENT WHERE EVENT_NO BETWEEN ? AND ?";
		
		int startRow = (currentPage -1)*limit+1;
		int endRow = startRow+limit-1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			while(rset.next()) {
				Amateur a = new Amateur(rset.getInt("event_no"),
										rset.getString("event_title"),
										rset.getString("user_id"),
										rset.getDate("event_date"),
										rset.getString("event"),
										rset.getInt("hit"),
										rset.getString("event_like"));
				list.add(a);		
			}
			System.out.println("[dao] 게시글 불러오기:"+list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public ArrayList<FileManagement> selectList(Connection conn, Amateur getEventNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<FileManagement> list = new ArrayList<>();
		
		String query = "SELECT * FROM EVENT_FILE";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				FileManagement fm = new FileManagement(rset.getInt("event_no"),
										rset.getString("event_file"),
										rset.getString("event_path"));
				
				list.add(fm);
			}
			System.out.println("[dao] 파일리스트 출력결과:"+list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public int updateCount(Connection conn, int aid) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "UPDATE EVENT SET HIT = HIT+1 WHERE EVENT_NO=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, aid);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public Amateur selectBoard(Connection conn, int aid) {

		PreparedStatement pstmt = null;
		ResultSet rset= null;
		
		String query = "SELECT * FROM EVENT WHERE EVENT_NO=?";
		Amateur a = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, aid);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				a = new Amateur(rset.getInt("EVENT_NO"),
								rset.getString("EVENT_TITLE"),
								rset.getString("USER_ID"),
								rset.getDate("EVENT_DATE"),
								rset.getString("EVENT"),
								rset.getInt("HIT"),
								rset.getString("EVENT_LIKE"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
			return a;
	
	}

	public FileManagement selectFile(Connection conn, int aid) {
		PreparedStatement pstmt = null;
		ResultSet rset= null;
		
		String query = "SELECT * FROM EVENT_FILE WHERE EVENT_NO=?";
		FileManagement fm = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, aid);
			
			rset = pstmt.executeQuery();
			if(rset.next()) {
				fm = new FileManagement(rset.getInt("EVENT_NO"),
								rset.getString("EVENT_FILE"),
								rset.getString("EVENT_PATH"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
			return fm;
	}

}
