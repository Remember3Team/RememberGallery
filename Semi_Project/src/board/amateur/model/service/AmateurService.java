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

	public int getListCount() {
		Connection conn = getConnection();
		
		int listCount = new AmateurDao().getListCount(conn);
		close(conn);
		
		return listCount;
	}

	public ArrayList<Amateur> selectList(int currentPage, int limit) {
		Connection conn = getConnection();
		
		ArrayList<Amateur> list = new AmateurDao().selectList(conn,currentPage, limit);
		System.out.println("[service]게시글 리스트 출력:"+list);
		close(conn);
		return list;
	}

//	public ArrayList<FileManagement> selectList(Amateur amateur) {
//		Connection conn = getConnection();
//		
//		ArrayList<FileManagement> fileList = new AmateurDao().selectList(conn, amateur);
//		System.out.println("[service]게시글 파일리스트 출력:"+fileList);
//		close(conn);
//		return fileList;
//	}
	

}
