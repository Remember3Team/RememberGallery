package mypage_artist.RefundQnACard.model.dao;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mypage_artist.RefundQnACard.model.vo.BuyList_a;
import mypage_artist.RefundQnACard.model.vo.Message;
import product.model.vo.Attachment;

public class ArtistDao {

	public int getListCount(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		
		String query = "SELECT COUNT(*) FROM BUY_LIST WHERE ORDER_STATUS LIKE '환불%'";
		int listCount = 0;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if(rs.next()) {
				listCount = rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rs);
		}
		
		return listCount;
	}

	public ArrayList<BuyList_a> selectList(Connection conn, String user_id, int currentPage, int limit) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<BuyList_a> list = new ArrayList<>();
		
		String query = "SELECT B.ORDER_NO, B.USER_ID, B.ORDER_STATUS, B.PAINT_NO, P.PAINT_NAME, P.PAINT_PRICE, P.ARTIST_NAME\r\n" + 
				"FROM BUY_LIST B JOIN PAINT P ON (P.PAINT_NO = B.PAINT_NO) WHERE B.ORDER_STATUS LIKE '환불%' AND B.PAINT_NO BETWEEN ? AND ? AND USER_ID =?";
		
		// 쿼리문 실행시 조건절에 넣을 변수를 (ROWNUM에 대한 조건 시 필요) 연산처리
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			pstmt.setString(3, user_id);
			
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				BuyList_a b = new BuyList_a(
				
				rset.getString("order_no"),
				rset.getString("user_id"),
				rset.getString("order_status"),
				rset.getInt("paint_no"),
				rset.getString("paint_price"),
				rset.getString("artist_name"),
				rset.getString("paint_name"));
				
				list.add(b);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public ArrayList<Attachment> selectphoto(Connection conn, String user_id, int currentPage, int limit) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Attachment> list = new ArrayList<>();
		
		String query = "SELECT * FROM PAINT_PHOTO P JOIN BUY_LIST B ON (P.PAINT_NO = B.PAINT_NO) WHERE FILELEVEL=0 \r\n" + 
				"AND B.PAINT_NO BETWEEN ? AND ? AND B.USER_ID = ?";
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			pstmt.setString(3, user_id);

			rset = pstmt.executeQuery();

			while (rset.next()) {
				Attachment p = new Attachment(rset.getInt("PAINT_NO"),
										rset.getString("AFILE"),
										rset.getString("FILEPATH"),	
										rset.getInt("FILELEVEL"));

				list.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		System.out.println("ProductDao attachment:" + list);

		return list;
	}

	public ArrayList<BuyList_a> selectQnAList(Connection conn, String user_id, int currentPage, int limit) {
		
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//		
//		ArrayList<BuyList_a> list = new ArrayList<>();
//		
//		String query = "SELECT B.ORDER_NO, B.USER_ID, B.ORDER_STATUS, B.PAINT_NO, P.PAINT_NAME, P.PAINT_PRICE, P.ARTIST_NAME\r\n" + 
//				"FROM BUY_LIST B JOIN PAINT P ON (P.PAINT_NO = B.PAINT_NO) WHERE B.ORDER_STATUS LIKE '환불%' AND B.PAINT_NO BETWEEN ? AND ? AND USER_ID =?";
//		
//		// 쿼리문 실행시 조건절에 넣을 변수를 (ROWNUM에 대한 조건 시 필요) 연산처리
//		int startRow = (currentPage - 1) * limit + 1;
//		int endRow = startRow + limit - 1;
//		
//		try {
//			pstmt = conn.prepareStatement(query);
//			pstmt.setInt(1, startRow);
//			pstmt.setInt(2, endRow);
//			pstmt.setString(3, user_id);
//			
//			rset = pstmt.executeQuery();
//			
//			while (rset.next()) {
//				BuyList_a b = new BuyList_a(
//				
//				rset.getString("order_no"),
//				rset.getString("user_id"),
//				rset.getString("order_status"),
//				rset.getInt("paint_no"),
//				rset.getString("paint_price"),
//				rset.getString("artist_name"),
//				rset.getString("paint_name"));
//				
//				list.add(b);
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(rset);
//			close(pstmt);
//		}
		
		return null;
	}

	// 감동 카드 리스트 받아오기
	public ArrayList<Message> selectCardList(Connection conn, String user_id, int currentPage, int limit) {
	
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Message> list = new ArrayList<>();
		
		String query = "SELECT * FROM MESSAGE M JOIN MASTERPIECE MP ON (M.PAINT_NO = MP.PAINT_NO) JOIN MEMBER MB ON (MB.USER_ID = M.USER_ID) WHERE MP.USER_ID = ?";
		
		// 쿼리문 실행시 조건절에 넣을 변수를 (ROWNUM에 대한 조건 시 필요) 연산처리
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;
		
		try {
			pstmt = conn.prepareStatement(query);
//			pstmt.setInt(1, startRow);
//			pstmt.setInt(2, endRow);
			pstmt.setString(1, user_id);
			
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				Message m = new Message(
				
				rset.getString("order_no"),
				rset.getInt("paint_no"),
				rset.getString("user_id"),
				rset.getString("message"),
				rset.getString("paint_name"),
				rset.getString("artist_name"),
				rset.getString("user_name"));
				
				list.add(m);
			}
			
			System.out.println("테스트 출력 : " + list);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	public ArrayList<Attachment> selectCAphoto(Connection conn, String user_id, int currentPage, int limit) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Attachment> list = new ArrayList<>();
		
		String query = "SELECT * FROM PAINT_PHOTO P JOIN MESSAGE M ON (P.PAINT_NO = M.PAINT_NO)"
				+ "JOIN MASTERPIECE MP ON ( M.PAINT_NO = MP.PAINT_NO) WHERE FILELEVEL=0 AND MP.USER_ID = ? ";
				
		
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;

		try {
			pstmt = conn.prepareStatement(query);
//			pstmt.setInt(1, startRow);
//			pstmt.setInt(2, endRow);
			pstmt.setString(1, user_id);

			rset = pstmt.executeQuery();

			while (rset.next()) {
				Attachment p = new Attachment(rset.getInt("PAINT_NO"),
										rset.getString("AFILE"),
										rset.getString("FILEPATH"),	
										rset.getInt("FILELEVEL"));

				list.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		System.out.println("ProductDao attachment:" + list);

		return list;
	}

}



















