package board.deleteBoard.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;

import board.deleteBoard.model.dao.deleteDao;
public class deleteService {

	public int deleteBoard(int deleteNo, int check) {
		Connection conn = getConnection();
		int deleteResult = 0;
		
		deleteResult = new deleteDao().deleteBoard(conn, deleteNo, check);
		
		if(deleteResult>0){
			commit(conn);
		}else {
			rollback(conn);
		}
		
		return deleteResult;
		
	}

}
