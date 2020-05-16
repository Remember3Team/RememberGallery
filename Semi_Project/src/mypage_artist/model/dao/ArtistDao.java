package mypage_artist.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static common.JDBCTemplate.*;

public class ArtistDao {

	public int getListCount(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		
		String query = "SELECT COUNT(*) FROM BOARD WHERE BTYPE=1";
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

}
