<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>왜 Servlet을 사용하는가</title>
<script>
	function hello(){
		alert("!");
	}
</script>
<style>
	h1{
		background-color: yellow;
	}

</style>
</head>
<body>
	<h1 onclick="hello()">왜 Servlet을 사용하는가?</h1>
	
	<%
	// 아래의 코드는 웹 서버에서 실행되어! 결과만을 클라이언트에 전송한다.
	// 클라이언트에서 이 문서를 보면 자바의 문법은 확인할 수 없다.
		int num = 4;
		out.print(num);	
	
		// num이 짝수이면 빨간색으로 "짝수입니다" 출력
		// 홀수이면 파란색으로 "홀수입니다" 출력
		
		if(num % 2 == 0){ // 짝수이면
		%>	
			<div style = "color : red;">짝수입니다.</div>
		<%
		} else { // 홀수이면
			%>
			<div style ="color : blue;">홀수입니다.</div>
			
			<%
		}
		
	%>
</body>
</html>