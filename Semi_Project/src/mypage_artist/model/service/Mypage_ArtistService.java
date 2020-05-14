package mypage_artist.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import mypage_artist.model.dao.Mypage_ArtistDao;
import mypage_artist.model.vo.Mypage_artist;

public class Mypage_ArtistService {

	public int getListCount() {
		Connection conn = getConnection();
		
		int listCount = new Mypage_ArtistDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}

	public ArrayList<Mypage_artist> selectList(int currentPage, int limit) {
		
		return null;
	}

}
