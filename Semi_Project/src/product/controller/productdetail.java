package product.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.model.service.ProductService;
import product.model.vo.Attachment;
import product.model.vo.product;

/**
 * Servlet implementation class productdetail
 */
@WebServlet("/detail.po")
public class productdetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productdetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ProductService pService = new ProductService();
		
		int paint_no = Integer.valueOf(request.getParameter("paint_no"));
		
		product plist = new product();
		plist = pService.selectsearch(paint_no);
		
		Attachment alist = new Attachment();
		
		alist = pService.selectAttachment(paint_no);	
		
		ArrayList<product> sizelist = new ArrayList<product>();
		
		sizelist = pService.selectsize();
		
		RequestDispatcher view = null;
		if(plist != null && alist != null && !sizelist.isEmpty()) {
			view = request.getRequestDispatcher("views/product/productdetail.jsp");
			
			request.setAttribute("plist", plist);
			request.setAttribute("alist", alist);
			request.setAttribute("sizelist", sizelist);
		}else {
			System.out.println("상품내용 조회 실패");
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
