package member.model.service;

import java.sql.Connection;

import member.model.dao.MemberDao;
import member.model.vo.Member;
import static common.JDBCTemplate.*;



public class MemberService {
	
	public Member loginMember(Member member) {
		System.out.println("서비스 단까지 왔다.");
		Connection conn = getConnection();
		
		Member loginMember = new MemberDao().loginMember(conn,member);
		
		close(conn);

		return loginMember;
	}

	public int idCheck(String userId) {
		Connection conn = getConnection();
		
		int result = new MemberDao().idCheck(conn,userId);
		
		close(conn);
		return result;

	}

	public int insertMember(Member member) {
		Connection conn = getConnection();
		
		int result = new MemberDao().insertMember(conn,member);
		
		if(result >0) {
			commit(conn);
		}else {
			rollback(conn);
		}close(conn);
		
		return result;
	}
	
	
	

}
