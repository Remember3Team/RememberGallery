package product.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import artistapply.model.vo.Apply;
import product.model.vo.Attachment;
import product.model.vo.masterpiece;
import product.model.vo.product;

public class ProductDao {

	public int getListCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;

		String query = "SELECT COUNT(*) FROM PAINT";
		int listCount = 0;

		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);

			if (rset.next()) {
				
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

	public ArrayList<product> selectList(Connection conn, int currentPage, int limit) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		ArrayList<product> list = new ArrayList<>();

		String query = "SELECT * FROM PAINT WHERE PAINT_NO BETWEEN ? AND ?";

		// 쿼리문 실행시 조건절에 넣을 변수를 (ROWNUM에 대한 조건 시 필요) 연산 처리
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);

			rset = pstmt.executeQuery();

			while (rset.next()) {
				product p = new product(rset.getInt("PAINT_NO"), 
						rset.getString("PAINT_NAME"),
				rset.getInt("PAINT_PRICE"),
				rset.getInt("SIZE_NO"),
				rset.getString("ARTIST_NAME"));
				list.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		System.out.println("ProductDao:게시글 출력 확인_" + list);

		return list;
	}

	public int insertProduct(Connection conn, product p) {
		PreparedStatement pstmt = null;

		int result = 0;

		String query = "INSERT INTO PAINT VALUES(SEQ_PID.NEXTVAL, ?, ?, ?, ?, ?, ?, 1, 'N')";

		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, p.getPaint_name());
			pstmt.setInt(2, p.getPatint_price());
			pstmt.setString(3, p.getCategory());
			pstmt.setString(4, p.getArtist_name());
			pstmt.setString(5, p.getPaint_int());
			pstmt.setString(6, p.getPaint_mdate());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public int insertAttachment(Connection conn, ArrayList<Attachment> fileList) {
		PreparedStatement pstmt = null;
		int result = 0;

		String query = "INSERT INTO PAINT_PHOTO VALUES(SEQ_PNO.NEXTVAL,SEQ_PID.CURRVAL,?,?,?)";
		try {
			for (int i = 0; i < fileList.size(); i++) {
				Attachment at = fileList.get(i);
				pstmt = conn.prepareStatement(query);

				pstmt.setString(1, at.getSavefileName());
				pstmt.setString(2, at.getFilePath());
				pstmt.setInt(3, at.getFileLevel());
				result += pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;

	}

	public int insertmasterpiece(Connection conn, product p) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "INSERT INTO MASTERPIECE VALUES(SEQ_PID.CURRVAL, ?,0)";
		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, p.getpId());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public int insertTag(Connection conn, String[] irr) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "INSERT INTO TAG VALUES(?,SEQ_PID.CURRVAL)";
		try {
			for (int i = 0; i < irr.length; i++) {
				pstmt = conn.prepareStatement(query);

				pstmt.setString(1, irr[i]);
				result += pstmt.executeUpdate();
		}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public ArrayList<Attachment> selectphoto(Connection conn, int currentPage, int limit) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		ArrayList<Attachment> list = new ArrayList<>();

		String query = "SELECT * FROM PAINT_PHOTO WHERE FILELEVEL=0 AND PAINT_NO BETWEEN ? AND ?";

		// 쿼리문 실행시 조건절에 넣을 변수를 (ROWNUM에 대한 조건 시 필요) 연산 처리
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);

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

	public ArrayList<product> selectsearch(Connection conn, int currentPage, int limit, product po) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		ArrayList<product> list = new ArrayList<>();

		String query = "SELECT * FROM PAINT WHERE PAINT_NO BETWEEN ? AND ?";

		// 쿼리문 실행시 조건절에 넣을 변수를 (ROWNUM에 대한 조건 시 필요) 연산 처리
		int startRow = (currentPage - 1) * limit + 1;
		int endRow = startRow + limit - 1;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);

			rset = pstmt.executeQuery();

			while (rset.next()) {
				product p = new product(rset.getInt("PAINT_NO"), 
						rset.getString("PAINT_NAME"),
				rset.getInt("PAINT_PRICE"),
				rset.getInt("SIZE_NO"),
				rset.getString("ARTIST_NAME"));
				list.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		System.out.println("ProductDao:게시글 출력 확인_" + list);

		return list;
	}

	public ArrayList<product> selectsearch(Connection conn, product po) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		ArrayList<product> list = new ArrayList<>();
		product p = new product();
		list.add(p);
		if(po.getArtist_name() == null) {//작가이름 null일경우
			String query ="SELECT * FROM PAINT WHERE CATEGORY=? AND PAINT_PRICE BETWEEN 0 AND ?";// AND PAINT_NO BETWEEN ? AND ?
			// 쿼리문 실행시 조건절에 넣을 변수를 (ROWNUM에 대한 조건 시 필요) 연산 처리
			
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, po.getCategory());
				pstmt.setInt(2, po.getPatint_price());
				
				rset = pstmt.executeQuery();
				
				while (rset.next()) {
					 p = new product(rset.getInt("PAINT_NO"), 
											rset.getString("PAINT_NAME"),
											rset.getInt("PAINT_PRICE"),
											rset.getInt("SIZE_NO"),
											rset.getString("ARTIST_NAME"));
											
					list.add(p);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				close(rset);
				close(pstmt);
			}
			System.out.println("ProductDao:게시글 출력 확인_" + list);
		}
		else if(po.getCategory() == null) { 		//카테고리가없을경우
			
			String query ="SELECT * FROM PAINT WHERE PAINT_NAME =? AND PAINT_PRICE BETWEEN 0 AND ? ";
		
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, po.getPaint_name());
				pstmt.setInt(2, po.getPatint_price());
				
				rset = pstmt.executeQuery();
				
				while (rset.next()) {
					p = new product(rset.getInt("PAINT_NO"), 
							rset.getString("PAINT_NAME"),
							rset.getInt("PAINT_PRICE"),
							rset.getInt("SIZE_NO"),
							rset.getString("ARTIST_NAME"));
							list.add(p);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				close(rset);
				close(pstmt);
			}
			System.out.println("ProductDao:게시글 출력 확인_" + list);
		}
		
		
		else if(po.getArtist_name() == null && po.getCategory() == null) { //작가이름과 카테고리가 null일경우
			
			String query ="SELECT * FROM PAINT WHERE PAINT_PRICE BETWEEN 0 AND ? ";
			
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, po.getPatint_price());
				
				
				rset = pstmt.executeQuery();
				
				while (rset.next()) {
					p = new product(rset.getInt("PAINT_NO"), 
							rset.getString("PAINT_NAME"),
							rset.getInt("PAINT_PRICE"),
							rset.getInt("SIZE_NO"),
							rset.getString("ARTIST_NAME"));
							list.add(p);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				close(rset);
				close(pstmt);
			}
			System.out.println("ProductDao:게시글 출력 확인_" + list);
		}
		
		else { //전부다 있을경우( 가격은 0으로 처리되기떄문에 따로 예외처리를 안해줘도된다.)
			String query ="SELECT * FROM PAINT WHERE PAINT_NAME=? AND CATEGORY=? AND PAINT_PRICE BETWEEN 0 AND ? ";
			
			try {
				pstmt = conn.prepareStatement(query);
				
				pstmt.setString(1, po.getPaint_name());
				pstmt.setString(2, po.getCategory());
				pstmt.setInt(3, po.getPatint_price());
				
				
				
				rset = pstmt.executeQuery();
				
				while (rset.next()) {
					 p = new product(rset.getInt("PAINT_NO"), 
							rset.getString("PAINT_NAME"),
							rset.getInt("PAINT_PRICE"),
							rset.getInt("SIZE_NO"),
							rset.getString("ARTIST_NAME"));
							list.add(p);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				close(rset);
				close(pstmt);
			}
			System.out.println("ProductDao:게시글 출력 확인_" + list);
		}
	
		
		return list;
	}

	public ArrayList<product> selectrealsearch(Connection conn,String[] tagname) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "SELECT * FROM TAG WHERE TAG_NAME=?";
		ArrayList<product> taglist = new ArrayList<>();
		try {
			for (int i = 0; i < tagname.length; i++) {
				pstmt = conn.prepareStatement(query);

				pstmt.setString(1, tagname[i]);
				
				rset = pstmt.executeQuery();
				
				while (rset.next()) {
					product p = new product(rset.getInt("PAINT_NO"), 
											rset.getString("TAG_NAME"));
							taglist.add(p);
				}
		}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		System.out.println(taglist);
		return taglist;
		
	}

	public ArrayList<product> selectsearch2(Connection conn, product po, ArrayList<product> tagList) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		ArrayList<product> list = new ArrayList<>();
		
	
		if(po.getArtist_name() == null) {//작가이름 null일경우
			String query ="SELECT * FROM PAINT WHERE CATEGORY=? AND PAINT_PRICE BETWEEN 0 AND ?";// AND PAINT_NO BETWEEN ? AND ?
			// 쿼리문 실행시 조건절에 넣을 변수를 (ROWNUM에 대한 조건 시 필요) 연산 처리
			
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, po.getCategory());
				pstmt.setInt(2, po.getPatint_price());
				
				rset = pstmt.executeQuery();
				
				while (rset.next()) {
					product p = new product(rset.getInt("PAINT_NO"), 
											rset.getString("PAINT_NAME"),
											rset.getInt("PAINT_PRICE"),
											rset.getInt("SIZE_NO"),
											rset.getString("ARTIST_NAME"));
											
					list.add(p);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				close(rset);
				close(pstmt);
			}
			System.out.println("ProductDao:게시글 출력 확인_" + list);
		}
		else if(po.getCategory() == null) { 		//카테고리가없을경우
			
			String query ="SELECT * FROM PAINT WHERE PAINT_NAME =? AND PAINT_PRICE BETWEEN 0 AND ? ";
		
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setString(1, po.getPaint_name());
				pstmt.setInt(2, po.getPatint_price());
				
				rset = pstmt.executeQuery();
				
				while (rset.next()) {
					product p = new product(rset.getInt("PAINT_NO"), 
							rset.getString("PAINT_NAME"),
							rset.getInt("PAINT_PRICE"),
							rset.getInt("SIZE_NO"),
							rset.getString("ARTIST_NAME"));
							list.add(p);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				close(rset);
				close(pstmt);
			}
			System.out.println("ProductDao:게시글 출력 확인_" + list);
		}
		
		
		else if(po.getArtist_name() == null && po.getCategory() == null) { //작가이름과 카테고리가 null일경우
			
			String query ="SELECT * FROM PAINT WHERE PAINT_PRICE BETWEEN 0 AND ? ";
			
			try {
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, po.getPatint_price());
				
				
				rset = pstmt.executeQuery();
				
				while (rset.next()) {
					product p = new product(rset.getInt("PAINT_NO"), 
							rset.getString("PAINT_NAME"),
							rset.getInt("PAINT_PRICE"),
							rset.getInt("SIZE_NO"),
							rset.getString("ARTIST_NAME"));
							list.add(p);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				close(rset);
				close(pstmt);
			}
			System.out.println("ProductDao:게시글 출력 확인_" + list);
		}
		
		else { //전부다 있을경우( 가격은 0으로 처리되기떄문에 따로 예외처리를 안해줘도된다.)
			String query ="SELECT * FROM PAINT WHERE PAINT_NAME=? AND CATEGORY=? AND PAINT_PRICE BETWEEN 0 AND ? ";
			
			try {
				pstmt = conn.prepareStatement(query);
				
				pstmt.setString(1, po.getPaint_name());
				pstmt.setString(2, po.getCategory());
				pstmt.setInt(3, po.getPatint_price());
				
				
				
				rset = pstmt.executeQuery();
				
				while (rset.next()) {
					product p = new product(rset.getInt("PAINT_NO"), 
							rset.getString("PAINT_NAME"),
							rset.getInt("PAINT_PRICE"),
							rset.getInt("SIZE_NO"),
							rset.getString("ARTIST_NAME"));
							list.add(p);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				close(rset);
				close(pstmt);
			}
			System.out.println("ProductDao:게시글 출력 확인_" + list);
		}
		
		return list;
	}

	public ArrayList<Attachment> selectAllalist(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		ArrayList<Attachment> list = new ArrayList<Attachment>();
		String query = "SELECT * FROM PAINT_PHOTO WHERE FILELEVEL=0";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			while (rset.next()) {
				Attachment a = new Attachment(rset.getInt("PAINT_NO"),
										rset.getString("AFILE"),
										rset.getString("FILEPATH"),	
										rset.getInt("FILELEVEL"));

				list.add(a);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		System.out.println(list);
		return list;
	}

	public product selectsearch(Connection conn, int paint_no) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		product p = new product();
		String query = "SELECT * FROM PAINT WHERE PAINT_NO=?";
		
		try {
			pstmt= conn.prepareStatement(query);
			pstmt.setInt(1, paint_no);
			
			
			rset = pstmt.executeQuery();
			while (rset.next()) {
				p = new product(rset.getInt("PAINT_NO"),
										rset.getString("PAINT_NAME"),
										rset.getInt("PAINT_PRICE"),	
										rset.getString("CATEGORY"),
										rset.getString("ARTIST_NAME"),
										rset.getString("PAINT_INT"),
										rset.getString("PAINT_MDATE"),
										rset.getInt("SIZE_NO"));

			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return p;
	}

	public ArrayList<Attachment> selectAttachment(Connection conn, int paint_no) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Attachment> alist = new ArrayList<Attachment>();
		
		String query = "SELECT * FROM PAINT_PHOTO WHERE PAINT_NO=?";
		
		try {
			pstmt= conn.prepareStatement(query);
			pstmt.setInt(1, paint_no);
			
			rset = pstmt.executeQuery();
			while (rset.next()) {
				 Attachment a = new Attachment(rset.getInt("AFILE_NO"),
										rset.getInt("PAINT_NO"),
										rset.getString("AFILE"),	
										rset.getString("FILEPATH"),
										rset.getInt("FILELEVEL"));
				 alist.add(a);
			}
		} catch (SQLException e) {
	
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		
		return alist;
	}

	public ArrayList<product> selectsize(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<product> plist = new ArrayList<>();
		
		String query = "SELECT * FROM PAINT_SIZE";
		
		try {
			pstmt= conn.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				product p = new product(rset.getInt("SIZE_NO"),
											rset.getInt("WIDTH"),
											rset.getInt("HEIGHT"));

				plist.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		System.out.println("dao"+plist);
		
	
		
		return plist;
	}


	public ArrayList<product> payList(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<product> pay_List = new ArrayList<product>();
		
		String query = "SELECT PAINT_NAME, PAINT_PRICE";
		
		try {
			pstmt= conn.prepareStatement(query);
			
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				product p = new product(rset.getString("paint_name"),
													  rset.getInt("patint_price"));

				pay_List.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
	
		
		return pay_List;
	}

	public Apply selectApply(Connection conn, product plist) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Apply apply = new Apply();
		
		String query = "SELECT * FROM SELLER WHERE USER_ID = (SELECT USER_ID FROM MEMBER WHERE USER_NAME=?)";
		try {
			pstmt= conn.prepareStatement(query);
			pstmt.setString(1,plist.getArtist_name());
			
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
				apply = new Apply(rset.getString("USER_ID"),
									rset.getString("ARTIST_INT"),
									rset.getString("ARTIST_PRO"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return apply;

	}

	public int insertmasterpiece(Connection conn,String bWriter, int paint_no) {
		PreparedStatement pstmt = null;

		int result = 0;

		String query = "INSERT INTO MASTERPIECE VALUES(?,?)";
		
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, paint_no);
			pstmt.setString(2, bWriter);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		System.out.println(result);
		
		return result;
	}
}
