<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="mypage_user.qna.model.vo.*, java.util.ArrayList"%>
    
<%
	ArrayList<Qna> list = ((ArrayList<Qna>)request.getAttribute("list"));
	ArrayList<Qna> list2 = ((ArrayList<Qna>)request.getAttribute("list2"));
%>
	 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
 
  <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
  <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/Style-mypagehead.css">
  <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/Style-refund.css">
  
<script src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>
</head>
<body>
	<%@include file="../common/menubar.jsp" %>
	<%@include file="../common/mypagehead2.jsp" %>
	
	<div class="title">
        <h3><b>문의 내역</b></h3>
        <hr>
    </div>
    

    <div class="container">
 
 	<div class="info-box3">
        <label class="labelfirst"></label>
        <select id="qnaCate" name="select-thema">
        <option value="q1" >1:1문의</option>
        <option value="q2" >상품문의</option>
        </select>
    </div>
      <div class = "qna-table1" style="display:none;">
            <table style="width:100%" name="qna-list">
                <thead>
                <tr>
                    <th>주문 번호</th>
                    <th>상품명</th>
                    <th>문의 내용</th>
                    <th>작성일</th>
                    <th>답변여부</th>
                  
                </tr>
                </thead>
                <tbody>
                      <%if(!list.isEmpty()){ %>
			  			<%for(Qna qna:list){ %>
			    		<tr>
			    			<td><%=qna.getOrderNo() %></td>
			      			<td><%=qna.getPaintName()%></td>
			      			<td><%=qna.getpQuestion()%></td>
			      			<td><%=qna.getpQdate()%></td>
			      			<td><%=qna.getPqYN()%></td>
			    		</tr>
			    		<%} %>
			    	<%} else{%>
			    	<%} %>
				</tbody>
            </table>
        </div>
         <div class = "qna-table2" style="display:block;" >
            <table style="width:100%" name="qna-list">
                <thead>
                <tr>
                    <th>카테고리</th>
                    <th>문의 내용</th>
                    <th>작성일</th>
                    <th>답변여부</th>
                </tr>
                <thead>
                <tbody>
                <%if(!list2.isEmpty()){ %>
			  			<%for(Qna qna:list2){ %>
			    		 <tr>
			    			<td><%=qna.getqCate() %></td>
			      			<td><%=qna.getQuestion()%></td>
			      			<td><%=qna.getqDate()%></td>
			      			<td><%=qna.getqYN()%></td>
			    		</tr> 
			    		<%} %>
			    	<%} else{%>
			    	<%} %>
				</tbody>
            </table>
        </div>
    </div>
      <script>
      $(function(){
    	  $("#qnaCate").change(function(){
        	var v = this.value;
        	/* alert(v); */
        	if(v=="q1"){
        		 $(".qna-table2").show(1000);
        		 $(".qna-table1").hide(1000);
        	}else if(v=="q2"){
        		 $(".qna-table2").hide(1000);
        		 $(".qna-table1").show(1000);
        	}
    		  
    	  });
      });
    		  
    
    </script>
   
      <br>
      <br>
    </div> 
</div>
<br>
<br>
<br>
	<%@include file="../common/footer.jsp" %>
</body>
</html>