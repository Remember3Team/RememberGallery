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

import board.notice.model.vo.PageInfo;
import member.model.vo.Member;
import mypage_user.mainOrderRefundWish.model.service.MorwService;
import mypage_user.mainOrderRefundWish.model.vo.Morw;

/**
 * Servlet implementation class MainOrderListservlet
 */
@WebServlet("/Mo.li")
public class MainOrderListservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainOrderListservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String menu = request.getParameter("menu");
		
		//로그인세션
		HttpSession session = request.getSession();
		Member loginMember = (Member) session.getAttribute("loginUser");
		System.out.println(loginMember);
		
		MorwService mService = new MorwService();
		
		System.out.println("서블릿 이동 확인");
		
		ArrayList<Morw> list = mService.selectList(loginMember.getUserId());
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//System.out.println("testsssss");
		RequestDispatcher view = null;
		
		String page = "views/mypage_user/mypage_main.jsp";
		
		if("order".equals(menu)) {
			page = "views/mypage_user/mypage_order.jsp";
		}
		
		
		if(!list.isEmpty()) {
			view = request.getRequestDispatcher(page);
			request.setAttribute("list",list);
		}else {
			view = request.getRequestDispatcher("views/mypage_user/mypage_main.jsp");
			request.setAttribute("msg", "게시판 리스트 조회 실패");
		}
		view.forward(request, response);
		
		//boardListView.jsp 만들러 가자!
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
