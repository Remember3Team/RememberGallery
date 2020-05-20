package product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.vo.Member;
import product.model.service.ProductService;
import product.model.vo.masterpiece;

/**
 * Servlet implementation class insertmasterpieceServlet
 */
@WebServlet("/insertmasterpiece.po")
public class insertmasterpieceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertmasterpieceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ProductService pService = new ProductService();
		
		String bWriter = (((Member) request.getSession().getAttribute("loginUser")).getUserId());
		int paint_no = Integer.valueOf(request.getParameter("paint_no"));
		
		System.out.println(bWriter);
		System.out.println(paint_no);
		
		int result = pService.insertmasterpiece(bWriter,paint_no);
		
		System.out.println(result);
		
		if(result >0) {
			
		}else {
			System.out.println("좋아요 실패");
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
