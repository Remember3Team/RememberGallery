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
  <style>
            #title{
                text-align: center;
            }
            #t1{
                padding: 30px;
                margin-left: 10%;
                background-color: rgb(228, 227, 227);
            }
            td{
                padding-left: 115px;
                padding-right: 115px;
                padding-top: 30px;
            }
             b{
                font-size: x-large;
            }
            #artist{
                height: 50px;
                border-width: 5px;
                border-color: lavender;
                border-style:outset;
                border-top-left-radius:10px; 
                border-bottom-right-radius:10px;
                border-top-right-radius:10px;
                border-bottom-left-radius: 10px;
            }
            #category{
                height: 50px;
                width: 170px;
                border-width: 5px;
                border-color: lavender;
                border-style:outset;
                border-top-left-radius:10px; 
                border-bottom-right-radius:10px;
                border-top-right-radius:10px;
                border-bottom-left-radius: 10px;
            }
            #tag_search{
                height: 50px;
                width: 950px;
                border-width: 5px;
                border-color: lavender;
                border-style:outset;
                border-top-left-radius:10px; 
                border-bottom-right-radius:10px;
                border-top-right-radius:10px;
                border-bottom-left-radius: 10px;
            }
            #price{
                background-color: red;
            }
            #submit{
                height: 50px;
                width: 100px;
                border-width: 5px;
                border-color: lavender;
                background: lavenderblush;
                border-style:outset;
                border-top-left-radius:10px; 
                border-bottom-right-radius:10px;
                border-top-right-radius:10px;
                border-bottom-left-radius: 10px;
            }
        </style>
  
</head>
<body>

<%@include file="../common/menubar.jsp" %>
<br clear="both"><br>
       <h1 id="title">미술품 판매(가제)</h1>

        <div id="search">
            <form>
            <table id="t1">
                <tr>
                    <td><b>작가 명</b><br><input type="search" id="artist"></td>
                    <td><b>분류</b><br><select name="category" id="category">
                                <option value="figure painting">인물화</option>
                                <option value="landscape painting">풍경화</option>
                    </select></td>
                    <td><b id="p">가격</b><br><input type="range" id="price"></td>
                </tr>
                <tr>
                    <td colspan="3"><b>태그 검색</b><br><input type="search" id="tag_search" placeholder="내용을 입력해주세요">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit" id="submit">검색</button></td>
                    <td></td>
                </tr>
            </table>
        </form>

        </div>

   <br><br><br><br><br><br><br><br><br>
   <br><br><br><br><br><br><br><br><br>
   <br><br><br><br><br><br><br><br><br>
   <br><br><br><br><br><br><br><br><br>

<%@include file="../common/footer.jsp" %>
</body>
</html>