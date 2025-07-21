<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>액션 태그</title>
</head>
<body>
	<div>아이디 : <%=request.getParameter("userId") %></div>
	<div>나이 : <%=request.getParameter("age") %></div>
	<div>이름 : <%=request.getParameter("name") %></div>
</body>
</html>