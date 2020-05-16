<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            <h3 style="font-size: 20px;">마이 페이지</h3>
        </div>
    </div>
    <br>
    <div class="container">
    <ul class="nav nav-pills nav-fill" align="left">
            <li class="nav-item">
            김다슬님은 _____등급입니다
            <a href="#" class="btn btn-secondary btn-sm active" role="button" aria-pressed="true">등급 혜택보기</a>&nbsp;
            <a href="#" class="btn btn-outline-secondary btn-sm active" role="button" aria-pressed="true">마일리지:0 point</a>
            </li>
    </ul>
    <br>
    
    <div class = "refund-table">
            <div class="table-headline">
                <div><span><b>최근 주문내역</b></span></div>
            </div>
            <table style="width:100%" name="refund-list">
                <tr>
                    <th></th>
                    <th>주문 번호</th>
                    <th>상품명</th>
                    <th>금액</th>
                    <th>주문일자</th>
                    <th>배송현황</th>
                </tr>
                <tr>
                    <td><input type="checkbox"></td>
                    <td>p0001</td>
                    <td>작품명 : Remember Me</td>
                    <td>10,000</td>
                    <td>2020-05-13</td>
                    <td>환불 요청</td>
                </tr>

            </table>
        </div>
        <br>
        <br>
        <div style="width : 350px; margin : 0 auto;">
        <div class="pagination">
            <a href="#" class="disabled" aria-label="Go to previous page">Previous</a>
            <ol>
              <li class="current-page">
                <a href="#" aria-label="Current page. Page 1">1</a>
              </li>
              <li>
                <a href="#" aria-label="Go to 2 page">2</a>
              </li>
              <li>
                <a href="#" aria-label="Go to 3 page">3</a>
              </li>
              <li>
                <button type="button" disabled>...</button>
              </li>
              <li>
                <a href="#" aria-label="Go to 7 page">7</a>
              </li>
              <li>
                <a href="#" aria-label="Go to 8 page">8</a>
              </li>
            </ol>
            <a href="#" aria-label="Go to next page">Next</a>
          </div>
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