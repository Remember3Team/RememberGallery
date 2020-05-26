package artistapply.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import artistapply.model.service.ApplyService;
import artistapply.model.vo.Apply;
import artistapply.model.vo.Career;
import member.model.vo.Member;

/**
 * Servlet implementation class ViewApplyServlet
 */
@WebServlet("/view.ap")
public class ViewApplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewApplyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		Member loginUser = (Member) request.getSession().getAttribute("loginUser");
		
		System.out.println(loginUser);
	
	    RequestDispatcher view = null;
	    
		if(loginUser == null) {
			view = request.getRequestDispatcher("views/common/errorPage.jsp");
		    request.setAttribute("msg","로그인을 해주세요.");
		       
		}else {
			view = request.getRequestDispatcher("views/mypage_artist/art-apply.jsp");
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
