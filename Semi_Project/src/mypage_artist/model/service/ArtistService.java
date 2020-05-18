package mypage_artist.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import mypage_artist.model.dao.ArtistDao;
import mypage_artist.model.vo.BuyList_a;
import product.model.vo.Attachment;

public class ArtistService {

	public int getListCount() {
		Connection conn = getConnection();

		int listCount = new ArtistDao().getListCount(conn);

		close(conn);

		return listCount;
	}

	public ArrayList<BuyList_a> selectList(String user_id, int currentPage, int limit) {
		Connection conn = getConnection();

		ArrayList<BuyList_a> list = new ArtistDao().selectList(conn, user_id, currentPage, limit);
		// BoardDao를 가서 selectList메소드 구현하기
		
		System.out.println("buylist_a list 출력 : " + list);

		close(conn);

		return list;
	}

	public ArrayList<Attachment> selectAList(String user_id, int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<Attachment> list2 =new ArtistDao().selectphoto(conn, user_id, currentPage,limit);
		
		System.out.println("list2 출력 : " + list2);
		
		close(conn);
		
		return list2;
	}

}
