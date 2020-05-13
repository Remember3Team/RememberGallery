package mypage_artist.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypage_artist.model.service.Mypage_ArtistService;

/**
 * Servlet implementation class Mypage_artistServlet
 */
@WebServlet("/Mypage.artist")
public class Mypage_artistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mypage_artistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Mypage_ArtistService aService = new Mypage_ArtistService();
		
		// 1_1. 게시판 리스트 갯수 구하기
				int listCount = aService.getListCount();
		
		// 페이지 수 처리용 변수 선언
				int currentPage;		// 현재 페이지를 저장할 변수
				int limit;					// 한 페이지에 보여질 게시글 수
				int maxPage;				// 전체 페이지의 맨 마지막 페이지
				int startPage;			// 한번에 표시될 페이지가 시작할 페이지
				int endPage;				// 한번에 표시될 페이지가 끝나는 페이지
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
