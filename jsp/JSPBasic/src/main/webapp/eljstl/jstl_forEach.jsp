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
		String[] heroes = {"캡틴아메리카노", "헐쿠", "아이언맨", "스파이더맨", "토루"};
		pageContext.setAttribute("heroes", heroes);
// 		heroes[7] = "닥터스트레인지";
	%>
	
	<ul>
		<c:forEach var="hero" items="${heroes }">
			<li>${hero }</li>
		</c:forEach>
<%-- 		<li>${heroes[7] }</li> --%>
	</ul>
</body>
</html>