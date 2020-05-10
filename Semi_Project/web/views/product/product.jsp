<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="../css/style.css">
  <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="../css/bootstrap.css">
  
<script src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script> 
  <style>
 #search{
    background-color: rgb(224, 224, 224);
}
.rul {
	margin-right: 20px;
	margin-left: 20px;
	height: 400px;
	padding-left: 190px;
}
.rank {
	display: inline-block;
	background: #fff;
	width: 20%;
	height: 90%;
	margin-right: 20px;
	margin-top: 20px;
	
}
.mname {
	width: 100%;
	height: 50px;
	text-align: center;
}
  </style>
  
</head>
<body>

<%@include file="../common/menubar.jsp" %>
<br clear="both"><br>

       <h1 align="center">미술품 판매(가제)</h1>

        <div id="search">
            <form>
            <table class="table table-borderless">
            <tr>
            <td></td>
            </tr>
                <tr>
                	<td></td>
                    <td><b>작가 명</b><br><input type="search" id="artist"></td>
                    <td><b>테마</b><br><select name="category" id="category">
                                <option value="figure painting">인물</option>
                                <option value="landscape painting">풍경</option>
                                <option value="landscape painting">인물</option>
                                <option value="landscape painting">정물</option>
                                <option value="landscape painting">동물</option>
                                <option value="landscape painting">추상</option>
                                <option value="landscape painting">팝아트</option>
                                <option value="landscape painting">오브제</option>
                    </select></td>
                    <td></td>
                    <td></td>
                    <td><b>가격</b><br><input type="range" id="price" min="0" max="100000000" step="10000" value="0">
                    <br><a>1</a></td>
                </tr>
                <tr>
                	<td></td>
                    <td><b>태그 검색</b><br><input type="search" id="tag_search" placeholder="내용을 입력해주세요">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><button type="submit" id="submit">검색</button></td>
                    <td></td>
                </tr>
            </table>
        </form>
        </div>
        <p class="h3">전체</p>
        <br clear="both">
        <div>
			<ul class="rul">
				<li class="rank"><img class="rimage"
					src="${contextPath }/resources/images/slide1.jpg"
					style="width: 100%; height: 70%;">
					<div class="mname">
						<!-- 샘플 -->
						<p>그림1</p>
					</div>
					<div>
						<button id="detail" onclick="location.href=''">상세보기</button>
						<!-- view구현 할 사람 여기 사용 -->
						<button id="book" onclick="location.href='moviePay.mo'">구매하기</button>
						<!-- 영화 리스트에서 view연결 할 사람 여기로 -->
					</div></li>
				<li class="rank"><img class="rimage"
					src="${contextPath }/resources/images/slide2.jpg"
					style="width: 100%; height: 70%;">
					<div class="mname">
						<p>그림2</p>
					</div>
					<div>
						<button id="detail">상세보기</button>
						<button id="book" onclick="location.href='moviePay.mo'">구매하기</button>
					</div></li>
				<li class="rank"><img class="rimage"
					src="${contextPath }/resources/images/slide3.jpg"
					style="width: 100%; height: 70%;">
					<div class="mname">
						<p>그림3</p>
					</div>
					<div>
						<button id="detail">상세보기</button>
						<button id="book" onclick="location.href='moviePay.mo'">구매하기</button>
					</div></li>
				<li class="rank"><img class="rimage"
					src="${contextPath }/resources/images/slide4.jpg"
					style="width: 100%; height: 70%;">
					<div class="mname">
						<p>그림4</p>
					</div>
					<div>
						<button id="detail">상세보기</button>
						<button id="book" onclick="location.href='moviePay.mo'">구매하기</button>
					</div></li>
			</ul>
		</div>

   <br><br><br><br><br><br><br><br><br>

<%@include file="../common/footer.jsp" %>
</body>
</html>