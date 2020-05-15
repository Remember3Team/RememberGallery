package board.amateur.model.service;

import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import static common.JDBCTemplate.*;

import board.amateur.model.dao.AmateurDao;
import board.amateur.model.vo.Amateur;
import board.amateur.model.vo.FileManagement;

public class AmateurService {

	public int insertBoard(Amateur a, ArrayList<FileManagement> fileList) {
		Connection conn = getConnection();
		AmateurDao aDao = new AmateurDao();
		
		int result1 = aDao.insertBoard(conn,a);
		int result2 = aDao.insertAmateurFile(conn,fileList);
		
		System.out.println("[service]게시글 등록여부 : "+result1);
		System.out.println("[service]파일 등록여부 : "+result2);
		if(result1>0 && result2>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		return result1;
	}

}
