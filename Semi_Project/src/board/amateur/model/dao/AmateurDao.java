package board.amateur.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import board.amateur.model.vo.Amateur;
import board.amateur.model.vo.FileManagement;
public class AmateurDao {

	public int insertBoard(Connection conn, Amateur a) {
		PreparedStatement pstmt = null;
		
		int result = 0;
		String query = "INSERT INTO EVENT VALUES(EVENT_SEQ.NEXTVAL, ?,?,SYSDATE,?,DEFAULT,DEFAULT)";
		
		try {
			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, a.getEvent_title());
			pstmt.setString(2, a.getUser_id());
			pstmt.setString(3, a.getEvent());
			
			System.out.println("[dao] insert data _ 제목:"+a.getEvent_title());
			System.out.println("[dao] insert data _ 작성자:"+a.getUser_id());
			System.out.println("[dao] insert data _ 내용:"+a.getEvent());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	public int insertAmateurFile(Connection conn, ArrayList<FileManagement> fileList) {
		PreparedStatement pstmt = null;
		int result = 0;
		
		String query = "INSERT INTO EVENT_FILE VALUES(EVENT_SEQ.CURRVAL,?,?)";
		
		try {
			for(int i = 0; i<fileList.size();i++) {
				FileManagement fm = fileList.get(i);
				pstmt = conn.prepareStatement(query);
				
				pstmt.setString(1, fm.getEvent_file());
				pstmt.setString(2, fm.getEvent_path());
				
				result=pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		
		return result;
	}

}
