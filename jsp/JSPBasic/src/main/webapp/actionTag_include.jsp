<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>액션태그 - include</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	
	<h1>action 태그를 이용한 include</h1>
	<%
		int a = 100;
	%>
	
	<%= a %>
	
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>