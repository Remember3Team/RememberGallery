package board.deleteBoard.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;

import board.deleteBoard.model.dao.deleteDao;
public class deleteService {

	public int deleteBoard(int deleteNo) {
		Connection conn = getConnection();
		
		int deleteResult = new deleteDao().deleteBoard(conn, deleteNo);
		
		if(deleteResult>0){
			commit(conn);
		}else {
			rollback(conn);
		}
		return deleteResult;
	}

}
