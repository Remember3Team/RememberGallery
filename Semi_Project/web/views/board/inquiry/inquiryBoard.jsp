<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/style.css">
 <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
 <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/views/js/bootstrap.js"></script>    
</head>
<style>
	#centerDiv{margin-top:70px;}
</style>
<body>
<%@include file="../../common/menubar.jsp" %>

<div id="centerDiv" class="container">
            <table class="table" style="width:800px; height:300px;">
                <thead>
                    <tr>
                        <th>
                            <select>
                                <option>배송문의</option>
                                <option>환불문의</option>
                                <option>쇼핑몰 오류</option>
                            </select>
                        </th>
                        
                        <th colspan="4"><span style="float:right">2020-05-19</span></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><input type="text" placeholder="제목을 입력해주세요(제목은 사이트 이용회원 모두 확인 가능합니다.)" style="width:1070px;"></td>
                    </tr>
                    <tr>
                        <td colspan="4"><textarea cols="150" rows="10"></textarea></td>
                        <td colspan="4"><span style="float:right;"><button style="width:100px; height:238px;">제출하기</button></span></td>
                    </tr>
                    <tr>
                    </tr>
                </tbody>
            </table>
            <table class="table">
                <div class = "test1" style="width:1200px;">
                   
                        <div>아이디</div>
                        <div>배송문의</div>
                        <div style = "float: right;">2020-05-19</div>
                        <br clear="both">
                        
                </div>
                <tbody style="display:blcok">
                    <div style="margin-top:30px;">
                        배송 도대체 언제오는거죠????
                    </div>
                    <tr>
                        <td colspan="2"><textarea cols="150" rows="5"></textarea></td>
                        <td><span style="float:right;"><button style="width:100px; height:125px;">제출하기</button></span></td>
                    </tr>
                </tbody>
            </table>


        </div>

<%@include file="../../common/footer.jsp" %>

</body>
</html>