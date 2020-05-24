package mypage_artist.management.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static common.JDBCTemplate.*;

import mypage_artist.management.model.vo.Mypage_artist;
import product.model.vo.product;

public class Mypage_ArtistDao {

	public int getListCount_PM(Connection conn, String bWriter) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select count(p.paint_no) from paint p\r\n" + 
				"join member m on (p.artist_name = m.user_name)\r\n" + 
				"where nickname = ?";
		
		int listCount_PM = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bWriter);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				listCount_PM = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		System.out.println(listCount_PM);
		return listCount_PM;
	}
	
	public int getListCount_OM(Connection conn, String bWriter) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select count(p.paint_no) from paint p\r\n" + 
				"join buy_list bl on (p.paint_no = bl.paint_no)\r\n" + 
				"where pay_status is not null;";
		
		int listCount_OM = 0;
		try {
			pstmt = conn.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				listCount_OM = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		System.out.println(listCount_OM);
		return listCount_OM;
	}

	public int getListCount_SM(Connection conn, String bWriter) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select count(p.paint_no) from paint p\r\n" + 
				"join buy_list bl on (p.paint_no = bl.paint_no)\r\n" + 
				"where pay_status is not null;";
		
		int listCount_SM = 0;
		try {
			pstmt = conn.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				listCount_SM = rset.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}
		System.out.println(listCount_SM);
		return listCount_SM;
	}


	public ArrayList<Mypage_artist> selectList_PM(Connection conn, int currentPage, int limit, String bWriter) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Mypage_artist> PM_list = new ArrayList<>();
		
		String query = "SELECT P.PAINT_NO, AFILE, P.PAINT_NAME, ARTIST_NAME, p.PAINT_PRICE, FILELEVEL FROM PAINT P\r\n" + 
				" JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
				"left JOIN BUY_LIST BL ON (P.PAINT_NO = BL.PAINT_NO)\r\n" + 
				"left JOIN MEMBER ON (BL.USER_ID = MEMBER.USER_ID)\r\n" + 
				"WHERE p.paint_no  BETWEEN ? AND ? AND   p.ARTIST_NAME=? AND FILELEVEL=0";
		
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
																			 rset.getString("paint_name"),
																			 rset.getString("artist_name"),
																			 rset.getInt("paint_price"));
				PM_list.add(myart);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		System.out.println(PM_list);
		return PM_list;
	}



	public ArrayList<Mypage_artist> selectList_SM(Connection conn, int currentPage, int limit, String bWriter) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Mypage_artist> SM_list = new ArrayList<>();
		
		String query = "SELECT ORDER_NO, AFILE, PAINT_NAME, ARTIST_NAME, ORDER_DATE, SHIP_DATE, ORDER_STATUS FROM BUY_LIST BL\r\n" + 
				"JOIN PAINT P ON (BL.PAINT_NO = P.PAINT_NO)\r\n" + 
				"JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
				"WHERE order_no between ? and ? and artist_name = ? and filelevel=0";
		
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
																				 rset.getDate("order_date"),
																				 rset.getDate("ship_date"),
																				 rset.getString("order_status"));
				SM_list.add(myart);
				
			}
			System.out.println(SM_list);
			
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
		
		String query = "SELECT ORDER_NO, AFILE, PAINT_NAME, ARTIST_NAME, PAINT_PRICE, ORDER_STATUS FROM BUY_LIST BL \r\n" + 
				"JOIN PAINT P ON (BL.PAINT_NO = P.PAINT_NO)\r\n" + 
				"JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
				"where ORDER_NO BETWEEN ? AND ? AND  filelevel=0 and artist_name=?";
		
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
		System.out.println(OM_list);
		return OM_list;
	}



	public ArrayList<Mypage_artist> detail_order_view(Connection conn, String bWriter) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Mypage_artist> DOV_OP = new ArrayList<>();
		
		String query = "SELECT ORDER_NO, AFILE, PAINT_NAME, ARTIST_NAME, PAINT_PRICE, ORDER_STATUS FROM BUY_LIST BL\r\n" + 
				"JOIN PAINT P ON (BL.PAINT_NO = P.PAINT_NO)\r\n" + 
				"JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
				"WHERE  USER_ID = ?";
	
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bWriter);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Mypage_artist myart = new Mypage_artist(rset.getInt("order_no"),
																				 rset.getString("afile"),
																				 rset.getString("paint_name"),
																				 rset.getString("artist_name"),
																				 rset.getInt("paint_price"),
																				 rset.getString("order_status"));
				DOV_OP.add(myart);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return DOV_OP;
	}



	public ArrayList<Mypage_artist> detail_deposit_view(Connection conn, String bWriter) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Mypage_artist> DOV_D = new ArrayList<>();
		
		String query = "SELECT ORDER_NAME, PAY_TYPE, ORDER_PHONE FROM ORDER_TABLE\r\n" + 
				"WHERE USER_ID=?";
	
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bWriter);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Mypage_artist myart = new Mypage_artist(rset.getString("order_name"),
																				 rset.getString("pay_type"),
																				 rset.getString("order_phone"));
				DOV_D.add(myart);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return DOV_D;
	}



	public ArrayList<Mypage_artist> detail_shipping_view(Connection conn, String bWriter) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Mypage_artist> DOV_SI = new ArrayList<>();
		
		String query = "SELECT REC_NAME, REC_LIST, REC_MESSAGE FROM ORDER_TABLE\r\n" + 
				"WHERE USER_ID=?";
	
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bWriter);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Mypage_artist myart = new Mypage_artist(rset.getString("rec_name"),
																				 rset.getString("rec_list"),
																				 rset.getString("rec_message"));
				DOV_SI.add(myart);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return DOV_SI;
	}



	@SuppressWarnings("unused")
	public ArrayList<Mypage_artist> listSearch(Connection conn, String order_status, String term, String calendar1,
			String calendar2, String bWriter) {
		
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			
			ArrayList<Mypage_artist> search_list = new ArrayList<>();
			Mypage_artist myart  =new Mypage_artist();
			search_list.add(myart);
			
			if(order_status == null) {	
				String query = "SELECT *  FROM BUY_LIST BL \r\n" + 
						"JOIN PAINT P ON (BL.PAINT_NO = P.PAINT_NO)\r\n" + 
						"JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
						"WHERE USER_ID = ? AND ORDER_DATE  BETWEEN ? AND ?";
				
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, bWriter);
					pstmt.setString(2, calendar1);
					pstmt.setString(3, calendar2);
					
					rset = pstmt.executeQuery();
					
					while(rset.next()) {
						myart = new Mypage_artist(rset.getInt("ORDER_NO"),
																						   rset.getString("AFILE"),
																						   rset.getString("PAINT_NAME"),
																						   rset.getString("ARTIST_NAME"),
																						   rset.getInt("PAINT_PRICE"),
																						   rset.getString("ORDER_STATUS"));
						search_list.add(myart);
					}
					
					System.out.println(search_list);
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					close(rset);
					close(pstmt);
				}	
				
				
			}else if(term == null) {
				String query = "SELECT * FROM BUY_LIST BL \r\n" + 
						"JOIN PAINT P ON (BL.PAINT_NO = P.PAINT_NO)\r\n" + 
						"JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
						"WHERE USER_ID = ? AND ORDER_STATUS = ? AND ORDER_DATE  BETWEEN ? AND ?";
				
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, bWriter);
					pstmt.setString(2, order_status);
					pstmt.setString(3, calendar1);
					pstmt.setString(4, calendar2);
					
					rset = pstmt.executeQuery();
					
					while(rset.next()) {
						myart = new Mypage_artist(rset.getInt("order_no"),
																						   rset.getString("afile"),
																						   rset.getString("paint_name"),
																						   rset.getString("artist_name"),
																						   rset.getInt("paint_price"),
																						   rset.getString("order_status"));
						search_list.add(myart);
					}
					System.out.println(search_list);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					close(rset);
					close(pstmt);
				}	
				
				
				
			}else if(calendar1 == null || calendar2 == null) {
				String query ="SELECT * FROM BUY_LIST BL \r\n" + 
						"JOIN PAINT P ON (BL.PAINT_NO = P.PAINT_NO)\r\n" + 
						"JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
						"WHERE USER_ID = ? AND ORDER_STATUS = ? AND ORDER_DATE  BETWEEN (SYSDATE -?) AND (SYSDATE)";
				
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, bWriter);
					pstmt.setString(2, order_status);
					pstmt.setString(3, term);
					
					rset = pstmt.executeQuery();
					
					while(rset.next()) {
						myart = new Mypage_artist(rset.getInt("order_no"),
																						   rset.getString("afile"),
																						   rset.getString("paint_name"),
																						   rset.getString("artist_name"),
																						   rset.getInt("paint_price"),
																						   rset.getString("order_status"));
						search_list.add(myart);
					}
					
					System.out.println(search_list);
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					close(rset);
					close(pstmt);
				}	
				
			}else if(order_status == null && term == null) {
				String query = "SELECT * FROM BUY_LIST BL \r\n" + 
						"JOIN PAINT P ON (BL.PAINT_NO = P.PAINT_NO)\r\n" + 
						"JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
						"WHERE USER_ID = ? AND ORDER_DATE  BETWEEN ? AND ?";
				
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, bWriter);
					pstmt.setString(2, calendar1);
					pstmt.setString(3, calendar2);
					
					rset = pstmt.executeQuery();
					
					while(rset.next()) {
						myart = new Mypage_artist(rset.getInt("order_no"),
																						   rset.getString("afile"),
																						   rset.getString("paint_name"),
																						   rset.getString("artist_name"),
																						   rset.getInt("paint_price"),
																						   rset.getString("order_status"));
						search_list.add(myart);
					}
					
					System.out.println(search_list);
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					close(rset);
					close(pstmt);
				}
				
			}else if(order_status == null && calendar1 == null || calendar2 == null) {
				String query = "SELECT * FROM BUY_LIST BL \r\n" + 
						"JOIN PAINT P ON (BL.PAINT_NO = P.PAINT_NO)\r\n" + 
						"JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
						"WHERE USER_ID = ? AND ORDER_DATE  BETWEEN (SYSDATE -?) AND (SYSDATE)";
				
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, bWriter);
					pstmt.setString(2, term);
					
					rset = pstmt.executeQuery();
					
					while(rset.next()) {
						myart = new Mypage_artist(rset.getInt("order_no"),
																						   rset.getString("afile"),
																						   rset.getString("paint_name"),
																						   rset.getString("artist_name"),
																						   rset.getInt("paint_price"),
																						   rset.getString("order_status"));
						search_list.add(myart);
					}
					
					System.out.println(search_list);
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					close(rset);
					close(pstmt);
				}
				
			}else if(term == null && calendar1 == null || calendar2 == null) {
				String query = "SELECT * FROM BUY_LIST BL \r\n" + 
						"JOIN PAINT P ON (BL.PAINT_NO = P.PAINT_NO)\r\n" + 
						"JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
						"WHERE USER_ID = ? AND ORDER_STATUS = ?";
				
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, bWriter);
					pstmt.setString(2, order_status);
					
					rset = pstmt.executeQuery();
					
					while(rset.next()) {
						myart = new Mypage_artist(rset.getInt("order_no"),
																						   rset.getString("afile"),
																						   rset.getString("paint_name"),
																						   rset.getString("artist_name"),
																						   rset.getInt("paint_price"),
																						   rset.getString("order_status"));
						search_list.add(myart);
					}
					System.out.println(search_list);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					close(rset);
					close(pstmt);
				}
			}else {
				String query = "SELECT * FROM BUY_LIST BL \r\n" + 
						"JOIN PAINT P ON (BL.PAINT_NO = P.PAINT_NO)\r\n" + 
						"JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
						"WHERE USER_ID = ? AND ORDER_STATUS = ? AND ORDER_DATE  BETWEEN ? AND ?";
				
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, bWriter);
					pstmt.setString(2, order_status);
					pstmt.setString(3, calendar1);
					pstmt.setString(4, calendar2);
					
					rset = pstmt.executeQuery();
					
					while(rset.next()) {
						myart = new Mypage_artist(rset.getInt("order_no"),
																						   rset.getString("afile"),
																						   rset.getString("paint_name"),
																						   rset.getString("artist_name"),
																						   rset.getInt("paint_price"),
																						   rset.getString("order_status"));
						search_list.add(myart);
						
					}
					System.out.println(search_list);
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					close(rset);
					close(pstmt);
				}	
			}
			
			
			
		return search_list;
	}



	public ArrayList<Mypage_artist> selectList_DOV_P(Connection conn, String bWriter, int order_no) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Mypage_artist> DOV_plist = new ArrayList<>();
		
		String query = "SELECT ORDER_NO, AFILE, PAINT_NAME, ARTIST_NAME, PAINT_PRICE, ORDER_STATUS FROM BUY_LIST BL \r\n" + 
				"JOIN PAINT P ON (BL.PAINT_NO = P.PAINT_NO)\r\n" + 
				"JOIN PAINT_PHOTO PP ON (P.PAINT_NO = PP.PAINT_NO)\r\n" + 
				"WHERE USER_ID = ? AND ORDER_NO = ? AND FILELEVEL = 0";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bWriter);
			pstmt.setInt(2, order_no);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Mypage_artist myart = new Mypage_artist(rset.getInt("order_no"),
																			 rset.getString("afile"),
																			 rset.getString("paint_name"),
																			 rset.getString("artist_name"),
																			 rset.getInt("paint_price"),
																			 rset.getString("order_status"));
				DOV_plist.add(myart);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return DOV_plist;
	}



	public ArrayList<Mypage_artist> selectList_DOV_D(Connection conn, String bWriter, int order_no) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Mypage_artist> DOV_dlist = new ArrayList<>();
		
		String query = "SELECT ORDER_NAME, PAY_TYPE, ORDER_PHONE FROM ORDER_TABLE\r\n" + 
				"WHERE USER_ID= ? AND ORDER_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bWriter);
			pstmt.setInt(2, order_no);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Mypage_artist myart = new Mypage_artist(rset.getString("order_name"),
																			 rset.getString("pay_type"),
																			 rset.getString("order_phone"));
				DOV_dlist.add(myart);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return DOV_dlist;
	}



	public ArrayList<Mypage_artist> selectList_DOV_S(Connection conn, String bWriter, int order_no) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Mypage_artist> DOV_slist = new ArrayList<>();
		
		String query = "SELECT REC_NAME, REC_LIST, REC_MESSAGE FROM RECEIPT_TABLE\r\n" + 
				"WHERE USER_ID=? AND ORDER_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, bWriter);
			pstmt.setInt(2, order_no);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Mypage_artist myart = new Mypage_artist(0,
																			rset.getString("rec_name"),
																			 rset.getString("rec_list"),
																			 rset.getString("rec_message"));
				DOV_slist.add(myart);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		
		return DOV_slist;
	}



	public int deleteProduct(Connection conn, String bWriter, int paint_no) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "DELETE FROM PAINT_PHOTO\r\n" + 
								"WHERE PAINT_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, paint_no);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}

		return result;
	}



	public int deleteProduct2(Connection conn, String bWriter, int paint_no) {
		PreparedStatement pstmt = null;
		int result2 = 0;
		
		String query = "DELETE FROM PAINT\r\n" + 
								"WHERE ARTIST_NAME = ? AND PAINT_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, bWriter);
			pstmt.setInt(2, paint_no);
			
			result2 = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}

		return result2;
	}






}
























