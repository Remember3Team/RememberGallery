package board.inquiry.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import board.inquiry.model.vo.Inquiry;
import board.notice.model.vo.Notice;

public class InquiryDao {

	public int getListCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "SELECT COUNT(*) FROM QUESTION";
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

	public ArrayList<Inquiry> selectList(Connection conn, int currentPage, int limit) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		Inquiry in = new Inquiry();
		ArrayList<Inquiry> list = new ArrayList<>();
		list.add(in);
		String query = "SELECT * FROM QUESTION WHERE Q_NO BETWEEN ? AND ?";
		int startRow = (currentPage -1)*limit +1;
		int endRow = startRow + limit -1;
		
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				in = new Inquiry(rset.getInt("Q_NO"),
									  rset.getString("USER_ID"),
									  rset.getDate("Q_DATE"),
									  rset.getString("Q_CATE"),
									  rset.getString("QUESTION"),
									  rset.getString("Q_YN"),
									  rset.getString("QUESTION_TITLE"));
				list.add(in);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

}
