package product.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import board.notice.model.vo.Notice;
import product.model.vo.Attachment;
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
		
		String query ="SELECT * FROM PAINT WHERE PAINT_NO BETWEEN ? AND ?"; 
		
		
		//쿼리문 실행시 조건절에 넣을 변수를 (ROWNUM에 대한 조건 시 필요) 연산 처리
		int startRow = (currentPage -1)*limit +1;
		int endRow = startRow + limit -1;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				product p = new product(rset.getInt("PAINT_NO"),
									rset.getString("PAINT_NAME"),
									rset.getInt("PAINT_PRICE"),
									rset.getInt("SIZE_NO"));
									
				list.add(p);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}
		System.out.println("ProductDao:게시글 출력 확인_"+list);
		
		return list;
	}

	public int insertProduct(Connection conn, product p) {
		PreparedStatement pstmt = null;

		int result = 0;
		
		String query = "INSERT INTO PAINT VALUES(PAINT_NO.NEXTVAL, ?, ?, ?, ?, ?, ?, 1, N)";

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
		
		String query = "INSERT INTO PAINT_PHOTO VALUES(AFILE_NO,,?)";
		try {
			for (int i = 0; i < fileList.size(); i++) {
				Attachment at = fileList.get(i);
				pstmt = conn.prepareStatement(query);

				pstmt.setString(1, at.getOriginName());
				
				result += pstmt.executeUpdate();
			}
		return 0;
	}
}
