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
	
	
	

}
