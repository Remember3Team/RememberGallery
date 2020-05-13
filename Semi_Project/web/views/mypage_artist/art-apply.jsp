<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제휴 신청</title>
 <!-- link rel="stylesheet" href="../css/style.css" -->
  <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="../css/Style-apply.css">
<script src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script> 
</head>
<body>
<%@include file="../common/menubar.jsp" %>
<div class = headline>
        <hr>
        <h3 style="font-size: 20px;"> 작가 제휴 신청 </h3>
    </div>

    <div class="container">
        <form action="#" style="padding-bottom: 100px;">
            <h3>프로필</h3>
            <hr>
            <div>
                <div class="introduce-box">
                    <div class="introduce-area">
                        <label class="label-first" for="introduce">자기 소개</label>
                        <textarea class="textarea-introduce" name="introduce"></textarea>
                    </div><div class="image-box">
                        <a style="font-size: 80%; margin-bottom: 10px; display: inline-block;">사진 업로드</a>
                        <label for="file"> 사진 업로드</label>
                        <input type="file" id="file">
                        <!-- <input class="upload-name" value="파일선택"> -->
                    </div>
                </div>
                <br>
                <h3>경력사항 작성</h3>
                <hr>
                <div class="career-box">
                    <div class="career-1">
                        <label class="label-first" for="career-p1">기간</label>
                        <input type="text" name="career-p1" id="carrea-p1">
                    </div>
                    <div class="career-2">
                        <label class="label-first" for="career1">경력 내용</label>
                        <input type="text" name="career1" id="carrea1">
                    </div>
                </div>
                <div class="career-box2">
                    <div class="career-1">
                        <input type="text" name="career-p2" id="carrea-p2">
                    </div>
                    <div class="career-2">
                        <input type="text" name="career2" id="carrea2">
                    </div>
                </div>
                <div class="career-box3">
                    <div class="career-1">
                        <input type="text" name="career-p3" id="carrea-p3">
                    </div>
                    <div class="career-2">
                        <input type="text" name="career3" id="carrea3">
                    </div>
                </div>
                <div class="etc-box">
                    <label class="label-first" for="etc" >기타 이력</label>
                    <div class="etc-area">
                        <textarea class="textarea-etc" name="etc"></textarea>
                    </div>
                    <div class="file-box">
                        <label for="file">파일 첨부하기</label>
                        <input type="file" id="file">
                    </div>
                </div>
                <button type=submit>제출하기</button>
            </div>
            
        </form>
    </div>
<%@include file="../common/footer.jsp" %>
</body>
</html>