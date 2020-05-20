package board.inquiry.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

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
		System.out.println("[NoticeService]selectList출력-"+list);
		
		close(conn);
		return list;
	}

	
}
