<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String heroes = "캡틴아메리카노, 헐쿠, 아이언맨, 스파이더맨, 토루";
		pageContext.setAttribute("heroes", heroes);
	
	%>
	
	<ul>
		<c:forTokens var="hero" items="${heroes}" delims=", ">
			<li>${hero }</li>
		</c:forTokens>
	</ul>
	
	<c:redirect url="../hello.jsp"></c:redirect>
	
	
</body>
</html>