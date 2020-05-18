package product.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import board.notice.model.vo.PageInfo;
import product.model.service.ProductService;
import product.model.vo.Attachment;
import product.model.vo.product;

/**
 * Servlet implementation class worksearch
 */
@WebServlet("/worksearch.po")
public class worksearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public worksearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	
	ProductService pService = new ProductService();
		
		
		
		String aname= request.getParameter("aname");
		String category = request.getParameter("category");
		int price = Integer.valueOf(request.getParameter("price"));
		String[] tagname = request.getParameterValues("tagname");
		
		System.out.println(aname);
		System.out.println(category);
		System.out.println(price);
		product po = new product(aname,category,price);

		ArrayList<product> searchlist = new ArrayList<product>();
	
		searchlist = pService.selectsearch(po);
		
		ArrayList<Attachment> alist = new ArrayList<Attachment>();
		alist = pService.selectAllalist();
		


		RequestDispatcher view = null;
		
		
		if(!searchlist.isEmpty()) {
			view = request.getRequestDispatcher("views/product/searchproduct.jsp");
			
			request.setAttribute("searchlist", searchlist);
			request.setAttribute("alist", alist);
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
