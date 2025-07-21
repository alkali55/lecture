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
	%>
	
	<table border="1">
		<tr>
			<th>index</th><th>count</th><th>isFirst</th><th>isLast</th><th>hero</th>
		</tr>
		<c:forEach var="hero" items="${heroes }" varStatus="status">
			<c:choose>
			<c:when test="${status.first }">`
				<tr style="color:red;">
			</c:when>
			<c:otherwise>
				<tr style="color:black">
			</c:otherwise>
			</c:choose>
			
			<c:choose>
			<c:when test="${status.index % 2 == 0 }">
				<td style="background-color:yellow;">${status.index }</td>
			</c:when>
			<c:otherwise>
				<td>${status.index }</td>
			</c:otherwise>
			</c:choose>
			
				<td>${status.count }</td>
				<td>${status.first }</td>
				<td>${status.last }</td>
				<td>${hero }</td>
			</tr>
		</c:forEach>
	
	</table>
	
	<hr>
	
<!-- 	짝수번째 index컬럼의 td배경색을 노란색으로 바꿔보세요 -->

<!-- 	첫번째 tr에 글자색을 빨강으로 하고, 첫번째 tr이 아니면 글자색을 검정색으로 한다. -->
</body>
</html>