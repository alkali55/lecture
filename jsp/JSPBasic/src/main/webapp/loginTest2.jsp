<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 (session)</title>
</head>
<body>
	<h1>로그인</h1>
	
	<form action="SessionLoginServlet" method="post">
		<div>아이디 : <input type="text" name="userId"></div>
		<div>패스워드 : <input type="password" name="userPwd"></div>
		<input type="submit" value="로그인">
	</form>
</body>
</html>