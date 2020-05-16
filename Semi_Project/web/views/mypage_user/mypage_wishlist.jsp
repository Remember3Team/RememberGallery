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
	<%@include file="../common/mypagehead2.jsp" %>
	
	
    <div class="title">
        <h3><b>장바구니</b></h3>
        <hr>
    </div>
  

    <div class="container">
    <div>
        <h6>* 장바구니에 담긴 상품은 30일까지 보관됩니다.</h6>
    </div>

    <br>
   

    <table class="table table-sm">
        <thead class="thead-light">
          <tr>
            <th scope="col">상품명</th>
            <th scope="col">가격</th>
          </tr>
        </thead>
        <tbody>
        </tbody>
      </table>

      <br>
      <br>
      <button class="btn btn-primary btn-sm" type="submit">쇼핑 계속하기</button>
      <button class="btn btn-primary btn-sm float-right" type="submit">선택상품주문</button>&nbsp;&nbsp;
      <button class="btn btn-primary btn-sm float-right" type="submit" >전체상품주문</button>
    </div>
    <br>
    <br>
    <br>
	<%@include file="../common/footer.jsp" %>
</body>
</html>