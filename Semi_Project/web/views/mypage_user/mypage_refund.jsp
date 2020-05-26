<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="mypage_user.mainOrderRefundWish.model.vo.*,product.model.vo.*,board.notice.model.vo.PageInfo, java.util.ArrayList"%>
    
<%
	ArrayList<Morw> list = ((ArrayList<Morw>)request.getAttribute("list"));
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
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
<link rel="stylesheet" href="<%= request.getContextPath() %>/views/css/bootstrap.css">
<link rel="stylesheet" href="<%= request.getContextPath() %>/views/css/Style-refund.css">
  
<script src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>
</head>
<body>
	<%@include file="../common/menubar.jsp" %>
	<%@include file="../common/mypagehead2.jsp" %>
	
	<div class="title">
        <h3><b>반품 / 환불</b></h3>
        <hr>
    </div>
	<div class="container">
      <form action="">
            <div class="search-bar">
                <div class="bar1">
                    <input type="text" name="order-status" list="status-list" placeholder=" 주문 처리 상태">
                    <datalist id="status-list">
                        <option>환불신청</option>
                        <option>환불완료</option>
                    </datalist>
                </div>
                <div class="btn-group" data-toggle="buttons">
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="today">오늘
                                </label>
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="week">1주일
                                </label>
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="month" >1개월
                                </label>
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="three_months" >3개월
                                </label>
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="six_months" >6개월
                                </label>
                            </div> 
                &nbsp;&nbsp;&nbsp;
                <div class="bar3">
                    <input type="date" name="refund-date1"> ~
                    <input type="date" name="refund-date1">
                </div>
                <button type="submit" class="btn btn-dark" style="width:70px">조회</button>
            </div>
        </form>
      <div class = "refund-table">
            <div class="table-headline">
                <div><span><b>취소 / 환불</b></span></div>
            </div>
            <table style="width:100%" name="order-list">
            	<thead>
                <tr>
                    <th>주문 번호</th>
                    <th>그림</th>
                    <th>상품정보</th>
                    <th>금액</th>
                    <th>처리상태</th>
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
					 <%} %>
					<%} %></td>
			      			<td>작가 : <%=m.getArtistName()%><br>
			      			작품명 : <%=m.getPaintName()%></td>
			      			<td><%=m.getPaintPrice()%></td>
			      			<td><%=m.getOrderStatus()%></td>
			    		</tr>
			    		<%} %>
			    	<%} else{%>
			    		
			    	<%} %>

                </tbody>

            </table>
        </div>
   
      <br>
      <br>
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