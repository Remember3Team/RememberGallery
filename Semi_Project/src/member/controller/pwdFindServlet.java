package member.controller;

import java.io.IOException;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/pwdFind.me")
public class pwdFindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pwdFindServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 메일 관련 정보
        String host = "smtp.naver.com";
        
        //검색하려는 사람의 아이디
        String id = request.getParameter("findId");
        String recipient = request.getParameter("findEmail");
//        System.out.println("id : " + id + ", email : " + recipient);	// 값이 잘 넘어왔는지 확인
        
        // 우리 사이트에서 보낼 때 쓰는 메일로 고정해서 쓴다.
        final String username = "woojung531@naver.com";
        final String password = "khtest01"; 
        int port=465;
         
   
        String subject = "리멤버 아트에서 새로운 비번을  생성해 발송합니다.";
    
        String body = null;
        body = "이 비밀번호는 임시 비밀번호이며, 개인정보수정에서 변경해주세요. : ";
        
        // 비번 8자리로 자동생성 알고리즘
        String randomPwd = null;
        char[] arr= new char[8];
		
        for(int i=0; i<arr.length; i++) {
//		arr[i] =(char)((int)(Math.random()*58)+65);	// 영어 대문자부터 소문자
		arr[i] =(char)((int)(Math.random()*74)+48); // 숫자,특수기호,영어(대소문자) 나오도록 범위
		// 65부터 122까지 랜덤수 생성
        }
        
        randomPwd= new String(arr); // 문구 다음에 비번 붙어나오게 +=
        
        
        
         int result = new MemberService().updatePwd(id,randomPwd);	
        
         body += randomPwd;
         
         if(result >0) {
        	 System.out.println("새로운 비번이 생성되었습니다. 이메일 확인하세요.");
         }else {
        	 System.out.println("새로운 비번 생성 실패");
         }
        
//        int num = 'z';
//        int num2 ='A';
//        
//        System.out.println(num+","+num2);
//        
         
        Properties props = System.getProperties();
         
         
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.ssl.trust", host);
          
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            String un=username;
            String pw=password;
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(un, pw);
            }
        });
        session.setDebug(true); //for debug
          
        Message mimeMessage = new MimeMessage(session);
        try {
			mimeMessage.setFrom(new InternetAddress(username));	
			mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));	// 받을 사람 이메일 주소
			mimeMessage.setSubject(subject);	
			mimeMessage.setText(body);			
			Transport.send(mimeMessage);
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
        response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
