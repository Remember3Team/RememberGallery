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
                  		<svg class="bi bi-heart" width="1em" height="1em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
		  					<path fill-rule="evenodd" d="M8 2.748l-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 01.176-.17C12.72-3.042 23.333 4.867 8 15z" clip-rule="evenodd"/>
						</svg>
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