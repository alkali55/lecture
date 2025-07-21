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
	<c:set var="msg" value="졸려요"></c:set>
	
	<div>${msg }</div>
	<div>${pageScope.msg }</div>
	
	<div><c:out value="${msg }"></c:out></div>
	
	<hr>
	<c:remove var="msg"/>
	<div><c:out value="${msg }"></c:out></div>
</body>
</html>