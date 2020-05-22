package mypage_user.mainOrderRefundWish.model.service;

import static common.JDBCTemplate.*;
import java.sql.Connection;
import java.util.ArrayList;

import mypage_user.mainOrderRefundWish.model.dao.MorwDao;
import mypage_user.mainOrderRefundWish.model.vo.Morw;
import product.model.vo.Attachment;

public class MorwService {

	public int getListCount() {
		Connection conn = getConnection();
		
		int listCount = new MorwDao().getListCount(conn);
		
		close(conn);
			
		return listCount;
	}

	public ArrayList<Morw> selectList(String user_id) {
		Connection conn = getConnection();
		
		ArrayList<Morw> list = new MorwDao().selectList(conn,user_id);
		//BoardDao를 가서 selectList메소드 구현하기
		System.out.println("service단 list 출력"+list);
		
		close(conn);
		return list;
	}


	public ArrayList<Morw> refundList(String user_id) {
		Connection conn = getConnection();
		
		ArrayList<Morw> list = new MorwDao().refundList(conn,user_id);
		System.out.println("service : "+list.size());
		close(conn);
		return list;
	}

	public ArrayList<Morw> wishlistList(String user_id) {
		Connection conn =getConnection();
		
		ArrayList<Morw> list = new MorwDao().wishlistList(conn,user_id);
		close(conn);
		return list;
	}
	
	public void wishlistDelete(String whereSQL) {
		Connection conn =getConnection();
		
		new MorwDao().wishlistDelete(conn,whereSQL);
		
		close(conn);
		
	}

	public ArrayList<Attachment> selectPList(String userId) {
		Connection conn = getConnection();
		ArrayList<Attachment> plist = new MorwDao().selectPlist(conn,userId);
		
		System.out.println(plist);
		close(conn);
		return plist;
	}

	public void updateStatus(String param) {
		Connection conn =getConnection();
		
		new MorwDao().updateStatus(conn,param);
		
		close(conn);
		
		
		
	}

	public int insertMessage(Morw morw)  {
		Connection conn =getConnection();
		
		int result = new MorwDao().insertMessage(conn,morw);
		
		close(conn);
		
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		return result;
		
	}

	
}
