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
	
	<c:forEach var="i" begin="1" end="10">
		<div>${i }번째 div태그</div>
	</c:forEach>
	
	<hr>
	<c:forEach var="i" begin="1" end="9" step="2">
		<div>${i }번째 div태그</div>
	</c:forEach>
	
<!-- 	구구단 출력 -->
	<c:forEach var="i" begin="1" end="9">
		<div>2 * ${i } = ${2 * i }</div>
	</c:forEach>
	
</body>
</html>