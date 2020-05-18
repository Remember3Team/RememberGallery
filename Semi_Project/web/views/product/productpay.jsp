<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "product.model.vo.*, java.util.ArrayList, board.notice.model.vo.*"%>
    <%
    	ArrayList<product> plist = (ArrayList<product>)request.getAttribute("list");
    %>
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
</head>
<style>
#order {
	display: inline-block;
	width: 760px;
	height: 100%;
	float: left;
	margin-left: 20px;
	margin-right: 0px;
	margin-top: 20px;
}

#what {
	display: inline-block;
	width: 320px;
	height: 896px;
	float: left;
	margin-left: 150px;
	margin-right: 0px;
	margin-top: 0px;
	background-color: rgb(224, 224, 224);
}
</style>
<body>
<%@include file="../common/menubar.jsp" %>
<table class="table">
  <thead>
    <tr>
      <th scope="col"></th>
      <th scope="col">상품명</th>
      <th scope="col">수량</th>
      <th scope="col">판매가</th>
      <th scope="col">배송비</th>
      <th scope="col">합계</th>
    </tr>
  </thead>
  <tbody>
      <tr>
      <th scope="row">
      <img class="rimage"
					src="${contextPath }/resources/images/slide3.jpg"
					style="width: 126px; height: 115px;">
      </th>
      <td ><a>이름 가져오기</a></td>
      <td><a>1</a></td>
      <td><a>판매가 가져오기</a></td>
      <td><a>배송비 가져오기</a></td>
      <td><a>합계</a></td>
    </tr>
  </tbody>
</table>
<br clear="both"><br>

<div id="order">
<form>
<h3 align="left">주문하시는 분</h3>
<table class="table table-borderless">
    <tr>
      <th scope="col">이름* &nbsp; &nbsp;
      <input type="text" id="name" placeholder="이름" size="10px" style="margin-left: 50px;" ></th>
    </tr>
    <tr>
      <th scope="row">핸드폰 &nbsp;
       <input type="text" id="name" placeholder="010-" size="10px" style="margin-left: 50px;" ></th>


    </tr>
    <tr>
      <th scope="row">E-mail
       <input type="email" id="email" placeholder="abc@abc.com" size="20px" style="margin-left: 62px;" ></th>

    </tr>
    <tr>
      <th>
       <input type="text" id="우편번호" placeholder="우편번호" size="10px" style="margin-left: 109px;" >
       <button>주소 검색</button>
       </th>
    </tr>
    <tr>
      <th scope="row">주소
       <input type="text" id="기본주소" placeholder="기본주소" size="20px" style="margin-left: 74px;" ></th>
    </tr>
     <tr>
      <th>
       <input type="text" id="상세주소" placeholder="상세 주소" size="20px" style="margin-left: 109px;" >
       </th>
    </tr>
</table>
<h3 align="left">받으시는 분</h3>
<table class="table table-borderless">
    <tr>
      <th scope="col">배송지 선택* &nbsp; &nbsp;
      <input type="radio" id="동일"style="margin-left: 50px;">주문자와 동일 
      <button>배송지 목록</button> 
      </th>
    </tr>
    <tr>
      <th scope="row">배송지명
       <input type="text" id="배송지명" size="10px" style="margin-left:41px;" ></th>
    </tr>
    <tr>
      <th scope="row">이름 &nbsp;&nbsp;
       <input type="text" id="name" placeholder="이름" size="10px" style="margin-left: 62px;" ></th>

    </tr>
     <tr>
      <th scope="row">핸드폰 &nbsp;
       <input type="text" id="name" placeholder="010-" size="10px" style="margin-left: 50px;" ></th>


    </tr>
    <tr>
      <th>
       <input type="text" id="우편번호" placeholder="우편번호" size="10px" style="margin-left: 109px;" >
       <button>주소 검색</button>
       </th>
    </tr>
    <tr>
      <th scope="row">주소
       <input type="text" id="기본주소" placeholder="기본주소" size="20px" style="margin-left: 74px;" ></th>
    </tr>
     <tr>
      <th>
       <input type="text" id="상세주소" placeholder="상세 주소" size="20px" style="margin-left: 109px;" >
       </th>
    </tr>
    <tr>
     <th scope="row">전하실 말씀 
      <textarea cols="" style="margin-left: 20px;"></textarea>
</table>
</form>
<br celar="both">
</div>
<div id="what">
<h3 align="left" style="margin-top: 30px; margin-left: 10px">결제 정보</h3>
<br>
<div style="background: white; margin-left:10px; width:300px">
<a>총 주문금액 (데이터값)</a>
</div>

<h3 align="left" style="margin-top: 30px; margin-left: 10px">결제 수단</h3>

<div style="margin-left:10px; width:300px">
<button style="background-color: white;"> 무통장 입금</button> 
<button style="background-color: white;"> 신용 카드</button> 
</div>

<h3 align="left" style="margin-top: 30px; margin-left: 10px">이용 약관 안내</h3>
<br>

<div style="background: white; margin-left:10px; width:300px">
<a>아름답고 소담스러운 열매를 맺어 우리 인생을 풍부하게 하는 것이다 보라 청춘을 ! 그들의 몸이 얼마나 튼튼하며

별과 같이 산야에 피어나는 군영과 같이 이상은 실로 인간의 부패를 방지하는 소금이라 할지니 인생에 가치를 주는 원질이 되는 것이다 그들은 앞이 긴지라 착목한는 곳이 원대하고 그들은 피가 더운지라 실현에 대한 자신과 용기가 있다 그러므로 그들은 이상의 보배를 능히 품으며 그들의 이상은 아름답고

열매를 맺어 우리 인생을 풍부하게 하는 것이다 보라 청춘을 ! 그들의 몸이 얼마나 튼튼하며 그들</a>
</div>

<br>

<div style="margin-left:10px; width:300px">
<button style="background-color: rgb(52, 152, 219);"> 주문하기</button> <br><br>
<button style="background-color: rgb(52, 152, 219);"> 취소</button> 
</div>


</div>
<br clear="both"><br>
<%@include file="../common/footer.jsp" %>

</body>
</html>