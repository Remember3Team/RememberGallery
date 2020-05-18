<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
<link rel="stylesheet" href="../css/Style-ar.css">
<link rel="stylesheet" href="../css/Style-info.css">
</head>
<body>
	<%@include file="../common/menubar.jsp" %>
	<%@include file="../common/mypagehead2.jsp" %>
	
    
    <div class="container">
   
    <form action="#">
            <!--section1-->
            <div class="section1" style="padding-bottom: 100px;">
                <span>회원 정보<a style="color:red;">*</a></span>
                <div class="user-infobox">
                    <div class="info-box1">
                        <label class="labelfirst" for="pname">이름</label><input class="nomal-text" type="text"
                            name="pname">
                    </div>

                    <div class="info-box2">
                        <label class="labelfirst" for="aname">아이디</label><input class="nomal-text" type="text"
                            name="aname">
                    </div>
                    
                    <div class="info-box3">
                        <label class="labelfirst" for="aname">비밀번호</label><input class="nomal-text" type="password"
                            name="aname">
                    </div>
                    
                    <div class="info-box4">
                        <label class="labelfirst" for="aname">비밀번호 확인</label><input class="nomal-text" type="password"
                            name="aname">
                    </div>

                    <div class="info-box5">
                        <label class="labelfirst">닉네임</label><input class="nomal-text" type="text" name="year">
                    </div>

                    <div class="info-box5">
                        <label class="labelfirst">가격</label><input class="nomal-text" type="text" name="price">
                    </div>

                    <div class="info-box6">
                        <label class="labelfirst">태그</label><input class="tag" type="text" name="tag">
                        <button class="tag-button">취소</button><button class="tag-button"
                            style="margin-right: 5px;">태그추가</button>
                        <div id="tag-area"></div>
                    </div>

                    <div class="info-box7">
                        <label class="labelfirst">상세 설명</label>
                        <textarea>
                    </textarea>
                    </div>
                </div>
            </div>

            
                <div class="submit-box">
                <button class = "submit-bt" type=submit>제출하기</button>
                </div>

            </div>

    </div>
    </div>
    
    </form>
    
   

     
    </div>

    <br>
    <br>
	<%@include file="../common/footer.jsp" %>
</body>
</html>