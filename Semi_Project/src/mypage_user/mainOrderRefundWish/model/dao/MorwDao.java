package mypage_user.mainOrderRefundWish.model.dao;
import static common.JDBCTemplate.*;
import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import mypage_user.mainOrderRefundWish.model.vo.Morw;


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
	
	public ArrayList<Morw> selectList(Connection conn,String user_id) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Morw> list = new ArrayList<>();
		
		String query ="SELECT O.ORDER_NO,PP.AFILE,PAINT_NAME,PAINT_PRICE,B.ORDER_DATE,B.ORDER_STATUS " + 
				"FROM ORDER_TABLE O " + 
				"JOIN BUY_LIST B ON (O.ORDER_NO=B.ORDER_NO) " + 
				"JOIN PAINT_PHOTO PP ON (O.PAINT_NO=PP.PAINT_NO) " + 
				"JOIN PAINT P ON (O.PAINT_NO=P.PAINT_NO) " + 
				"WHERE O.USER_ID=?";
		
	
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user_id);
//			pstmt.getResultSet(1);
			
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Morw m = new Morw(rset.getString("order_no"),
									rset.getString("afile"),
									rset.getString("paint_name"),
									rset.getInt("paint_price"),
									rset.getDate("order_date"),
									rset.getString("order_status"));
				list.add(m);
				System.out.println("dao단 list"+list);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}

	//환불리스트
	public ArrayList<Morw> refundList(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Morw> list = new ArrayList<>();
		
		String query ="SELECT ORDER_NO,AFILE,PAINT_NAME,PAINT_PRICE,ORDER_DATE,ORDER_STATUS FROM MYPAGE_USER";
		
	
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Morw m = new Morw(rset.getString("order_no"),
									rset.getString("afile"),
									rset.getString("paint_name"),
									rset.getInt("paint_price"),
									rset.getDate("order_date"),
									rset.getString("order_status"));
				list.add(m);
				System.out.println("dao단 list"+list);
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
