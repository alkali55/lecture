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
	<c:if test="${param.favSeason =='봄' }">
		<div>${param.nickname }님은 봄을 좋아하시네요.</div>
	</c:if>
	<c:if test="${param.favSeason =='여름' }">
		<div>${param.nickname }님은 여름을 좋아하시네요.</div>
	</c:if>
	<c:if test="${param.favSeason =='가을' }">
		<div>${param.nickname }님은 ${param.favSeason }을 좋아하시네요.</div>
	</c:if>
	<c:if test="${param.favSeason =='겨울' }">
		<div>${param.nickname }님은 ${param.favSeason }을 좋아하시네요.</div>
	</c:if>
</body>
</html>