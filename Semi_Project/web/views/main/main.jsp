<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="../css/style.css">
  <link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="../css/bootstrap.css">
  
<script src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.js"></script> 
</head>
<body>

   <section>
       <div id ="contents" >
        <div class="part1">
            <div class="slide">
                <h1 align="center">REMEMBER ART</h1>
            <a href="#"><img src="views/img/slide1.jpg" style="height: auto;"> </a>
            <a href="#"><img src=""></a>
            <a href="#"><img src=""></a>    
            </div> <!--slide end-->      
        </div>
        
        <button class="btn btn-outline-dark" style=" width : 120px; height : 50px; margin-top: 10px;"
			onclick="goView();">sammy</button>
		<script>
		
			function goView() {
				location.href='<%=request.getContextPath()%>/view.ap';
				
				
			}
		
		</script>
		
			
			
        <!--part1 end-->

        <div class="part2">
            <h1>part2</h1>
            <div>
                <div class ="block block-test2 area1">첫 번째 영역 </div>
                <div class ="block block-test2 area2">두 번째 영역 </div>
                <div class ="block block-test2 area3">세 번째 영역 </div>
            </div>
        </div> 
        <!--part2 end-->

        <div class="part3">
            <h1>part3</h1>
            <div>
                <div class ="block block-test3 area1">첫 번째 영역 </div>
                <div class ="block block-test3 area2">두 번째 영역 </div>
                <div class ="block block-test3 area3">세 번째 영역 </div>
            </div>
        </div>
        <!--part3 end-->
    </div> <!--content end-->
   </section>

</body>
</html>