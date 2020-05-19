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
import product.model.vo.product;

/**
 * Servlet implementation class BuyProductServlet
 */
@WebServlet("/Buy.po")
public class BuyProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService ps = new ProductService();
		
		ArrayList <product> pay_list = ps.payList();
		
		RequestDispatcher view = null;
		if(!pay_list.isEmpty()) {
			view = request.getRequestDispatcher("views/product/productpay.jsp");
			
			request.setAttribute("pay_list", pay_list);
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
