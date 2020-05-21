package board.inquiry.model.service;

import static common.JDBCTemplate.*;
import static common.JDBCTemplate.getConnection;
import java.sql.Connection;
import java.util.ArrayList;

import board.inquiry.model.dao.InquiryDao;
import board.inquiry.model.vo.Inquiry;


public class InquiryService {

	public int getListCount() {
		Connection conn = getConnection();
		int listCount = new InquiryDao().getListCount(conn);
		System.out.println("[InquiryService]게시글 갯수 출력:"+listCount);
		close(conn);
		return listCount;
	}

	public ArrayList<Inquiry> selectList(int currentPage, int limit) {
		Connection conn = getConnection();
		
		ArrayList<Inquiry> list = new InquiryDao().selectList(conn,currentPage, limit);
		System.out.println("[InquiryService]selectList출력-"+list);
		
		close(conn);
		return list;
	}

	public ArrayList<Inquiry> insertQuestion(Inquiry in,int currentPage, int limit) {
		Connection conn = getConnection();
		InquiryDao inDao = new InquiryDao();
		
		int result = inDao.insertQuestion(conn,in);
		ArrayList<Inquiry> inList = null;
		System.out.println("[service]문의 인서트 결과값:"+result);
		if(result>0) {
			commit(conn);
			inList = selectList(currentPage,limit);
			System.out.println("[service]문의 인서트 결과값:"+inList);
		}

		
		
		return inList;
	}

	
}
