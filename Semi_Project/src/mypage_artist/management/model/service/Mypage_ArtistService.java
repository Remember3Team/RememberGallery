package mypage_artist.management.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import mypage_artist.management.model.dao.Mypage_ArtistDao;
import mypage_artist.management.model.vo.Mypage_artist;

public class Mypage_ArtistService {

	public int getListCount(String bWriter) {
		Connection conn = getConnection();
		
		int listCount = new Mypage_ArtistDao().getListCount(conn, bWriter);
		
		close(conn);
		
		return listCount;
	}

	public ArrayList<Mypage_artist> selectList_PM(int currentPage, int limit, String bWriter) {
		Connection conn = getConnection();
		
		ArrayList<Mypage_artist> PM_list = new Mypage_ArtistDao().selectList_PM(conn, currentPage, limit, bWriter);
		
		close(conn);
		return PM_list;
	}

	public ArrayList<Mypage_artist> selectList_SM(int currentPage, int limit, String bWriter) {
		Connection conn = getConnection();
		
		ArrayList<Mypage_artist> SM_list = new Mypage_ArtistDao().selectList_PM(conn, currentPage, limit, bWriter);
		
		close(conn);
		return SM_list;
	}

	public ArrayList<Mypage_artist> selectList_OM(int currentPage, int limit, String bWriter) {
		Connection conn = getConnection();
		
		ArrayList<Mypage_artist> OM_list = new Mypage_ArtistDao().selectList_OM(conn, currentPage, limit, bWriter);
		
		close(conn);
		return OM_list;
	}

	public ArrayList<Mypage_artist> detail_order_view(String bWriter) {
		Connection conn = getConnection();
	
		ArrayList<Mypage_artist> DOV_OP = new Mypage_ArtistDao().detail_order_view(conn, bWriter);
		
		close(conn);
		return DOV_OP;
	}

	public ArrayList<Mypage_artist> detail_deposit_view(String bWriter) {
		Connection conn = getConnection();
		
		ArrayList<Mypage_artist> DOV_D = new Mypage_ArtistDao().detail_deposit_view(conn, bWriter);
		
		close(conn);
		return DOV_D;
	}

	public ArrayList<Mypage_artist> detail_shipping_view(String bWriter) {
		Connection conn = getConnection();
		
		ArrayList<Mypage_artist> DOV_SI = new Mypage_ArtistDao().detail_shipping_view(conn, bWriter);
		
		close(conn);
		return DOV_SI;
	}

}













