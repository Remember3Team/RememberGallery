package board.amateur.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import board.amateur.model.dao.AmateurDao;
import board.amateur.model.vo.Amateur;
import board.amateur.model.vo.FileManagement;
import board.amateur.model.vo.Reply;

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
	
	/* 선택한 게시글의 댓글 리스트 조회용 서비스
	 * @param bid
	 * 
	 * @return ArrayList<Reply>
	 */
	public ArrayList<Reply> selectReplyList(int event_no) {
		Connection conn = getConnection();
		
		ArrayList<Reply> rList = new AmateurDao().selectReplyList(conn, event_no);
		close(conn);
		return rList;
	}
	/*
	 * 댓글 추가 후 새로운 갱신된 댓글 리스트 조회용 서비스
	 * @param r
	 * 
	 * @return ArrayList<Reply>
	 */
	public ArrayList<Reply> insertReply(Reply r) {

		Connection conn = getConnection();
		AmateurDao aDao = new AmateurDao();
		
		int result = aDao.insertReply(conn,r);
		
		ArrayList<Reply> rList = null;
		System.out.println("[service]댓글 인서트 결과값:"+result);
		if(result>0) {
			commit(conn);
			rList = aDao.selectReplyList(conn, r.getEvent_no());
			System.out.println("[service]댓글 인서트 결과값:"+rList);
		}else {
			rollback(conn);
			System.out.println("[service]댓글 인서트 실패");
		}
		close(conn);
		return rList;
	}



}
