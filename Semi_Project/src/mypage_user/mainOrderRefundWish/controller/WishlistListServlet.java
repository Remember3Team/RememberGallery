package mypage_user.mainOrderRefundWish.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.vo.Member;
import mypage_user.mainOrderRefundWish.model.service.MorwService;
import mypage_user.mainOrderRefundWish.model.vo.Morw;

/**
 * Servlet implementation class WishlistListServlet
 */
@WebServlet("/Wishlist")
public class WishlistListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WishlistListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 세션
		HttpSession session = request.getSession();
		Member loginUser =(Member) session.getAttribute("loginUser");
		System.out.println("loginUser 확인" +loginUser);
		
		
		MorwService mService = new MorwService();
		
		System.out.println("wishlist 서브릿 이동 확인");
		
		ArrayList<Morw> list = mService.wishlistList(loginUser.getUserId());
		System.out.println("리스트 사이즈 : "+list);
		
		RequestDispatcher view = null;
		
		if(!list.isEmpty()) {
			request.setAttribute("list", list);
			view = request.getRequestDispatcher("views/mypage_user/mypage_wishlist.jsp");
		}
		view.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
