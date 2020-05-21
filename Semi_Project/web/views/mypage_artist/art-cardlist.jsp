<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "mypage_artist.RefundQnACard.model.vo.*, artistapply.model.vo.*, product.model.vo.*, java.util.ArrayList"%>
    
<%
	ArrayList<Message> mlist = (ArrayList<Message>) request.getAttribute("mlist");
	ArrayList<Attachment> alist = (ArrayList<Attachment>) request.getAttribute("alist");
	Apply aphoto = (Apply) request.getAttribute("aphoto");
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>감동 카드 확인하기</title>
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
                		location.href = "<%= request.getContextPath() %>/list.ac"
                			
                			
                	}
                </script>
            </div>
        </div>
    </div>
<%@include file="../common/mypagehead.jsp" %>
    <div class="title">
        <h3>감동 카드 확인</h3>
        <hr>
 	</div>
    <div class="container">
        <form action="">
            <div class="search-bar">
                <div class="bar1">
                    <input type="text" name="order-status" list="status-list" placeholder="테마">
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
        <div class = "card-table">
            <div class="table-headline" style="margin-top: 50px;">
                <!-- <div><span>카드 내역</span></div> -->
                <div class="button"><button class="btn btn-outline-dark" style = "width:120px;margin-bottom: 15px;" onclick="deleteCard()" >선택 삭제</button></div>
            </div>
            <table style="width:100%" name="card-list">
                <tr>
                    <th><input type="checkbox"></th>
                    <th style = "text-align : center;">상품 번호</th>
                    <th style = "text-align : center;">이미지</th>
                    <th style = "text-align : center;">상품 정보</th>
                    <th style = "text-align : center;">구매자 이름</th>
                    <th style = "text-align : center;">감동 카드</th>
                </tr>
                
                <% for(int i = 0 ; i < mlist.size(); i++){
                	Message m = mlist.get(i);
                %>
                <tr>
                    <td><input type="checkbox" name = "check" value="<%=m.getOrder_no()%>"></td>
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
    
    <script type="text/javascript">
    
    var arrayList = '';
    
    function deleteCard(){
    	
    	var checkboxList = $("input[name=check]:checked");
    	
    	arrayList = '';
    	
    	for(var i=0 ; i<checkboxList.length; i++) {
    		
    		if($(checkboxList[i]).is(":checked")){
    			console.log(i);
    			
    			// 마지막 값이 아니면
    			if(i != checkboxList.length-1){
    				arrayList += $(checkboxList[i]).val() + "," ;
    			} else {
    				arrayList += $(checkboxList[i]).val();
    			}
    			
    		}
    		
    	}
    	
    	console.log(arrayList);
    	
    
    
    // 하나도 체크가 안 됐을 경우
    if (arrayList == ''){
    	alert("한 가지 이상을 선택해 주세요.");
    } else {
    	if(!confirm("삭제하시겠습니까? 한번 삭제시 복구할 수 없습니다."))
    		return false;
    	
    	// post ajax 통신
    	
    	$.ajax({
    		type : "POST",
    		url : "list.ac",
    		data : {order_no : arrayList},
    		success : function(ret){
    			// 페이지 새로 고침
    			location.reload();
    		}
    	});
    }
    }
    
    </script>
    
    
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