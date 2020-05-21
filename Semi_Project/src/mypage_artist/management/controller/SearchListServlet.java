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
import oracle.sql.DATE;

/**
 * Servlet implementation class SearchListServlet
 */
@WebServlet("/Search.MP")
public class SearchListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		request.setCharacterEncoding("utf-8");
		
		Mypage_ArtistService mya = new Mypage_ArtistService();
		
		String order_status = request.getParameter("order_status");
		String term = request.getParameter("term");
		String calendar1 = request.getParameter("calendar1");
		String calendar2 = request.getParameter("calendar2");
		
		String bWriter = (((Member) request.getSession().getAttribute("loginUser")).getUserId());
		
		
		System.out.println(order_status);
		System.out.println(term);
		System.out.println(calendar1);
		System.out.println(calendar2);
		System.out.println(bWriter);
		
		ArrayList<Mypage_artist> search_list = new ArrayList<>();
		
		search_list = mya.listSearch(order_status, term, calendar1, calendar2, bWriter);
		System.out.println(search_list);
		
		RequestDispatcher view = null;
		if(!search_list.isEmpty()) {
			view = request.getRequestDispatcher("views/mypage_artist/order_management.jsp");
			request.setAttribute("search_list", search_list);
		}else {
//			view = request.getRequestDispatcher("views/common/errorPage.jsp");
//			request.setAttribute("msg","게시판 리스트 조회 실패!");
			System.out.println("게시판 조회 실패");
		}
		
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
