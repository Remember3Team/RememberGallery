package mypage_artist.management.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.vo.Member;
import mypage_artist.management.model.service.Mypage_ArtistService;
import mypage_artist.management.model.vo.Mypage_artist;

/**
 * Servlet implementation class DOV_shipping_informationServlet
 */
@WebServlet("/DOV.SI")
public class DOV_shipping_informationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DOV_shipping_informationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Mypage_ArtistService aService = new Mypage_ArtistService();
		
		String bWriter = (((Member) request.getSession().getAttribute("loginUser")).getUserId());
		
		
		// 1_1. 게시판 리스트 갯수 구하기
				int listCount = aService.getListCount(bWriter);
				System.out.println(listCount);
		
				
				// 1_2. 게시판 리스트 조회해오기
				ArrayList<Mypage_artist> DOV_SI = aService.detail_shipping_view(bWriter);
//				for(int i = 0 ; i < list.size(); i++) {
//					System.out.println(list.get(i));
//				}
				// 출력이 잘 나오는걸 확인하면 이제 화면단으로 넘겨주자
				
				RequestDispatcher view = null;
				if(!DOV_SI.isEmpty()) {
					view = request.getRequestDispatcher("views/mypage_artist/detail_order_view.jsp");
					request.setAttribute("DOV_SI", DOV_SI);
				}else {
//					view = request.getRequestDispatcher("views/common/errorPage.jsp");
//					request.setAttribute("msg","게시판 리스트 조회 실패!");
					System.out.println("게시판 조회 실패");
				}
				
				view.forward(request, response);
				
				// boardListView.jsp 만들러 가자!
				
				
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
