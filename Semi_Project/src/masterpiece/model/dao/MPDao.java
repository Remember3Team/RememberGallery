package masterpiece.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import board.amateur.model.vo.Amateur;
import board.amateur.model.vo.FileManagement;

public class MPDao {

	public ArrayList<Amateur> showMasterpiece(Connection conn, int firstPaint, int lastPaint) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Amateur a = null;
		ArrayList<Amateur> amateurMasterpiece = new ArrayList<>();
		
		String query = "SELECT * FROM MASTERPIECE_AMATEUR WHERE RNUM BETWEEN ? AND ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, firstPaint);
			pstmt.setInt(2, lastPaint);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				a = new Amateur(rset.getInt("event_no"),
								rset.getString("event_title"),
								rset.getString("event"));
				amateurMasterpiece.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return amateurMasterpiece;
	}

	public ArrayList<FileManagement> showMasterpieceFile(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		FileManagement a = null;
		ArrayList<FileManagement> amateurMasterpieceFile = new ArrayList<>();
		
		String query = "SELECT * FROM EVENT_FILE";
		try {
			pstmt = conn.prepareStatement(query);

			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				a = new FileManagement(rset.getInt("event_no"),
									   rset.getString("event_file"));
				amateurMasterpieceFile.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return amateurMasterpieceFile;
	}

}
