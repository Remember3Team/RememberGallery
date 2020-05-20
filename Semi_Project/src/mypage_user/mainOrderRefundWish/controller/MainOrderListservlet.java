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
			System.out.println("서블렛단의 list" +list.get(i));
		}
		
		ArrayList<Attachment> plist = mService.selectPList(loginMember.getUserId());
		
		for(int i = 0; i<plist.size(); i++) {
			System.out.println("서블렛 단의 plist" + plist.get(i));
		}
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
