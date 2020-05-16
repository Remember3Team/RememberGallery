package mypage_user.qna.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypage_user.qna.model.service.QnaService;
import mypage_user.qna.model.vo.Qna;

/**
 * Servlet implementation class QnaServlet
 */
@WebServlet("/qna")
public class QnaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QnaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QnaService qService = new QnaService();
		System.out.println("qna서블릿 이동 확인");
		
		//상품문의
		ArrayList<Qna> list = qService.selectList();
		ArrayList<Qna> list2 = qService.selectList2();
		
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		RequestDispatcher view = null;
		
		request.setAttribute("list",list);
		request.setAttribute("list2", list2);
		view = request.getRequestDispatcher("views/mypage_user/mypage_pna.jsp");
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
