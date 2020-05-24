package masterpiece.model.service;

import java.sql.Connection;
import java.util.ArrayList;
import static common.JDBCTemplate.*;
import board.amateur.model.vo.Amateur;
import board.amateur.model.vo.FileManagement;
import masterpiece.model.dao.MPDao;

public class AmateurMPService {

	public ArrayList<Amateur> showMasterpiece(int firstPaint, int lastPaint) {
		Connection conn = getConnection();
		
		ArrayList<Amateur> amateurMasterpiece = new MPDao().showMasterpiece(conn,firstPaint, lastPaint);
		
		return amateurMasterpiece;
	}

	public ArrayList<FileManagement> showMasterpiece() {
		Connection conn = getConnection();
		
		ArrayList<FileManagement> amateurFileMasterpiece = new MPDao().showMasterpieceFile(conn);
		
		return amateurFileMasterpiece;
	}

}
