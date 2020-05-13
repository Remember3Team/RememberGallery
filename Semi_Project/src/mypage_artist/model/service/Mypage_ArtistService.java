package mypage_artist.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import mypage_artist.model.dao.Mypage_ArtistDao;

public class Mypage_ArtistService {

	public int getListCount() {
		Connection conn = getConnection();
		
		int listCount = new Mypage_ArtistDao().getListCount(conn);
		
		close(conn);
		
		return listCount;
	}

}
