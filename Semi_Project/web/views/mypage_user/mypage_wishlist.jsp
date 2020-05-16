<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
 <link rel="stylesheet" href="../css/Style-mypagehead.css">
 <link rel="stylesheet" href="../css/Style-wishlist.css">
  
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
        <h4>* 장바구니에 담긴 상품은 30일까지 보관됩니다.</h4>
    </div>

    <br>
    <br>

    <div class = "wishlist-table">
            <div class="table-headline">
                <div><span><b>관심상품</b></span></div>
            </div>
            <table style="width:100%" name="order-list">
                <tr>
                	<th>　</th>
                    <th>상품명</th>
                    <th>작가</th>
                    <th>금액</th>
                </tr>
                <tr>
                	<td><input type="checkbox"></td>
                    <td>별이 빛나는 밤에</td>
                    <td>반 고흐</td>
                    <td>1000</td>
                </tr>

            </table>
        </div>

      <br>
      <br>
      <button type="submit" class="btn btn-dark" style="width:100px"><a href="#">쇼핑 계속하기</a></button>
      <button type="submit" class="btn btn-dark" style="width:100px">선택상품 삭제</button>
      <button type="submit" class="btn btn-dark" style="width:100px; float:right; marigin-left:5px;">선택상품 주문</button>
      <button type="submit" class="btn btn-dark" style="width:100px; float:right;">전체상품 주문</button>
    </div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<%@include file="../common/footer.jsp" %>
</body>
</html>