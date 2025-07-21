<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script>
	function jsontest(){
		console.log("!!");
		let searchName = "홍길동";
		
		$.ajax({
            url: "ajaxPOST", // 데이터가 송수신될 서버의 주소
            type: "POST", // 통신 방식 (GET, POST, PUT, DELETE)
			contentType: "application/json",
			data: JSON.stringify(searchName), // 서버에 전송할 데이터
            dataType: "text", // 수신받을 데이터의 타입 (MIME TYPE)
            success: function(data){ // 통신이 성공하면 수행할 함수
                console.log(data);
            },
            error: function(){},
            complete: function(){}
        });
	}
</script>
</head>
<body>
	<h1>ajaxJson.jsp</h1>
	<button onclick="jsontest();">jsontest</button>
</body>
</html>