<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "mypage_artist.management.model.vo.*, board.notice.model.vo.PageInfo, java.util.ArrayList"%>
    <%
    	ArrayList<Mypage_artist> PM_list = (ArrayList<Mypage_artist>)request.getAttribute("PM_list");
    	PageInfo pi = (PageInfo)request.getAttribute("pi");
    	
    	int listCount = pi.getListCount();
    	int currentPage = pi.getCurrentPage();
    	int maxPage = pi.getMaxPage();
    	int startPage = pi.getStartPage();
    	int endPage = pi.getEndPage();
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품관리</title>
 <!-- link rel="stylesheet" href="../css/style.css" -->
  <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="../css/bootstrap.css">
  <link rel="stylesheet" href="../css/Style-refund.css">
<script src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script> 

</head>

<body>
<%@include file="../common/menubar.jsp" %>
<%@include file="../common/mypagehead.jsp" %>
    <div class="title">
        <h3>상품관리</h3>
        <hr>
    </div>

    <div class="container">
        <form action="">
            <div class="search-bar">
                <div class="bar1">
                    <input type="text" name="order-status" list="genre" placeholder="테마">
                    <datalist name="genre" id="genre">
                                <option value="인물">인물</option>
                                <option value="풍경">풍경</option>
                                <option value="정물">정물</option>
                                <option value="동물">동물</option>
                                <option value="추상">추상</option>
                                <option value="팝아트">팝아트</option>
                                <option value="오브제">오브제</option>
                            </datalist>  
                </div>
                <div class="btn-group" data-toggle="buttons">
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="today">오늘
                                </label>
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="week">1주일
                                </label>
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="month" >1개월
                                </label>
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="three_months" >3개월
                                </label>
                                <label class="btn btn-outline-dark">
                                    <input type="radio" name="term" value="six_months" >6개월
                                </label>
                            </div> 
                &nbsp;&nbsp;&nbsp;
                <div class="bar3">
                    <input type="date" name="refund-date1"> 
                    <input type="date" name="refund-date1">
                </div>
                <button type="submit" class="btn btn-dark" style="width:70px">조회</button>
            </div>

        </form>
        <div class = "refund-table">
            <div class="table-headline">
                <div><span>상품관리</span></div>
                <div class="button"><button class="btn btn-outline-dark" style = "width:100px">선택삭제</button></div>
                <div class="button"><button class="btn btn-outline-dark" style = "width:100px" onclick="registration();">상품등록</button></div>
                </div>
                <script>
               function registration(){
            	   location.href="<%=request.getContextPath() %>/views/mypage_artist/art-registration.jsp";
               }
                </script>
                
            <table style="width:100%" name="refund-list">
                <tr>
                    <th><input type="checkbox"></th>
                    <th>상품 번호</th>
                    <th>이미지</th>
                    <th>상품 정보</th>
                    <th>금액</th>
                    <th>수정 및 삭제</th>
                </tr>
                <% for(Mypage_artist ma : PM_list){ %>
                <tr>
                    <td><input type="checkbox"></td>
                    <td><%=ma.getPaint_no() %></td>
                    <td><%=ma.getAfile() %></td>
                    <td><%=ma.getPaint_int() %></td>
                    <td><%=ma.getPaint_price() %></td>
                    <td><button class="btn btn-outline-dark" id="detail_order" style = "width:100px">내용수정</button>
                    	&nbsp;<button class="btn btn-outline-dark" id="detail_order" style = "width:100px">삭제</button>
                    </td>
                </tr>
				<%} %>
            </table>
        </div>
        
    </div>
    <div style="width : 350px; margin : 0 auto;">
        <div class="pagination">
            <a href="#" class="disabled" aria-label="Go to previous page">Previous</a>
            <ol>
              <li class="current-page">
                <a href="#" aria-label="Current page. Page 1">1</a>
              </li>
              <li>
                <a href="#" aria-label="Go to 2 page">2</a>
              </li>
              <li>
                <a href="#" aria-label="Go to 3 page">3</a>
              </li>
              <li>
                <button type="button" disabled>...</button>
              </li>
              <li>
                <a href="#" aria-label="Go to 7 page">7</a>
              </li>
              <li>
                <a href="#" aria-label="Go to 8 page">8</a>
              </li>
            </ol>
            <a href="#" aria-label="Go to next page">Next</a>
          </div>
        </div>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<%@include file="../common/footer.jsp" %>
</body>
</html>