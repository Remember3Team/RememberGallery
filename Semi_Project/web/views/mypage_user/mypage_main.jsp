<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="mypage_user.mainOrderRefundWish.model.vo.*, product.model.vo.*, board.notice.model.vo.PageInfo,java.util.ArrayList"%>
    
<%
	ArrayList<Morw> list = ((ArrayList<Morw>)request.getAttribute("list"));
	Member user = (Member) session.getAttribute("loginUser");
	ArrayList<Attachment> plist = (ArrayList<Attachment>) request.getAttribute("plist");
	PageInfo pi = (PageInfo)request.getAttribute("pi");
	
	int listCount = pi.getListCount();
    int currentPage = pi.getCurrentPage();
    int maxPage = pi.getMaxPage();
    int startPage = pi.getStartPage();
    int endPage = pi.getEndPage();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
    <br>
    <div class="container">
    <ul class="nav nav-pills nav-fill" align="left">
            <li class="nav-item">
            <%=user.getUserName() %>님은 <%=user.getGrade() %>등급입니다
            <a href="#" class="btn btn-secondary btn-sm active" role="button" aria-pressed="true">등급 혜택보기</a>&nbsp;
            <a href="<%=request.getContextPath()%>/views/mypage_user/mypage_point.jsp"  class="btn btn-outline-secondary btn-sm active" role="button" aria-pressed="true">마일리지: <%=user.getPoint() %> point</a>
            </li>
    </ul>
    <br>
    <br>
    
    <div class = "order-table">
            <div class="table-headline">
                <div><span><b>최근 주문내역</b></span></div>
            </div>
            <table style="width:100%" name="order-list">
                <thead>
                <tr>
                    <th>주문 번호</th>
                    <th>그림</th>
                    <th>상품명</th>
                    <th>금액</th>
                    <th>주문일자</th>
                    <th>주문 처리상태</th>
                </tr>
                </thead>
                <tbody>
                <%if(!list.isEmpty()){ %>
			  			<%for(Morw m:list){ %>
			    		<tr>
			    			<td><%=m.getOrderNo() %></td>
							<td><% for(int j=0; j<plist.size(); j++){ 
							Attachment a = plist.get(j); %>
						<% if(m.getPaintNo() == a.getPaint_no()) { %>
					 <img src="<%= request.getContextPath() %>/thumbnail_uploadFiles/<%= a.getSavefileName() %>" width="150px" height="150px">
					 <%
					 break;
						} %>
					<%} %></td>
			      			<td>작가 : <%=m.getArtistName()%><br>
			      			작품명 : <%=m.getPaintName()%></td>
			      			<td><%=m.getPaintPrice()%></td>
			      			<td><%=m.getOrderDate()%></td>
			      			<td><%=m.getOrderStatus()%></td>
			    		</tr>
			    		<%} %>
			    	<%} else{%>
			    	<%} %>
                </tbody>
            </table>
        </div>
       <br clear="both"><br>
		<!--  페이징 처리 시작! -->
      <div class="pageingArea" align="center">
      <!-- 맨 처음으로 (<<) -->
      <button class="btn btn-outline-dark" onclick="location.href='<%=request.getContextPath() %>/Mo.li?currentPage=1'"> << </button>
      
      <!-- 이전 페이지로(<) -->
      <%if(currentPage <= 1) {%>
      <button class="btn btn-secondary" disabled> < </button>
      <%}else{ %>
      <button class="btn btn-outline-dark" onclick="location.href='<%=request.getContextPath() %>/Mo.li?currentPage=<%=currentPage-1 %>'"> < </button>
       <%} %>
      <!-- 10개의 페이지 목록 -->
      <%for(int p = startPage ; p<=endPage;p++){ %>
     	 <%if(currentPage == p){ %>
     	 	<button class="btn btn-secondary" disabled><%=p %></button>
     	 <%}else{ %>
     	 	<button class="btn btn-outline-dark" onclick="location.href='<%=request.getContextPath() %>/Mo.li?currentPage=<%=p %>'"><%=p %></button>
     	 <%} %>
      <%} %>


      
      <!-- 다음 페이지로(>) -->
        <%if(currentPage == maxPage) {%>
      <button class="btn btn-secondary" disabled> > </button>
      <%}else{ %>
      <button class="btn btn-outline-dark" onclick="location.href='<%=request.getContextPath() %>/PM.list?currentPage=<%=currentPage+1 %>'"> > </button>
      <%} %>
      
      <!-- 맨 끝으로(>>) -->
      <button class="btn btn-outline-dark" onclick="location.href='<%=request.getContextPath() %>/PM.list?currentPage=<%= maxPage%>'"> >> </button>
      
      </div>
       
    </div>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
<%@include file="../common/footer.jsp" %>
</body>
</html>