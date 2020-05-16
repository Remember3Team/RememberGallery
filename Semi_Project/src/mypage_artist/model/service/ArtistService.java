package mypage_artist.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;

import mypage_artist.model.dao.ArtistDao;


public class ArtistService {

	public int getListCount() {
		Connection conn = getConnection();
		
		int listCount = new ArtistDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}

}
