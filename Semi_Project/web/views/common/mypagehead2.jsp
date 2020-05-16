<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyPage Head</title>
<link rel="stylesheet" href="../css/Style-mypagehead.css">
</head>
<body>
	<div class="headline">
        <div class="headline-text">
            <hr>
            <h3 style="font-size: 20px;"><b>마이페이지</b></h3>
        </div>
    </div>
    
    <div class="second-menu">
        <ul>
            <li><a href="../mypage_user/mypage_info.jsp">회원 정보</a></li><a>|</a>
            <li><a href="../mypage_user/mypage_order.jsp">주문 내역</a></li><a>|</a>
            <li><a href="../mypage_user/mypage_refund.jsp">반품/환불</a></li><a>|</a>
            <li><a href="../mypage_user/mypage_wishlist.jsp">장바구니</a></li><a>|</a>
            <li><a href="<%= request.getContextPath() %>/qna">문의 내역</a></li>
        </ul>
    </div>
</body>
</html>