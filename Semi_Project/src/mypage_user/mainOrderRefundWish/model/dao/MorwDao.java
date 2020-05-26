package mypage_user.mainOrderRefundWish.model.dao;
import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mypage_user.mainOrderRefundWish.model.vo.Morw;
import product.model.vo.Attachment;


public class MorwDao {

	public int getListCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		
		String query = "SELECT COUNT(*) FROM MYPAGE_USER WHERE BUY_YN=1";
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
	
//	public ArrayList<Morw> selectList(Connection conn,String user_id) {
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//		
//		ArrayList<Morw> list = new ArrayList<>();
//		
//		String query ="SELECT O.ORDER_NO, P.PAINT_NO,PP.AFILE,PAINT_NAME,P.ARTIST_NAME,PAINT_PRICE,B.ORDER_DATE,B.ORDER_STATUS " + 
//				"FROM ORDER_TABLE O " + 
//				"JOIN BUY_LIST B ON (O.ORDER_NO=B.ORDER_NO) " + 
//				"JOIN PAINT_PHOTO PP ON (O.PAINT_NO=PP.PAINT_NO) " + 
//				"JOIN PAINT P ON (O.PAINT_NO=P.PAINT_NO) " + 
//				"WHERE O.USER_ID=? ORDER BY O.ORDER_NO DESC";
//		
//		
//		try {
//			pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, user_id);
//
//			
//			
//			rset = pstmt.executeQuery();
//			
//			while(rset.next()) {
//				Morw m = new Morw(rset.getString("order_no"),
//									rset.getInt("paint_no"),
//									rset.getString("afile"),
//									rset.getString("paint_name"),
//									rset.getString("ARTIST_NAME"),
//									rset.getInt("paint_price"),
//									rset.getDate("order_date"),
//									rset.getString("order_status"));
//				list.add(m);
//			}
//			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(rset);
//			close(pstmt);
//		}
//		
//		return list;
//	}


	public ArrayList<Morw> selectList(Connection conn, String userId, String searchStatus, String term, String calendar,
			String calendar2) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Morw> list = new ArrayList<>();
		
