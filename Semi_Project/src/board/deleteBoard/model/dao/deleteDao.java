package board.deleteBoard.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class deleteDao {


	public int deleteBoard(Connection conn, int deleteNo, int check) {
		PreparedStatement pstmt = null;
		int deleteResult = 0;
		String query = "DELETE FROM BOARD WHERE NOTI_NO=?";			
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, deleteNo);
				
			deleteResult = pstmt.executeUpdate();
			System.out.println("dao");
				if(deleteResult>0) {
				System.out.println("delete가 성공적으로 이루어졌습니다.");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	
		return deleteResult;
	}

}
