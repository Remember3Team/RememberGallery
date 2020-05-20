package artistapply.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import artistapply.model.vo.Apply;
import member.model.vo.Member;
import mypage_artist.RefundQnACard.model.service.ArtistService;

/**
 * Servlet implementation class ArtistImgServlet
 */
@WebServlet("/photo.ar")
public class ArtistImgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArtistImgServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		Member loginMember = (Member) session.getAttribute("loginUser");
		System.out.println(loginMember);
		
		ArtistService aService = new ArtistService();
		Apply aphoto = aService.selectPhoto(loginMember.getUserId());
		
		System.out.println(aphoto);
		
		RequestDispatcher view = null;
		if(aphoto!=null) {
			view = request.getRequestDispatcher("views/common/mypagehead.jsp");
	
			request.setAttribute("aphoto", aphoto);
		}else {
			System.out.println("조회 실패");
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
