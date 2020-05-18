package board.amateur.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.amateur.model.service.AmateurService;
import board.amateur.model.vo.Amateur;
import board.amateur.model.vo.FileManagement;
import board.notice.model.vo.PageInfo;

/**
 * Servlet implementation class AmateurListServlet
 */
@WebServlet("/list.am")
public class AmateurListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AmateurListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AmateurService aService = new AmateurService();
		
		int listCount = aService.getListCount();
		
		int currentPage;		//현재 페이지를 저장할 변수
		int limit; 				//한 페이지에 보여질 게시글 수
		int maxPage;			//전체 페이지의 맨 마지막 페이지
		int startPage;			//한번에 표시될 페이지가 시작할 페이지
		int endPage;			//한번에 표시될 페이지가 끝나는 페이지
		
		// * currentPage - 현재 페이지
		// 기본 게시판 페이지는 1페이지부터 시작
		currentPage = 0;
		// 하지만 페이지 전환시 전달받은 현재 페이지가 있을 시 해당 페이지를 currentPage로 적용
		if(request.getParameter("currentPage")!= null) {
			currentPage = Integer.valueOf(request.getParameter("currentPage")); //String ->int
			//String -> int
		}else {
			currentPage=1;
		}
		// * limit - 한 페이지에 보여질 목록 갯수
		limit = 10;
		
		// *maxPage - 총 페이지 수 
		// 목록 수가 123개이면 페이지 수는 13페이지가 됨
		maxPage = (int)((double)listCount/limit + 0.9);
		
		// *startPage - 현재 페이지에 보여질 시작 페이지 수
		// 아래쪽에 페이지 수가 10개씩 보여지게 할 경우
		// 1,11,21,31 ...
		startPage = (((int)((double)currentPage/limit+0.9))-1)*limit+1;
		
		
		// *endPage - 현재 페이지에 보여질 마지막 페이지 수
		// 아래쪽에 페이지 수가 10개씩 보여지게 할 경우
		// 10,20,30,40 ...
		endPage = startPage+limit-1;
		
		
		// maxPage(총 페이지 수)가 endPage보다 작을 경우
		// ex) maxPage => 13이고 endPage가 =>20이면
		if(maxPage<endPage) {
			endPage = maxPage;
		}
		
		//위에서 계산한 모든 페이지 관련 변수들을 PageInfo 클래스의 객체에 담자(PageInfo클래스를 만들자)
		PageInfo pi = new PageInfo(currentPage,listCount,limit,maxPage,startPage,endPage);
		
		ArrayList<Amateur> list = aService.selectList(currentPage, limit);
		Amateur getEventNo = new Amateur();
		ArrayList<FileManagement> fileList = aService.selectList(getEventNo);
		
		for(int i = 0;i<list.size();i++) {
			System.out.println("[servlet]게시글 출력 : "+list.get(i));
			System.out.println("[servlet]파일 출력:"+fileList.get(i));
		}
		
		//화면으로
		RequestDispatcher view = null;
		if(!list.isEmpty()) {
			view = request.getRequestDispatcher("views/board/amateur/amateurBoard.jsp");
			request.setAttribute("fileList", fileList);
			request.setAttribute("list", list);
			request.setAttribute("pi", pi);
		}else {
			System.out.println("게시글 조회 실패");
			view = request.getRequestDispatcher("views/board/amateur/amateurBoard.jsp");
		}
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
