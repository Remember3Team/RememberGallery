package board.amateur.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.amateur.model.service.AmateurService;
import board.amateur.model.vo.Amateur;
import board.amateur.model.vo.FileManagement;
import board.amateur.model.vo.Reply;
import product.model.vo.MasterpieceCount;

/**
 * Servlet implementation class AmateurDetailServlet
 */
@WebServlet("/detail.am")
public class AmateurDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AmateurDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		int event_no = Integer.valueOf(request.getParameter("event_no"));
		Amateur amateur = new AmateurService().selectBoard(event_no);
		FileManagement file = new AmateurService().selectFile(event_no);
		MasterpieceCount heartCount = new AmateurService().selectHCount(event_no);
		//////////////////////// ajax
		ArrayList<Reply> rList = new AmateurService().selectReplyList(event_no);
		
		
		if(amateur!=null) {
			request.setAttribute("amateur", amateur);
			request.setAttribute("fileList", file);
			request.setAttribute("rList", rList);
			request.setAttribute("heartCount", heartCount);
			System.out.println("[아마추어게시판에서 게시글을 클릭했을 때[servlet]:"+amateur);
			System.out.println("[아마추어게시판에서 게시글을 클릭했을 때[servlet]:"+file);
			System.out.println("[아마추어게시판에서 게시글을 클릭했을 때[servlet]:"+rList);
			request.getRequestDispatcher("views/board/amateur/amateurDetail.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
