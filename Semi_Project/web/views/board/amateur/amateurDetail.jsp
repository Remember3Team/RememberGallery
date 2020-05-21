<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.amateur.model.vo.*, java.util.ArrayList"%>
<%
	Amateur a = (Amateur)request.getAttribute("amateur");
	FileManagement fm = (FileManagement)request.getAttribute("fileList");
	ArrayList<Reply> rList = (ArrayList<Reply>)request.getAttribute("rList");
	
	System.out.println("[jsp] 출력 결과 : "+rList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%=a.getEvent_title() %></title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/style.css">
 <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
 <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/bootstrap.css">
<script src="<%=request.getContextPath() %>/views/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/views/js/bootstrap.js"></script>    
<style>
	#detailArea div{ margin:0 auto; margin-top:100px; width:80%;}
</style>
</head>
<body>
<!-- header -->
<%@include file="../../common/menubar.jsp" %>


<body>
 	 <div class="container"> 
         <div class="row" id="detailArea">
            <div class="cols-sm-6">
               <table align="center" class="table">
                  <tr>
                     <td>제목</td>
                     <td colspan="4"><span><%=a.getEvent_title() %></span></td>
                  </tr>
                  <tr>
                     <td>작성자</td>
                     <td><span><%=a.getUser_id() %></span></td>
                     
                     <td>작성일</td>
                     <td><span><%=a.getEvent_date() %></span></td>
                  </tr>
                  <tr>
                     <td colspan="4"><span>내용</span></td>
                  </tr>
                  <tr>
                     <td colspan="4">
                        <p>
                           <%=a.getEvent() %>
                        </p>
                        <p>
                        	<a href="#">
			             		<img src="<%=request.getContextPath() %>/thumbnail_uploadFiles/amateur/<%=fm.getEvent_file() %>" alt="">
			             	</a>
                        </p>
                     </td>
                  </tr>
                  <tr>
                  	<td> 좋아요 </td>
                  	<td> 
                  		<div style="float:right; onclick="emptyheartCheck();" class="emptyheartCheck">
      						<input id="paint_no" type="hidden" value="<%=a.getEvent_like()%>">
      						<img src="<%=request.getContextPath()%>/views/img/emptyHeart.png">
      					</div>
					</td>
                  </tr>
                  <br><br><br>
                  <tr>
					<td>댓글작성</td>
					<td><textArea rows="5" cols="80" id="replyContent"></textArea></td>
					<td>
						<button id="addReply" type="button active" class="btn btn-secondary" style="width:100px;">댓글등록</button>
					</td>
				  </tr>
				  <br><br>
				</table>
				<script>
					$(function(){
						$(".colorheartCheck").click(function(){
							var paint_no = $("#paint_no").val();
							
							$(".colorheartCheck").hide();
							$(".emptyheartCheck").hide();
							
							location.href="<%=request.getContextPath()%>/delete.am?paint_no+'paint_no'";
						});
						
						
					})
				</script>
       <div id="replySelectArea">
			<table id="replySelectTable" class="table" align="center">
				<% if(rList.isEmpty()) { %>
					<tr><td colspan="3">댓글이 없습니다.</td></tr>
					
				<% }else { %>
					<% for(int i=rList.size()-1; i>=0; i--){ %>
						<tr>
							<td width="100px"><%= rList.get(i).getUser_id() %></td>
							<td width="400px"><%= rList.get(i).getReply() %></td>
							<td width="200px"><%= rList.get(i).getReply_date() %></td>
						</tr>
					<% } %>
				<% } %>
			</table>
		</div>
            </div><!-- cols-sm-6 div end -->
         </div><!-- row div end -->
       </div><!-- container div end -->
 
		<button id="goAmateurBoard" type="button active" class="btn btn-secondary" onclick="location.href='<%=request.getContextPath()%>/views/board/amateur/amateurBoard.jsp'">목록으로 가기</button>
   </body>

	<script>
		$(function(){
			$("#addReply").click(function(){
				var writer = "<%=loginUser.getUserId()%>";
				var bid = <%=a.getEvent_no()%>;
				var content = $("#replyContent").val();
				
				$.ajax({
					url:"insertReply.am",
					type:"post",
					data:{writer:writer,content:content,bid:bid},
					success:function(data){
						$replyTable = $("#replySelectTable");
						$replyTable.html("");
						for(var key in data){
							var $tr = $("<tr>");
							var $writerTd = $("<td>").text(data[key].user_id).css("width","100px");
							var $contentTd =$("<td>").text(data[key].reply).css("width","400px");
							var $dateTd = $("<td>").text(data[key].reply_date).css("width","200px");
							
							$tr.append($writerTd);
							$tr.append($contentTd);
							$tr.append($dateTd);
							$replyTable.append($tr);
						}
						$("#replyContent").val("");  
					},
					error:function(request,statur,error){
						alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error"+error);
					}
				})
			})
		})
	</script>
<!-- footer -->	
<%@include file="../../common/footer.jsp" %>

</body>
</html>