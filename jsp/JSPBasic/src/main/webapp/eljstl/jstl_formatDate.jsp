<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜 형식</title>
</head>
<body>
	<c:set var="now" value="<%=new java.util.Date() %>"></c:set>
	
	<div>${now }</div>
	<div><fmt:formatDate value="${now }"></fmt:formatDate></div>
	<div><fmt:formatDate value="${now }" type="time"></fmt:formatDate></div>
	<div><fmt:formatDate value="${now }" type="date"></fmt:formatDate></div>
	<div><fmt:formatDate value="${now }" type="both"></fmt:formatDate></div>
	
	<div>time(medium) : <fmt:formatDate value="${now }" type="time" timeStyle="medium"></fmt:formatDate></div>
	<div>time(long) : <fmt:formatDate value="${now }" type="time" timeStyle="long"></fmt:formatDate></div>
	<div>time(full) : <fmt:formatDate value="${now }" type="time" timeStyle="full"></fmt:formatDate></div>
	
	<div>time(medium) : <fmt:formatDate value="${now }" type="date" dateStyle="medium"></fmt:formatDate></div>
	<div>time(long) : <fmt:formatDate value="${now }" type="date" dateStyle="long"></fmt:formatDate></div>
	<div>time(full) : <fmt:formatDate value="${now }" type="date" dateStyle="full"></fmt:formatDate></div>
	
	<div>date : <fmt:formatDate value="${now }" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></div>
	<div>date : <fmt:formatDate value="${now }" pattern="yyyy-MM-dd a HH:mm:ss"></fmt:formatDate></div>
</body>
</html>