<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        <h3><b>주문 내역</b></h3>
        <hr>
    </div>
    
	<div class="container">
	
      <ul class="nav nav-tabs">
        <li class="nav-item">
          <a class="nav-link" href="#">주문내역조회</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="#">취소/환불내역</a>
        </li>
      </ul>

      <br>
      <br>

      <div class="form-row" align="center">
        
        <div class="btn-group-md" data-toggle="buttons">
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

        <div class="col-md-2 mb-3">
          <input type="date" class="form-control" id="validationDefault05" required>
        </div>
        ~
        <div class="col-md-2 mb-3">
            <input type="date" class="form-control" id="validationDefault06" required>
        </div>
        <div class="col-md-1 mb-2">
            <button class="btn btn-primary" type="submit">조회</button>
        </div>
    </div>
   
    <br>
    <br>
    <div>
        <h6>* 기본적으로 최근 3개월간의 자료가 조회되며, 기간 검색시 지난 내역을 조회할 수 있습니다.<br>
        </h6>
    </div>
    <br>
    <br>

      <table class="table table-sm">
        <h6><b>취소/환불</b></h6>
        <thead class="thead-light">
          <tr>
            <th scope="col">주문번호</th>
            <th scope="col">이미지</th>
            <th scope="col">상품정보</th>
            <th scope="col">수량</th>
            <th scope="col">상품구매금액</th>
            <th scope="col">주문처리상태</th>
            <th scope="col">취소/환불</th>
          </tr>
        </thead>
        <tbody>
        </tbody>
      </table>
   
      <br>
      <br>
    </div> 
    <br>
	<br>
	<br>
	<%@include file="../common/footer.jsp" %>
</body>
</html>