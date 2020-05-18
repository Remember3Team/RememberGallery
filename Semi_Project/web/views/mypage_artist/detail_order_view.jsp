<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "mypage_artist.management.model.vo.*, board.notice.model.vo.PageInfo, java.util.ArrayList"%>
    <%
    	ArrayList<Mypage_artist> DOV_OP = (ArrayList<Mypage_artist>)request.getAttribute("DOV_OP");
    	ArrayList<Mypage_artist> DOV_D = (ArrayList<Mypage_artist>)request.getAttribute("DOV_D");
    	ArrayList<Mypage_artist> DOV_SI = (ArrayList<Mypage_artist>)request.getAttribute("DOV_SI");
    %>
<!DOCTYPE html>
<html lang='ko'>
    <head> 
        <meta charset="utf-8">
        <title>주문 상세 보기</title>
        <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
		  <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
		<script src="../js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="../js/bootstrap.js"></script> 
        <style>
            #mypage_text{
                font-size: 2em;
                margin-left: 100px;
                font-family:Verdana, Geneva, Tahoma, sans-serif;
            }
            #artist{
                margin-left: auto;
            }
            td{
                padding: 5px;
            }
            #info_change, #card_check{
                width: 150px;
            }  
            b{
                font-family:Verdana, Geneva, Tahoma, sans-serif;
            }
            #mypage_nav > ul > li > a{
                padding-left: 80px;
                padding-right: 80px;
                padding-top: 10px;
                padding-bottom: 10px;
                font-size: 1.2em;
                color: white;
                transition: all 0.5s;
            }
            #mypage_nav > ul > li > a:hover{
                color: rgb(182, 5, 5);
                font-weight: bold;
            }
           
            select:hover{
                border-color: royalblue;
            }
            select{
                transition: 0.5s;
            }
            td{
                text-align: center;
            }
            .info{
                margin-left: 200px;
            }
            #t{
                border: 1px solid black;
            }
        </style>
    </head>

    <body>
    <%@include file="../common/menubar.jsp" %>
	<%@include file="../common/mypagehead.jsp" %>
        
        
        <br><br>
        <h3 align="center">주문 상세 보기</h3>
        <br>
        <hr>

        <br><br><br>
        <form>
            <h3 class="info"><b>주문 상품</b></h3>
            <div class="container" >
                <table class="table table-dark table-striped  table-hover" >
                <tr >
                    <td>주문번호</td>
                    <td>이미지</td>
                    <td>상품정보</td>
                    <td>금액</td>
                    <td>처리상태</td>
                </tr>
                <% for(Mypage_artist ma : DOV_OP){ %>
                <tr>
                    <td><%=ma.getOrder_no() %></td>
                    <td><%=ma.getAfile() %></td>
                    <td>작품명 : <%=ma.getPaint_name() %><br> 작가명 : <%=ma.getArtist_name() %></td>
                    <td><%=ma.getPaint_price() %></td>
                    <td><%=ma.getOrder_status() %></td>
                </tr>
                <%} %>
            </table>
            </div>
            <br><br><br>
            <h3 class="info"><b>결제 정보</b></h3>
            <div class="container">
                <table class="table table-dark table-striped table-hover">
                    <tr>
                        <td>입금자</td>
                        <td>결제 방법</td>
                        <td>연락처</td>
                    </tr>
                    <% for(Mypage_artist ma : DOV_D){ %>
                    <tr>
                        <td><%=ma.getOrder_name() %></td>
                        <td><%=ma.getPay_type() %></td>
                        <td><%=ma.getOrder_phone() %></td>
                    </tr>
                    <%} %>
                </table>
            </div>
            <br><br><br>
            <h3 class="info"><b>배송 정보</b></h3>
            <div class="container">
                <table class="table table-dark table-striped table-hover">
                    <tr>
                        <td>수령인</td>
                        <td>배송지</td>
                        <td>배송 메시지</td>
                    </tr>
                    <% for(Mypage_artist ma : OM_list){ %>
                    <tr>
                        <td>경섭</td>
                        <td>서울시 중랑구</td>
                        <td>집 앞에 놔주세요!</td>
                    </tr>
                    <%} %>
                </table>
            </div>




        </form>
    <br><br><br><br><br><br><br><br><br>
	<br><br><br><br><br><br><br><br><br>
    <br><br><br><br><br><br><br><br><br>
	<br><br><br><br><br><br><br><br><br>


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    </body>
</html>
