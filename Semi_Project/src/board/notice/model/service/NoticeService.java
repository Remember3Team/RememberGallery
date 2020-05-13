package board.notice.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import board.notice.model.dao.NoticeDao;
import board.notice.model.vo.Notice;
public class NoticeService {

	public int insertNotice(Notice noticeBoard) {
		Connection conn = getConnection();
		
		int result = new NoticeDao().insertNotice(conn,noticeBoard);
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int getListCount() {
		Connection conn = getConnection();
		int listCount = new NoticeDao().getListCount(conn);
		close(conn);
		return listCount;
	}

	public ArrayList<Notice> selectList(int currentPage, int limit) {
		Connection conn = getConnection();
		
		ArrayList<Notice> list = new NoticeDao().selectList(conn,currentPage, limit);
		System.out.println("NoticeService:List출력-"+list);
		close(conn);
		return list;
	}

}
