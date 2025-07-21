<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">

function callServletAjax() {
	
	 $.ajax({
        url: "./hPOST", // 데이터가 송수신될 서버의 주소
        type: "POST", // 통신 방식 (GET, POST, PUT, DELETE)
	 	data: {
	 		"name" : "홍길동",
	 		"age" : 33
	 	},
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

	<form action="hPOST" method="post">
		<div>이름 : <input type="text" name = "name"></div>
		<div>나이 : <input type="text" name = "age"></div>
		<input type="submit" value="전송">
	</form>
	
	<div>
		<button onclick="callServletAjax();">Ajax로 서블릿 요청(GET방식)</button>
	</div>

</body>
</html>