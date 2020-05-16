package mypage_user.qna.model.service;

import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import mypage_user.qna.model.dao.QnaDao;
import mypage_user.qna.model.vo.Qna;

import static common.JDBCTemplate.*;


public class QnaService {

	public ArrayList<Qna> selectList() {
		Connection conn = getConnection();
		
		ArrayList<Qna> list = new QnaDao().selectList(conn);
		
		System.out.println("qna service단 list 출력"+list);
		
		close(conn);
		
		return list;
	}
	
	public ArrayList<Qna> selectList2() {
		Connection conn = getConnection();
		
		ArrayList<Qna> list2 = new QnaDao().selectList2(conn);
		
		System.out.println("qna service단 list 출력"+list2);
		
		close(conn);
		
		return list2;
	}

	
}
