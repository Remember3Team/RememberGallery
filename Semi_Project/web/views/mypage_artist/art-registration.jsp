
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>art-registration</title>
</head>
 <link rel="stylesheet" href="<%=request.getContextPath() %>/views/css/Style-ar.css">

<body>
<%@include file="../common/menubar.jsp" %>
<%@include file="../common/mypagehead.jsp" %>


    <div class="title">
        <h3>상품 등록</h3>
        <hr>
    </div>
    

    <div class="container">
        <form action="<%=request.getContextPath()%>/insert.th" method="post" encType="multipart/form-data">
            <!--section1-->
            <div class="section1" style="padding-bottom: 100px;">
                <span>상품 정보<a style="color:red;">*</a></span>
                <div class="artregi-infobox">
                    <div class="info-box1">
                        <label class="labelfirst" for="pname">작품명</label><input class="nomal-text" type="text"
                            name="pname">
                    </div>

                    <div class="info-box2">
                        <label class="labelfirst" for="aname">작가명</label><input class="nomal-text" type="text"
                            name="aname">
                    </div>

                    <div class="info-box3">
                        <label class="labelfirst">테마</label>
                        <select class="select-thema" name="select-thema">
                            <option value="풍경">풍경</option>
                            <option value="인물">인물</option>
                            <option value="정물">정물</option>
                            <option value="동물">동물</option>
                            <option value="추상">추상</option>
                            <option value="팝아트">팝아트</option>
                            <option value="오브제">오브제</option>
                        </select>
                    </div>

                    <div class="info-box4">
                        <label class="labelfirst">제작년도</label><input class="nomal-text" type="text" name="year">
                    </div>

                    <div class="info-box5">
                        <label class="labelfirst">가격</label><input class="nomal-text" type="text" name="price">
                    </div>

                    <div class="info-box6">
                        <label class="labelfirst">태그</label>
                        <!-- <input class="tag" type="text" name="tag"> -->
                        <select class = "tag-select">
                        	<option value = "우아한">우아한</option>
                        	<option value = "생동감있는">생동감 있는</option>
                        	<option value = "컬러풀한">컬러풀한</option>
                        	<option value = "서정적인">서정적인</option>
                        	<option value = "동적인">동적인</option>
                        	<option value = "무드있는">무드있는</option>
                        	<option value = "정교한">정교한</option>
                        	<option value = "따뜻한">따뜻한</option>
                        	<option value = "신선한">신선한</option>
                        </select>
                        <button class="tag-button">취소</button>
                         <button class="tag-button" type="button" style="margin-right: 5px;">태그추가</button>
                        <div id="tag-area" style="margin-left:87px; margin-top:10px; width=473px; height=30px"></div>
                    </div>
                    <script>
                    </script>

                    <div class="info-box7">
                        <label class="labelfirst">상세 설명</label>
                        <textarea>
                    </textarea>
                    </div>
                </div>
            </div>

            <!--section2-->

            <div class="section2" style="padding-bottom: 100px;">
                <span>이미지 등록<a style="color:red;">*</a></span>
                <div class="artregi-imgbox">
                    <div class="img-box">
                        <label class="labelsecond">대표 이미지</label>
                        <div class="img-upload1">
                            <label for="file">파일 첨부하기</label>
                            <input type="file" id="thumbnailImg" multiple="multiple" name="thumnailImg">
                        </div>
                    </div>
                    <hr style="margin-bottom:30px;">
                    <div class="img-box2">
                        <label class="labelsecond">추가 이미지<br>0/5</label>
                        <div class="img-upload2">
                            <label for="file" >파일 첨부하기</label>
                            <input type="file" id="a-img" multiple="multiple" name="a-img">
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
<%@include file="../common/footer.jsp" %>
</body>
</html>