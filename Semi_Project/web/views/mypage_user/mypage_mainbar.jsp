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
 <div class="jumbotron" align="center">
        <h1 class="display-4"><b>My page</b></h1>
        <br>
        <ul class="nav nav-pills nav-fill">
            <li class="nav-item">
              <a class="nav-link" href="#" onclick="test2();">회원정보</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="<%=request.getContextPath()%>/views/mypage_user/mypage_order.jsp">주문내역</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">장바구니</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">문의내역</a>
            </li>
        </ul>
    </div>

</body>
</html>