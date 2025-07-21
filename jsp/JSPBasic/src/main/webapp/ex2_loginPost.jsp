<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginPost" method="POST" >
		<div>이름 : <input type="text" name = "name"></div>
		<div>ID : <input type="text" name = "ID"></div>
		<div>PWD : <input type="password" name = "PWD"></div>
		<input type="submit" value = 전송>
	</form>
</body>
</html>