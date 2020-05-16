package mypage_artist.management.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static common.JDBCTemplate.*;

import mypage_artist.management.model.vo.Mypage_artist;

public class Mypage_ArtistDao {

	public int getListCount(Connection conn, String bWriter) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "SELECT COUNT(PAINT.PAINT_NO) FROM PAINT \r\n" + 
				"JOIN BASKET ON (PAINT.PAINT_NO = BASKET.PAINT_NO)\r\n" + 
				"JOIN MEMBER ON (BASKET.USER_ID = MEMBER.USER_ID)\r\n" + 		
				"WHERE MEMBER.USER_ID = ? and buy_yn = 'n'";
		
		int listCount = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bWriter);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				listCount = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		System.out.println(listCount);
		return listCount;
	}
	
	

	public ArrayList<Mypage_artist> selectList_PM(Connection conn, int currentPage, int limit, String bWriter) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Mypage_artist> PM_list = new ArrayList<>();
		
		String query = "SELECT PAINT_NO, AFILE, PAINT_INT, p.PAINT_PRICE FROM PAINT P\r\n" + 
				"left JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
				"JOIN BASKET ON (P.PAINT_NO = BASKET.PAINT_NO)\r\n" + 
				"JOIN MEMBER ON (BASKET.USER_ID = MEMBER.USER_ID)\r\n" + 
				"WHERE PAINT_NO BETWEEN ? AND ? AND  MEMBER.USER_ID = ?";
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			pstmt.setString(3, bWriter);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Mypage_artist myart = new Mypage_artist(rset.getInt("paint_no"),
																			 rset.getString("afile"),
																			 rset.getString("paint_int"),
																			 rset.getInt("paint_price"));
				PM_list.add(myart);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return PM_list;
	}



	public ArrayList<Mypage_artist> selectList_SM(Connection conn, int currentPage, int limit, String bWriter) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Mypage_artist> SM_list = new ArrayList<>();
		
		String query = "SELECT ORDER_NO, AFILE, PAINT_INT, ORDER_DATE, SHIP_DATE, ORDER_STATUS FROM BUY_LIST BL\r\n" + 
				"JOIN PAINT P ON (BL.PAINT_NO = P.PAINT_NO)\r\n" + 
				"JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
				"WHERE  ORDER_NO BETWEEN ? AND ? AND USER_ID = ?";
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			pstmt.setString(3, bWriter);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Mypage_artist myart = new Mypage_artist(rset.getInt("order_no"),
																				 rset.getString("afile"),
																				 rset.getString("paint_int"),
																				 rset.getDate("order_date"),
																				 rset.getDate("ship_date"),
																				 rset.getString("order_status"));
				SM_list.add(myart);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return SM_list;
	}



	public ArrayList<Mypage_artist> selectList_OM(Connection conn, int currentPage, int limit, String bWriter) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Mypage_artist> OM_list = new ArrayList<>();
		
		String query = "SELECT ORDER_NO, AFILE, PAINT_NAME, ARTIST_NAME, PAINT_PRICE, ORDER_STATUS FROM BUY_LIST BL\r\n" + 
				"JOIN PAINT P ON (BL.PAINT_NO = P.PAINT_NO)\r\n" + 
				"JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
				"WHERE  ORDER_NO BETWEEN ? AND ? AND  USER_ID = ?";
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			pstmt.setString(3, bWriter);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Mypage_artist myart = new Mypage_artist(rset.getInt("order_no"),
																				 rset.getString("afile"),
																				 rset.getString("paint_name"),
																				 rset.getString("artist_name"),
																				 rset.getInt("paint_price"),
																				 rset.getString("order_status"));
				OM_list.add(myart);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return OM_list;
	}

}
























