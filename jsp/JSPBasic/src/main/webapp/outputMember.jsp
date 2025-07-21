<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>
	<div>
		${member }
	</div>
	<div>아이디 : ${member.userId }</div>
	<div>이메일 : ${member.email }</div>
</body>
</html>