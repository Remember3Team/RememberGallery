<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% Member user = (Member) session.getAttribute("loginUser"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/Style-mypagehead.css">
  <link rel="stylesheet" href="../css/Style-refund.css">

  
<script src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>
</head>
<body>
	<%@include file="../common/menubar.jsp" %>
	<div class="headline">
        <div class="headline-text">
            <hr>
            <h2 style="font-size: 20px;"><b>마일리지</b></h2>
            <h2 style="font-size: 15px;">고객님의 적립포인트입니다.</h2>
        </div>
    </div>
    
    <div class="second-menu">
        <ul>
            <li>총 적립포인트</li>
            <li><a href="#" class="btn btn-secondary btn-sm active" role="button" aria-pressed="true"><%=user.getPoint()%> point</a></li><a>|</a>
            <li>회원등급</a></li>
            <li><a href="#" class="btn btn-outline-secondary btn-sm active" role="button" aria-pressed="true"><%=user.getGrade() %></a>
        </ul>
    </div>

    
    
    <br>
    <div class= "container">
     <div class = "point-table">
            <div class="table-headline">
                <div><span><b>적립내용보기</b></span></div>
            </div>
            <table style="width:100%" name="order-list">
                <tr>
                    <th>관련주문</th>
                    <th>주문일자</th>
                    <th>적립 포인트</th>
                    <th>적립 내용</th>
                </tr>
                <tr>
                    <td>p0001</td>
                    <td>2020-05-13</td>
                    <td>120p</td>
                    <td>10만원 이상 구매</td>
                </tr>

            </table>
        </div>
        </div>
    <br>
	<br>
	<br>
	<%@include file="../common/footer.jsp" %>
</body>
</html>