package product.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;


import product.model.dao.ProductDao;
import product.model.vo.product;


public class ProductService {

	public int getListCount() {
		
		Connection conn = getConnection();
		int listCount = new ProductDao().getListCount(conn);
		close(conn);
		
		return listCount;
	}

	public ArrayList<product> selectList(int currentPage, int limit) {
		Connection conn = getConnection();
		
		ArrayList<product> list = new ProductDao().selectList(conn,currentPage, limit);
		System.out.println("ProductService:List출력-"+list);
		close(conn);
		return list;
	}

}
