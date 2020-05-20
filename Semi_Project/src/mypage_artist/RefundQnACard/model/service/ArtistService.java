package mypage_artist.RefundQnACard.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import artistapply.model.dao.ApplyDao;
import artistapply.model.vo.Apply;
import mypage_artist.RefundQnACard.model.dao.ArtistDao;
import mypage_artist.RefundQnACard.model.vo.BuyList_a;
import mypage_artist.RefundQnACard.model.vo.Message;
import mypage_artist.RefundQnACard.model.vo.QnA_Q;
import product.model.vo.Attachment;

public class ArtistService {

	public int getListCount() {
		Connection conn = getConnection();

		int listCount = new ArtistDao().getListCount(conn);

		close(conn);

		return listCount;
	}

	// 환불 리스트 받아오기
	public ArrayList<BuyList_a> selectList(String user_id, int currentPage, int limit) {
		Connection conn = getConnection();

		ArrayList<BuyList_a> list = new ArtistDao().selectList(conn, user_id, currentPage, limit);
		// BoardDao를 가서 selectList메소드 구현하기
		
		System.out.println("buylist_a list 출력 : " + list);

		close(conn);

		return list;
	}
	
	// 작가 아이디로 이미지 받아오기
	public ArrayList<Attachment> selectAList(String user_id, int currentPage, int limit) {
		Connection conn = getConnection();
		
		ArrayList<Attachment> list2 =new ArtistDao().selectphoto(conn, user_id, currentPage,limit);
		
		System.out.println("list2 출력 : " + list2);
		
		close(conn);
		
		return list2;
	}


	// 감동카드 리스트 받아오기 
	public ArrayList<Message> selectCardList(String user_id, int currentPage, int limit) {
		
		Connection conn = getConnection();
		ArrayList<Message> list = new ArtistDao().selectCardList(conn, user_id, currentPage, limit);
		// BoardDao를 가서 selectList메소드 구현하기
		
		System.out.println("Message list 출력 : " + list);

		close(conn);

		return list;
	}

	// 감동카드 이미지 받아오
	public ArrayList<Attachment> selectCAList(String user_id, int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<Attachment> list2 =new ArtistDao().selectCAphoto(conn, user_id, currentPage,limit);
		
		System.out.println("list2 출력 : " + list2);
		
		close(conn);
		
		return list2;
	}

	public ArrayList<QnA_Q> selectQnAList(String user_id, int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<QnA_Q> qnalist = new ArtistDao().selectQnAList(conn, user_id, currentPage, limit);
		
		close(conn);
		
		return qnalist;
	}

	public ArrayList<Attachment> selectQpList(String user_id, int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<Attachment> list2 =new ArtistDao().selectQpphoto(conn, user_id, currentPage,limit);
		
		System.out.println("list2 출력 : " + list2);
		
		close(conn);
		
		return list2;
	}
	
public Apply selectPhoto(String user_id) {
		
		Connection conn = getConnection();
		
		Apply aphoto = new ArtistDao().selecAphoto(conn, user_id);
		
		System.out.println("aphoto : " + aphoto);
		
		close(conn);
		
		return aphoto;
	}

}
