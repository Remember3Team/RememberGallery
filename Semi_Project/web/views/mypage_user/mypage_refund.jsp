<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="mypage_user.mainOrderRefundWish.model.vo.*, java.util.ArrayList"%>
    
<%
	ArrayList<Morw> list = ((ArrayList<Morw>)request.getAttribute("list"));
 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/Style-refund.css">
  
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
     
    
   
    <br>
    <br>
   

      <div class = "refund-table">
            <div class="table-headline">
                <div><span><b>취소 / 환불</b></span></div>
            </div>
            <table style="width:100%" name="order-list">
            	<thead>
                <tr>
                    <th>주문 번호</th>
                    <th>이미지</th>
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
							<td><%=m.getaFile() %></td>
			      			<td><%=m.getPaintName()%></td>
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
    <br>
	<br>
	<br>
	<%@include file="../common/footer.jsp" %>
</body>
</html>