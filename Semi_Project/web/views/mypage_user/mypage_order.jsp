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
	<div class="jumbotron" align="center">
        <h1 class="display-4"><b>Order</b></h1>
        <br>
       
        <nav class="nav nav-pills nav-fill">
            <a class="nav-item nav-link" href="#">회원정보</a>
            <a class="nav-item nav-link active" href="#">주문내역</a>
            <a class="nav-item nav-link" href="#">장바구니</a>
            <a class="nav-item nav-link" href="#">문의내역</a>
        </nav>

    </div>
    <div class="container">
      <ul class="nav nav-tabs">
        <li class="nav-item">
          <a class="nav-link active" href="#">주문내역조회</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">취소/환불내역</a>
        </li>
      </ul>

      <br>
      <br>

      <div class="form-row" align="center">
        <div class="col-md-2 mb-1">
          <select class="custom-select" id="validationDefault04" required>
            <option selected disabled value="">전체주문처리상태</option>
            <option>입금전</option>
            <option>배송준비중</option>
            <option>배송중</option>
            <option>배송완료</option>
            <option>환불신청</option>
            <option>환불완료</option>
          </select>
        </div>
        <div class="btn-group-md btn-group-toggle" data-toggle="buttons">
          <label class="btn btn-secondary ">
            <input type="radio" name="options" id="option1" >오늘 
          </label>
          <label class="btn btn-secondary ">
            <input type="radio" name="options" id="option2" >일주일
          </label>
          <label class="btn btn-secondary">
            <input type="radio" name="options" id="option3" >1개월
          </label>
          <label class="btn btn-secondary">
            <input type="radio" name="options" id="option3" >3개월
          </label>
          <label class="btn btn-secondary">
            <input type="radio" name="options" id="option3" >6개월
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
        * 취소/환불 신청은 수령확인 버튼을 누르면 진행됩니다.
        </h6>
    </div>
    <br>
    <br>

      <table class="table table-sm">
        <h6><b>주문 상품정보</b></h6>
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
	
	<%@include file="../common/footer.jsp" %>
</body>
</html>