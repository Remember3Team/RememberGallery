<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Navigation에서 Notice>공지사항 눌렀을 때 나오는 페이지 (계연) -->
<button onclick="location.href='<%=request.getContextPath()%>/views/board/notice/noticeInsert.jsp'">게시글 작성</button>

</body>
</html>