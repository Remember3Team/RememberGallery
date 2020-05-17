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
				loginMember = new Member(rset.getString("USER_ID"), rset.getString("GRADE"),
						rset.getString("USER_NAME"), rset.getString("USER_PWD"), rset.getString("EMAIL"),
						rset.getString("PHONE"), rset.getString("ADDRESS"), rset.getString("NICKNAME"),
						rset.getString("ACCOUNT_GRADE"), rset.getInt("POINT"), rset.getDate("ENROLL_DATE"),
						rset.getString("DELETE_YN"), rset.getString("DELETE_DATE"), rset.getInt("CASH"));

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

	public int idCheck(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int result = 0;
		String query = "SELECT COUNT(*) FROM MEMBER WHERE USER_ID=?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(rs);
		}

		return result;
	}

	public int insertMember(Connection conn, Member member) {
		PreparedStatement pstmt = null; 
		int result = 0; 
		
		String query ="INSERT INTO MEMBER VALUES(?,DEFAULT,?,?,?,?,?,?,DEFAULT,DEFAULT,null,DEFAULT,?,DEFAULT)";
		
		try {
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, member.getUserId());
			pstmt.setString(1, member.getUserPwd());
			pstmt.setString(1, member.getUserName());
			pstmt.setString(1, member.getUserId());
			pstmt.setString(1, member.getUserId());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
