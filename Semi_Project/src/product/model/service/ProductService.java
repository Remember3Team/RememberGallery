package product.model.service;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.ArrayList;


import product.model.dao.ProductDao;
import product.model.vo.Attachment;
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

	public int insertProduct(product p, ArrayList<Attachment> fileList) {

		Connection conn = getConnection();
		ProductDao pDao = new ProductDao();
		
		int result1 = pDao.insertProduct(conn,p);
		int result2 = pDao.insertAttachment(conn,fileList);
		
		if(result1>0 && result2>0) {
	         commit(conn);
	      }else {
	         rollback(conn);
	      }
	      close(conn);
	      return result2;
	}

}
