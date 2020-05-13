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
            <h3 style="font-size: 20px;"> 작가 마이페이지</h3>
        </div>
        <div class="headline-subbox">
            <div class="artist-img">
                <!--Artist Image-->
                <img src="../img/artist.JPG" alt="artist-img">
            </div>
            <div class="artist-button">
                <button style="margin-bottom: 3px;">정보수정</button>
                <button>감동카드 확인</button>
            </div>
        </div>
    </div>
    
    <div class="second-menu">
        <ul>
            <li><a href="<%= request.getContextPath() %>/views/mypage_artist/product_management.jsp">상품 관리</a></li><a>|</a>
            <li><a href="<%= request.getContextPath() %>/views/mypage_artist/order_management.jsp">주문 관리</a></li><a>|</a>
            <li><a href="<%= request.getContextPath() %>/views/mypage_artist/shipping_management.jsp">배송 관리</a></li><a>|</a>
            <li><a href="<%= request.getContextPath() %>/views/mypage_artist/art-refund.jsp">반품 / 환불 관리</a></li><a>|</a>
            <li><a href="#">문의 내역</a></li>
        </ul>
    </div>
</body>
</html>