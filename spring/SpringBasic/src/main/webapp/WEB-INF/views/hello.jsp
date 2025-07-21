<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hello.jsp</h1>
	<div>이름 : ${param.name }</div>
	<div>나이 : ${param.age }</div>
	<div>나이 : <%=request.getParameter("age") %></div>
	
	<hr />
	<div>status : ${status }</div>
</body>
</html>