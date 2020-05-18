<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8" import = "product.model.vo.*, java.util.ArrayList"%>
<%

product plist = (product)request.getAttribute("plist");
Attachment alist = (Attachment)request.getAttribute("alist");
ArrayList<product> sizelist = (ArrayList<product>)request.getAttribute("sizelist");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- link rel="stylesheet" href="../css/style.css"-->
<link
   href="https://fonts.googleapis.com/css2?family=Roboto&display=swap"
   rel="stylesheet">
<link rel="stylesheet" href="../css/bootstrap.css">

<script src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script>
<style>
#sumnailimage {
   border: solid 1px;
   display: inline-block;
   width: 528px;
   height: 507px;
   margin-left: 191px;
   margin-right: 20px;
   margin-top: 20px;
   float: left;
}

#data {
   display: inline-block;
   width: 760px;
   height: 400px;
   float: left;
   margin-left: 20px;
   margin-right: 0px;
   margin-top: 20px;
}

#simulationMain {
   position : relative;<!--안에 이미지에 대한 기준-->
   border: solid 1px;
   display: inline-block;
   width: 369px;
   height: 358px;
   margin-left: 191px;
   margin-right: 20px;
   margin-top: 20px;
   float: left;
}
#simulation1{
border: solid 1px;
   display: inline-block;
   width: 121px;
   height: 125px;
   margin-left: 50px;
   margin-right: 20px;
   margin-top: 100px;
   float: left;
}
#simulation2{
border: solid 1px;
   display: inline-block;
   width: 121px;
   height: 125px;
   margin-left: 10px;
   margin-right: 20px;
   margin-top: 100px;
   float: left;
}
#simulation3{
border: solid 1px;
   display: inline-block;
   width: 121px;
   height: 125px;
   margin-left: 10px;
   margin-right: 20px;
   margin-top: 100px;
   float: left;
}

#writer {
   border: solid 1px;
   display: inline-block;
   width: 369px;
   height: 358px;
   margin-left: 191px;
   margin-right: 20px;
   margin-top: 20px;
   float: left;
}
#data2 {
   display: inline-block;
   width: 760px;
   height: 358px;
   float: left;
   margin-left: 10px;
   margin-right: 0px;
   margin-top: 100px;
}
</style>
</head>
<body>
   <%@include file="../common/menubar.jsp"%>
   <div id="sumnailimage">
      <img src="<%=request.getContextPath()%>/thumbnail_uploadFiles/<%= alist.getSavefileName() %>"
         style="width: 528px; height: 507px;">
   </div>
   <div id="data">
      <br>
      <br>
      <div id="title">
         <h3 align="left">작품명</h3>
      </div>
      <hr style="margin: 1;" color="black" width="554px">
      <a style="text-align: left; width: 100px; margin: 0; font-size: 20px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;">작가명 : <%=plist.getPaint_name()%></a>
       <a style="text-align: left; width: 100px; margin-left: 250px; font-size: 20px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;">카테고리 : <%=plist.getCategory() %></a><br> <br> <a
         style="text-align: left; width: 100px; margin: 0; font-size: 20px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;">제작년도 : <%=plist.getCategory() %></a> 
         <a
         style="text-align: left; width: 100px; margin-left: 230px; font-size: 20px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;">작품크기 : <% for(int i =0;i < sizelist.size();i++) {
         																																																	product p = sizelist.get(i);
         																																																	if(plist.getSize_no() == p.getSize_no() ){%>
         																																																	
         																																																		<%=p.getWidth()%> * <%=p.getHeight()%>
         																																																		
         																																																	<% }}%></a><br>    																																			
      <hr style="margin: 1;" color="black" width="554px">
      <br> <a style="text-align: left; width: 100px; margin-left: 500px; font-size: 20px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;"><%=plist.getPatint_price() %>원</a><br>
      <input type="button" value="바로 구매하기"
         style="background-color: rgb(224, 224, 224); margin-top: 10px;"
         onclick="location.href='<%=request.getContextPath()%>/views/product/productpay.jsp'">
      <br>
      <br> <input type="button" value="장바구니 담기"
         style="background-color: rgb(224, 224, 224); margin-right: 10px; text-decoration: none;"
         onclick="장바구니"> <br>
      <br> 
      <input type="button" value="Q & A"
         style="background-color: rgb(224, 224, 224); margin-right: 10px; text-decoration: none;"
         onclick="q&a"> <input type="hidden"
         value="" id="mid">
      <!-- <input type="hidden" value="${ movieDetail.movie_id }" id="movie_id"> -->
      <input type="hidden" value="" id="movie_id">
   </div>

   <br clear="both">
   <br>
   <hr style="margin-left: 191px;" color="black" width="1128px">
   <br clear="both">
   <h3 align="center">인테리어 시뮬레이션</h3>
   <div id="simulationMain">
      <img src="/resources/uploadFiles/"
         style="width: 369px; height: 358px;">
   </div>
   
   <div id="simulation1">
      <img src="/resources/uploadFiles/"
         style="width: 121px; height: 125px;">
   </div>
   <div id="simulation2">
      <img src="/resources/uploadFiles/"
         style="width: 121px; height: 125px;">
   </div>
   <div id="simulation3">
      <img src="/resources/uploadFiles/"
         style="width: 121px; height: 125px;">
   </div>
   <br clear="both">
   <hr style="margin-left: 191px;" color="black" width="1128px">
   <h3 align="center">작품 소개</h3>
   <a style="text-align: left; width: 100px; margin-left:300px; font-size: 15px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;">입벌려 글들어온다.</a>
   <br>
   <hr style="margin-left: 191px;" color="black" width="1128px">
   <h3 align="center">작가 소개</h3>
   <div id="writer">
      <img src="/resources/uploadFiles/"
         style="width: 369px; height: 358px;">
   </div>
   <div id="data2">
   <a style="text-align: left; width: 100px; margin-left:30px; font-size: 15px; text-decoration: none !important; border-bottom: dotted 0px !important; color: black !important;">입벌려 글들어온다</a>
   </div>
   <br clear="both">
   <hr style="margin-left: 191px;" color="black" width="1128px">
   <h3 align="center">Q & A</h3>
   <br clear="both">
   <%@include file="../common/footer.jsp"%>

</body>
</html>