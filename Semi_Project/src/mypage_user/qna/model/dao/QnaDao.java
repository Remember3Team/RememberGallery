package mypage_user.qna.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import mypage_user.qna.model.vo.Qna;

public class QnaDao {

	public ArrayList<Qna> selectList(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Qna> list = new ArrayList<>();
		
		String query = "SELECT ORDER_NO,PAINT_NAME,PQUESTION,PQ_DATE,PQ_YN FROM MYPAGE_USER";
		//String query2 = "SELECT Q_CATE,QEUSTION,Q_DATE,Q_YN FROM QUESTION";
		
		try {
			pstmt=conn.prepareStatement(query);
			rset=pstmt.executeQuery();
			
			while(rset.next()) {
				Qna qna = new Qna(rset.getString("order_no"),
								  rset.getString("paint_name"),
								  rset.getString("pquestion"),
								  rset.getDate("pq_date"),
								  rset.getString("pq_yn"));
				list.add(qna);
				//System.out.println("qna dao단 list 출력"+list);
						
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return list;
	}

	public ArrayList<Qna> selectList2(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<Qna> list2 = new ArrayList<>();
		
		String query = "SELECT Q_CATE,QEUSTION,Q_DATE,Q_YN FROM QUESTION";
		
		try {
			pstmt = conn.prepareStatement(query);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Qna qna = new Qna(rset.getString("Q_CATE"),
						  rset.getString("QEUSTION"),
						  rset.getDate("Q_DATE"),
						  rset.getString("Q_YN"));
				list2.add(qna);
				System.out.println("qna dao단 table 2 list 출력"+list2);
				
			}
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		
		
		return list2;
	}
	
	

}
