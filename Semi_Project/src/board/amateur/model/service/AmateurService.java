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

	public ArrayList<FileManagement> selectList(Amateur getEventNo) {
		Connection conn = getConnection();
		
		ArrayList<FileManagement> list = new AmateurDao().selectList(conn, getEventNo);
		System.out.println("[service]파일 리스트 출력:"+list);
		close(conn);
		
		return list;
	}

	public Amateur selectBoard(int aid) {
		Connection conn = getConnection();
		
		AmateurDao aDao = new AmateurDao();
		
		int result = aDao.updateCount(conn,aid);
		System.out.println("[service] 조회수 증가 결과 :"+result);
		
		Amateur a = null;

		if(result>0) {
			commit(conn);
			a = aDao.selectBoard(conn,aid);
			System.out.println("[service] 조회한 게시글 결과:"+a);
				
		}else {
			rollback(conn);
		}
		close(conn);
		return a;
	}

	public FileManagement selectFile(int event_no) {
		Connection conn = getConnection();
		
		FileManagement fm = null;
		fm = new AmateurDao().selectFile(conn,event_no);
		System.out.println("[service] 조회한 파일명 결과 :"+fm);
		
		return fm;
	}


}
