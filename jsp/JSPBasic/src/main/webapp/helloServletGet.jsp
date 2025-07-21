<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
	function callServlet(){
		location.href = "./hGET?name=정근우";
	}
	
	function callServletAjax(){
		
		 $.ajax({
             url: "./hGET?name=이택근", // 데이터가 송수신될 서버의 주소
             type: "GET", // 통신 방식 (GET, POST, PUT, DELETE)
             success: function(data){ 
            	 // 통신이 성공하면 수행할 함수
                 console.log("ajax success");
             },
             error: function(data){},
             complete: function(){
             }
         });
	}
</script>
</head>
<body>
	<h1>HelloServletGet파일을 GET방식으로 호출해보자.</h1>
	<div>
	<a href = "./hGET?name=홍길동" >a태그로 서블릿 요청</a>
	</div>
	<form action="./hGET" method="get">
		<input type="text" name="name">
		<button type="submit">form태그로 GET방식 요청</button>
	</form>
	
	<div>
	<button onclick="callServlet();">loaction.href로 서블릿 요청</button>
	</div>
	
	<div>
		<button onclick="callServletAjax();">Ajax로 서블릿 요청(GET방식)</button>
	</div>
</body>
</html>