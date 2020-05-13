package common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	public static Connection getConnection() {

		Connection conn = null;
		Properties prop = new Properties();

		// Properties의 파일의 경로를 URL객체로 반환해서 getPath()를 쓰면 String형의 경로가 됨.
//		System.out.println("URL 경로:" +JDBCTemplate.class.getResource("/sql/driver.properties"));
//		System.out.println("String 경로:" +JDBCTemplate.class.getResource("/sql/driver.properties"));

		String fileName = JDBCTemplate.class.getResource("/sql/driver.properties").getPath();

		try {
			prop.load(new FileReader(fileName));
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
		
			//1. driver 등록
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName(driver);
			
			//2. DBMS와 연결
			conn= DriverManager.getConnection(url,user,password);
			conn.setAutoCommit(false); 
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		return conn; 
	}

	public static void close(Connection conn) {
		try {
			if(conn!= null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			if(stmt!= null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rset) {
		try {
			if(rset!= null && !rset.isClosed()) {
				rset.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void commit(Connection conn) {
		try {
			if(conn!=null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn!=null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}