		String query ="SELECT O.ORDER_NO, P.PAINT_NO,PP.AFILE,PAINT_NAME,P.ARTIST_NAME,PAINT_PRICE,B.ORDER_DATE,B.ORDER_STATUS " + 
				"FROM ORDER_TABLE O " + 
				"JOIN BUY_LIST B ON (O.ORDER_NO=B.ORDER_NO) " + 
				"JOIN PAINT_PHOTO PP ON (O.PAINT_NO=PP.PAINT_NO) " + 
				"JOIN PAINT P ON (O.PAINT_NO=P.PAINT_NO) " + 
				"WHERE O.USER_ID=? AND PP.FILELEVEL = 0 ORDER BY O.ORDER_NO DESC";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);

			
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Morw m = new Morw(rset.getString("order_no"),
									rset.getInt("paint_no"),
									rset.getString("afile"),
									rset.getString("paint_name"),
									rset.getString("ARTIST_NAME"),
									rset.getInt("paint_price"),
									rset.getDate("order_date"),
									rset.getString("order_status"));
				list.add(m);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}


	//환불
	public ArrayList<Morw> refundList(Connection conn, String user_id) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Morw> list = new ArrayList<>();
		
		String query = "SELECT B.ORDER_NO,P.PAINT_NO, PP.AFILE,PAINT_NAME,P.ARTIST_NAME,PAINT_PRICE,B.ORDER_STATUS " + 
				"FROM BUY_LIST B " + 
				"JOIN PAINT_PHOTO PP ON (B.PAINT_NO=PP.PAINT_NO) " + 
				"JOIN PAINT P ON(B.PAINT_NO=P.PAINT_NO) " + 
				"WHERE B.ORDER_STATUS LIKE '환불%' AND B.USER_ID=?";
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, user_id);
			rset=pstmt.executeQuery();
			
			while(rset.next()) {
				Morw m = new Morw(rset.getString("ORDER_NO"),
								  rset.getInt("PAINT_NO"),
								  rset.getString("AFILE"),
								  rset.getString("PAINT_NAME"),
								  rset.getString("ARTIST_NAME"),
								  rset.getInt("PAINT_PRICE"),
								  rset.getString("ORDER_STATUS"));
				list.add(m);
				System.out.println("dao단 refund list 출력"+list);
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		
		
		return list;
	}

	public ArrayList<Morw> wishlistList(Connection conn, String user_id) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Morw> list = new ArrayList<>();
		
		String query = "SELECT B.BASKET_NO,P.PAINT_NO,P.PAINT_NAME,P.ARTIST_NAME,P.PAINT_PRICE " + 
				"FROM PAINT P " + 
				"JOIN BASKET B ON (P.PAINT_NO=B.PAINT_NO) " + 
				"WHERE USER_ID=?";

		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, user_id);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Morw m = new Morw(rset.getInt("BASKET_NO"),
								  rset.getInt("PAINT_NO"),
								  rset.getString("PAINT_NAME"),
								  rset.getString("ARTIST_NAME"),
								  rset.getInt("PAINT_PRICE"));
				
				System.out.println("아티스트네임"+rset.getString("ARTIST_NAME"));
				
				list.add(m);
				System.out.println("wishlist dao단 출력"+list);
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		
		
		return list;
	}
	
	public void wishlistDelete(Connection conn, String whereSQL) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "DELETE FROM BASKET "+whereSQL;
		
		try {
			pstmt=conn.prepareStatement(query);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
	}

	public ArrayList<Attachment> selectPlist(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Attachment> plist = new ArrayList<>();
		
		String query = "SELECT * FROM PAINT_PHOTO P JOIN BUY_LIST B ON (P.PAINT_NO = B.PAINT_NO) WHERE FILELEVEL=0 AND B.USER_ID = ?";
		
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Attachment p = new Attachment(rset.getInt("PAINT_NO"),
											  rset.getString("AFILE"),
											  rset.getString("FILEPATH"),
											  rset.getInt("FILELEVEL"));
				plist.add(p);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			close(pstmt);
			close(rset);
		}
		
		
		return plist;
	}

	public void updateStatus(Connection conn, String param) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "UPDATE BUY_LIST SET ORDER_STATUS = '수령완료' WHERE ORDER_NO =?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, param);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
	
	}

	public int insertMessage(Connection conn, Morw morw) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		
		
		
		String query = "INSERT INTO MESSAGE(ORDER_NO,PAINT_NO,USER_ID,MESSAGE,PAINT_NAME,ARTIST_NAME) VALUES(?,?,?,?,?,?)";
		
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,morw.getOrderNo());
			pstmt.setInt(2,morw.getPaintNo());
			pstmt.setString(3,morw.getUserId());
			pstmt.setString(4,morw.getMessage());
			pstmt.setString(5, morw.getPaintName());
			pstmt.setString(6, morw.getArtistName());
			
			result = pstmt.executeUpdate();
			
			System.out.println("Dao단 result"+result);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
		
	}

	

	public int insertRefund(Connection conn, Morw morw) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "INSERT INTO REFUND(ORDER_NO,PAINT_NO,USER_ID,REFUND_RSN,ACCOUNT_NAME,ACCOUNT_NO,BANK) VALUES(?,?,?,?,?,?,?)";
		
		
		try {
			pstmt=conn.prepareStatement(query);
			
			pstmt.setString(1,morw.getOrderNo());
			pstmt.setInt(2, morw.getPaintNo());
			pstmt.setString(3, morw.getUserId());
			pstmt.setString(4, morw.getRefundReason());
			pstmt.setString(5, morw.getAccountName());
			pstmt.setString(6, morw.getAccountNo());
			pstmt.setString(7, morw.getBank());
			
			result = pstmt.executeUpdate();
			
			System.out.println("Dao단 환불 result"+result);
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return result;
	
	}

	public void updateStatus2(Connection conn, String orderNo) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "UPDATE BUY_LIST SET ORDER_STATUS = '환불신청' WHERE ORDER_NO =? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, orderNo);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		
	}

	

}
