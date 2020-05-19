<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "mypage_artist.RefundQnACard.model.vo.*, product.model.vo.*, java.util.ArrayList"%>
    
<%
	ArrayList<Message> mlist = (ArrayList<Message>) request.getAttribute("mlist");
	ArrayList<Attachment> alist = (ArrayList<Attachment>) request.getAttribute("alist");
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <!-- link rel="stylesheet" href="../css/style.css" -->
  <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/views/css/Style-refund.css">
   <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<%@include file="../common/menubar.jsp" %>
<%@include file="../common/mypagehead.jsp" %>
    <div class="title">
        <h3>감동카드</h3>
        <hr>
    </div>

    <div class="container">
        <form action="">
            <div class="search-bar">
                <div class="bar1">
                    <input type="text" name="order-status" list="status-list" placeholder=" 테마">
                    <datalist id="status-list">
                        <option value="풍경"></option>
                        <option value="인물"></option>
                        <option value="정물"></option>
                        <option value="동물"></option>
                        <option value="추상"></option>
                        <option value="팝아트"></option>
                        <option value="오브제"></option>
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
                    <input type="date" name="refund-date1"> ~
                    <input type="date" name="refund-date1">
                </div>
                <button type="submit">조회</button>
            </div>

        </form>
        <div class = "card-table">
            <div class="table-headline">
                <div><span>카드 내역</span></div>
                <div class="button"><button class="delete-bt" style = "width:120px">선택 삭제</button></div>
            </div>
            <table style="width:100%" name="card-list">
                <tr>
                    <th><input type="checkbox"></th>
                    <th style = "text-align : center;">상품 번호</th>
                    <th style = "text-align : center;">이미지</th>
                    <th style = "text-align : center;">상품 정보</th>
                    <th style = "text-align : center;">구매자 닉네임</th>
                    <th style = "text-align : center;">감동 카드</th>
                </tr>
                
                <% for(int i = 0 ; i < mlist.size(); i++){
                	Message m = mlist.get(i);
                %>
                <tr>
                    <td><input type="checkbox"></td>
                    <td><%=m.getPaint_no()%></td>
                    <td>
					 <% for(int j=0; j<alist.size(); j++){ 
							Attachment a = alist.get(j); %>
							
						<% if(m.getPaint_no() == a.getPaint_no()) { %>
					<img src="<%= request.getContextPath() %>/thumbnail_uploadFiles/<%= a.getSavefileName() %>" width="150px" height="150px">
					 <%} %>
					<%} %>
					</td>
                    <td>작품명 : <%=m.getPaint_name()%></td>
                    <td><%=m.getUser_name()%></td>
                    <td><%=m.getMessage()%></td>
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
    
<%@include file="../common/footer.jsp" %>


</body>
</html>