<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="../css/bootstrap.css">
  
<script src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>
</head>
<body>
	<%@include file="../common/menubar.jsp" %>
	<%@include file="../mypage_user/mypage_mainbar.jsp" %>


    
    <div class="container">
    <ul class="nav nav-pills nav-fill" align="left">
            <li class="nav-item">
            김다슬님은 _____등급입니다
            <a href="#" class="btn btn-secondary btn-sm active" role="button" aria-pressed="true">등급 혜택보기</a>&nbsp;
            <a href="#" class="btn btn-outline-secondary btn-sm active" role="button" aria-pressed="true">마일리지:0 point</a>
            </li>
    </ul>
    <br>

    

    <table class="table table-sm">
      <h6><b>최근 주문내역</b></h6>
        <thead class="thead-light">
          <tr>
            <th scope="col">주문번호</th>
            <th scope="col">상품명</th>
            <th scope="col">결제금액</th>
            <th scope="col">주문일자</th>
            <th scope="col">배송현황</th>
          </tr>
        </thead>
        <tbody>
        </tbody>
      </table>
    </div>

	<%@include file="../common/footer.jsp" %>
</body>
</html>