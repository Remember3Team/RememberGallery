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
import product.model.vo.Attachment;
import product.model.vo.product;

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
		
		String searchStatus = request.getParameter("search_status");
		String term = request.getParameter("term");
		String calendar = request.getParameter("calendar");
		String calendar2 = request.getParameter("calendar2");
		
		
		MorwService mService = new MorwService();
		
//		ArrayList<Morw> list = mService.selectList(loginMember.getUserId());
		ArrayList<Morw> list = mService.selectList(loginMember.getUserId(),searchStatus,term,calendar,calendar2);
		
		ArrayList<Attachment> plist = mService.selectPList(loginMember.getUserId());
		
		
		//System.out.println("testsssss");
		RequestDispatcher view = null;
		
		//메인으로갈때
		String page = "views/mypage_user/mypage_main.jsp";
		
		
		//ORDER로 갈때
		if("order".equals(menu)) {
			page = "views/mypage_user/mypage_order.jsp";
		}
		
		
		view = request.getRequestDispatcher(page);
		request.setAttribute("list",list);
		request.setAttribute("plist", plist);
		
		view.forward(request, response);
		
		//boardListView.jsp 만들러 가자!
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        doGet(request, response); 
		
		 
		 //화면에서 전달한 order_no parmeter 받기 
		 String param = request.getParameter("order_no");
		 
		 
		 
		 MorwService mService = new MorwService();
		 
		 //상태 업데이트 메소드 실행
		 mService.updateStatus(param);
		 
		 
		
 		
		
		
		  
		
	}

}
