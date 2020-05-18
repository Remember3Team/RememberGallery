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

	public int insertProduct(product p, ArrayList<Attachment> fileList, String[] irr) {

		
		Connection conn = getConnection();
		ProductDao pDao = new ProductDao();
		
		int result1 = pDao.insertProduct(conn,p);
		int result2 = pDao.insertAttachment(conn,fileList);
		int result3 = pDao.insertmasterpiece(conn,p);
		int result4 = pDao.insertTag(conn,irr);
		
		if(result1>0 && result2> 0 && result3 >0 && result4 >0) {
	         commit(conn);
	      }else {
	         rollback(conn);
	      }
	      close(conn);
	      return result2;
	}

	public ArrayList<Attachment> selectAList(int currentPage, int limit) {
		Connection conn = getConnection();
		ArrayList<Attachment> list2 =new ProductDao().selectphoto(conn,currentPage,limit);
		System.out.println(list2);
		close(conn);
		return list2;
	}

	
	public ArrayList<product> selectsearch(product po) {
		Connection conn = getConnection();

		ArrayList<product> list = new ProductDao().selectsearch(conn,po);

		close(conn);
		return list;
	}

	public ArrayList<product> selectSearchTag(String[] tagname) {
		Connection conn = getConnection();
		
			ArrayList<product> tagList = new ProductDao().selectrealsearch(conn,tagname);
		
			close(conn);
		return tagList;
	}

	public ArrayList<Attachment> selectAllalist() {
		Connection conn = getConnection();
		
		ArrayList<Attachment> alist = new ProductDao().selectAllalist(conn);
		
		close(conn);
		return alist;
	}

	public product selectsearch(int paint_no) {
		Connection conn = getConnection();
		product plist =new ProductDao().selectsearch(conn,paint_no);
		
		
		close(conn);
		return plist;
	}

	public ArrayList<Attachment> selectAttachment(int paint_no) {
		Connection conn = getConnection();
		ArrayList<Attachment> alist =new ProductDao().selectAttachment(conn,paint_no);
		
		
		close(conn);
		return alist;
	}

	public ArrayList<product> selectsize() {
		Connection conn = getConnection();
		
		ArrayList<product> plist =new ProductDao().selectsize(conn);
		return plist;
	}

	public ArrayList<product> payList() {
		Connection conn = getConnection();
		
		ArrayList<product> pay_list = new ProductDao().payList(conn);
		
		return pay_list;
	}

}
