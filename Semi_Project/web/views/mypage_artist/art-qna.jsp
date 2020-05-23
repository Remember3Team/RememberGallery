<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "mypage_artist.RefundQnACard.model.vo.*, artistapply.model.vo.*, product.model.vo.*, java.util.ArrayList"%>
    
<%
	ArrayList<QnA_Q> qnalist = (ArrayList<QnA_Q>) request.getAttribute("qnalist");
	ArrayList<Attachment> alist = (ArrayList<Attachment>) request.getAttribute("alist");
	Apply aphoto = (Apply) request.getAttribute("aphoto");
	
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
<title>문의 내역</title>
 <!-- link rel="stylesheet" href="../css/style.css" -->
  <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
<link rel="stylesheet" href="<%=request.getContextPath()%>/views/css/Style-refund.css">
   <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>
</head>
<body>
<%@include file="../common/menubar.jsp" %>
<div class="headline">
        <div class="headline-text">
            <hr>
            <h3 style="font-size: 20px;"> 작가 마이페이지</h3>
        </div>
        <div class="headline-subbox">
            <div class="artist-img">
                <!--Artist Image-->
				<img src="<%= request.getContextPath() %>/apply_uploadFiles/<%= aphoto.getArtist_pro() %>" style="width:83px; height :83px;">
           </div>
            <div class="artist-btn" style = "display: inline-block; vertical-align: middle;
            ">
                <button class="btn btn-outline-dark" style = "width:120px; display:block; margin-bottom:5px;" onclick="checkCard();">정보 수정</button>
                <button class="btn btn-outline-dark" style = "width:120px; display:block;margin-top:5px;" onclick="checkCard();">감동 카드</button>
                <script>
                	function checkCard() {
                		location.href = "<%= request.getContextPath() %>/list.ac" }
                	
         
                </script>
            </div>
        </div>
    </div>
<%@include file="../common/mypagehead.jsp" %>


    <div class="title">
        <h3>문의 내역</h3>
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
                 <div class="btn-group" data-toggle="buttons" style="vertical-align : inherit;">
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
                <button type="submit" class="btn btn-outline-dark" style = "margin : 10px 0; width:100px">조회</button>
            </div>

        </form>
        <div class = "artq-table">
            <div class="table-headline">
                <!-- <div><span>문의 내역</span></div> -->
<!--                 <div class="button"><button class="btn btn-outline-dark" style = "width:120px">선택 삭제</button></div> -->
            </div>
            <table style="width:100%" name="question-list">
                <tr>
                    <!-- <th style = "text-align : center;"><input type="checkbox"></th> -->
                    <th style = "text-align : center;">상품 번호</th>
                    <th style = "text-align : center;">이미지</th>
                    <th style = "text-align : center;">상품 정보</th>
                    <th style = "text-align : center;">문의 날짜</th>
                    <th style = "text-align : center;">문의 내용</th>
                    <th style = "text-align : center;">문의자 아이디</th>
                    <th style = "text-align : center;">답변 상태</th>
                </tr>
                
                <% for(int i = 0 ; i < qnalist.size(); i++){
                	QnA_Q q = qnalist.get(i);
                %>
                
                <tr>
                    <td class = "tdFirst"><%=q.getPaint_no()%></td>
                    <td>
                     <% for(int j=0; j<alist.size(); j++){ 
							Attachment a = alist.get(j); %>
							
						<% if(q.getPaint_no() == a.getPaint_no()) { %>
					<img src="<%= request.getContextPath() %>/thumbnail_uploadFiles/<%= a.getSavefileName() %>" width="150px" height="150px">
					 <%} %>
					<%} %>
                    </td>
                    <td>작품명 : <%=q.getPaint_name()%></td>
                    <td><%=q.getPq_date()%></td>
                    <td><%=q.getPquestion()%></td>
                    <td><%=q.getUser_id() %></td>
                    <td>
                    <%
                    if(q.getPq_yn().equals("Y")) { %>
                    
					  답변 완료
					          
                    <%} else {%>
                    	<button class="btn btn-outline-dark goanswer"  style = "width:100px">답변하기</button>
                    <%} %>
                    </td>
                    <!-- <td><button class="btn btn-outline-dark" style = "width:100px">답변하기</button></td> -->
                </tr>
			<%} %>
            </table>
            
        </div>
        <script>

        
        
        $(function(){
	 		$(".goanswer").click(function(){
	 			
	 			var paint_no = $(this).parent().parent().children().eq(0).text();
	 			
	 			console.log(paint_no);
	 			
	 			location.href="<%=request.getContextPath()%>/detail.po?paint_no="+paint_no;
	 		});
	 		
	 	});
    	
        </script>
        
    </div>

		<div class = "p-parents">
	<div class="pppp">
			<%if (currentPage == 1) { %>
            <a style = "color:#9c9c9c; "  disabled>Previous</a>
            <%}else {%>
            <a class = "page-a" href="<%=request.getContextPath() %>/list.qna?currentPage=<%=currentPage - 1 %>" >Previous</a>
            <%} %>
            <ol>
            <%for(int p = startPage ; p<=endPage ; p++){ %>
            <%if(currentPage == p){ %>
              <li class = "page-list1"><button disabled class = "page-cur" ><%=p%></button></li>
            <%} else { %>
              <li class = "page-list2" onclick="location.href='<%=request.getContextPath() %>/list.qna?currentPage=<%=p%>'"><button class = "page-nocur"><%=p%></button></li>
            <%} %>
            <%} %>
            </ol>
            <%if (currentPage == maxPage) { %>
            <a style = "color:#9c9c9c; "  disabled>Next</a>
            <%} else { %>
            <a class = "page-a" href="<%=request.getContextPath()%>/list.qna?currentPage=<%=currentPage + 1%>">Next</a>
            <%} %>
          </div>
	</div>



<%@include file="../common/footer.jsp" %>
</body>
</html>