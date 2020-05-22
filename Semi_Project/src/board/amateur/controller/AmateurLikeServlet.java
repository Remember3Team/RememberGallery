package board.amateur.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.amateur.model.service.AmateurService;
import member.model.vo.Member;

/**
 * Servlet implementation class AmateurLikeServlet
 */
@WebServlet("/like.am")
public class AmateurLikeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AmateurLikeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		AmateurService aService = new AmateurService();
		
		//event_no event heartYN
		String user = ((Member) request.getSession().getAttribute("loginUser")).getUserId();
		int event_no = Integer.valueOf(request.getParameter("event_no"));
		String heartYN = request.getParameter("heartYN");
		
		System.out.println(user);
		System.out.println(event_no);
		System.out.println(heartYN);
		
		if(heartYN.equals("Y")) {
			int plusHeart = aService.insertPlus(user,event_no);
			System.out.println("[아마추어 Heart]+1:"+plusHeart);
		}else {
			int minusHeart = aService.insertMinus(user,event_no);
			System.out.println("[아마추어 Heart]-1:"+minusHeart);	
		}
		
		int totalCount = 0;
		totalCount = aService.selectTotalCount(event_no);
		
		System.out.println("[servlet]좋아요 갯수"+totalCount);
		
		
		PrintWriter out = response.getWriter();
		out.print(totalCount);
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
