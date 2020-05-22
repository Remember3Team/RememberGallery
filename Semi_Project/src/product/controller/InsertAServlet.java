package product.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import member.model.vo.Member;
import product.model.service.ProductService;
import product.model.vo.Paint_QnA;

/**
 * Servlet implementation class InsertAServlet
 */
@WebServlet("/insertA.po")
public class InsertAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ProductService pService =new ProductService();
		System.out.println("잘왔어?");
		String writer = (((Member) request.getSession().getAttribute("loginUser")).getUserId());//로그인한사람.
		int qna_no = Integer.parseInt(request.getParameter("qna_no"));							//qna번호
		String content = request.getParameter("content");
		
		System.out.println(writer);
		System.out.println(qna_no);
		System.out.println(content);
		int result =0;
		int result2 =0;
		if(writer.equals("admin")) {
			result = pService.insertAnwser(qna_no,content);
			result2 = pService.updateQ(qna_no);
		}
		System.out.println(result);
		System.out.println(result2);
		ArrayList<Paint_QnA> qna = pService.selectP();
		
		JSONArray rListArray = new JSONArray();
		JSONObject rListObj = null;
		
		for(Paint_QnA a : qna) {
			rListObj = new JSONObject();
			
			
			rListObj.put("pq_no", a.getPq_no());
			rListObj.put("panswer", a.getPanswer());
			rListObj.put("pa_date", a.getPq_date());
			
			rListArray.add(rListObj);
		}
		
		response.setContentType("application/json; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.print(rListArray);
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
