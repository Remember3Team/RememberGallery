package member.model.dao;

import static common.JDBCTemplate.close;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import member.model.vo.Member;

public class MemberDao {

	Properties prop = new Properties();
	public MemberDao() {
		String fileName = MemberDao.class.getResource("/sql/member/member-query.properties").getPath();

		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Member loginMember(Connection conn, Member member) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member loginMember = null;

//		String query = prop.getProperty("loginMember");
		String query = "SELECT*FROM MEMBER WHERE USER_ID=? AND USER_PWD=? AND DELETE_YN='N'";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getUserId());
			pstmt.setString(2, member.getUserPwd());

			rset = pstmt.executeQuery();
			while (rset.next()) {
				loginMember = new Member(rset.getString("USER_ID"),
						rset.getString("GRADE"),
						rset.getString("USER_NAME"),
						rset.getString("USER_PWD"), 
						rset.getString("EMAIL"), 
						rset.getString("PHONE"),
						rset.getString("ADDRESS"),
						rset.getString("NICKNAME"),
						rset.getString("ACCOUNT_GRADE"),
						rset.getInt("POINT"),
						rset.getDate("ENROLL_DATE"),
						rset.getString("DELETE_YN"),
						rset.getString("DELETE_DATE"),
						rset.getInt("CASH"));
			
			}
//			System.out.println(loginMember);		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rset);
		}

		return loginMember;

		// 다시 Service로 돌아가자
	}
	

}

