package mypage_user.mainOrderRefundWish.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypage_user.mainOrderRefundWish.model.service.MorwService;
import mypage_user.mainOrderRefundWish.model.vo.Morw;

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
		
		MorwService mService = new MorwService();

		
		ArrayList<Morw> list = mService.refundList();
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		RequestDispatcher view = null;
		
		if(!list.isEmpty()) {
			view = request.getRequestDispatcher("views/mypage_user/mypage_refund.jsp");
			request.setAttribute("list",list);
		}else {
			view = request.getRequestDispatcher("views/mypage_user/mypage_refund.jsp");
			request.setAttribute("msg", "환불내역 조회 실패");
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
