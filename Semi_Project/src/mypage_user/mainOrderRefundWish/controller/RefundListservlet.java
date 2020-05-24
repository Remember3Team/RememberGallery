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
 * Servlet implementation class RefundListservlet
 */
@WebServlet("/Refund.li")
public class RefundListservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RefundListservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//로그인세션
		HttpSession session = request.getSession();
		Member loginUser = (Member) session.getAttribute("loginUser");
		
		MorwService mService = new MorwService();
		
		ArrayList<Morw> list = mService.refundList(loginUser.getUserId());
		
		ArrayList<Attachment> plist = mService.selectPList(loginUser.getUserId());
		
		RequestDispatcher view = null;
		request.setAttribute("list", list);
		request.setAttribute("plist", plist);
		view = request.getRequestDispatcher("views/mypage_user/mypage_refund.jsp");
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
