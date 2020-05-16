package mypage_artist.product_management.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import mypage_artist.product_management.model.dao.Mypage_ArtistDao;
import mypage_artist.product_management.model.vo.Mypage_artist;

public class Mypage_ArtistService {

	public int getListCount(String bWriter) {
		Connection conn = getConnection();
		
		int listCount = new Mypage_ArtistDao().getListCount(conn, bWriter);
		
		close(conn);
		
		return listCount;
	}

	public ArrayList<Mypage_artist> selectList_PM(int currentPage, int limit, String bWriter) {
		Connection conn = getConnection();
		
		ArrayList<Mypage_artist> list = new Mypage_ArtistDao().selectList_PM(conn, currentPage, limit, bWriter);
		
		close(conn);
		return list;
	}

}













