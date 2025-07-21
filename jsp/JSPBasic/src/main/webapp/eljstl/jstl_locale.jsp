<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="now" value="<%=new Date() %>"></c:set>
	
	<div>톰캣 서버의 기본 로케일 : <%=response.getLocale() %></div>
	<div>통화 <fmt:formatNumber value="123456" type="currency"></fmt:formatNumber></div>
	<div>현재 날짜 시간 : <fmt:formatDate value="${now }" type="both"/></div>
	
	<hr />
	<fmt:setLocale value="en_US"/>
	<c:set var="nowUS" value="<%=new Date() %>"></c:set>
	<div>로케일 (en_US) : <%=response.getLocale() %></div>
	<div>통화 <fmt:formatNumber value="123456" type="currency"></fmt:formatNumber></div>
	<div>현재 날짜 시간 : <fmt:formatDate value="${nowUS }" type="both" timeZone="America/New_York"/></div>
	
	<hr />
	<fmt:timeZone value="GMT-4">
		<div>뉴욕 시간 (GMT-4) : <fmt:formatDate value="${nowUS }" type="both"/></div>
	</fmt:timeZone>
	
	<hr />
	<fmt:setLocale value="ja_JP"/>
	<div>로케일 (ja_JP) : <%=response.getLocale() %></div>
	<c:set var="nowJP" value="<%=new Date() %>"></c:set>
	<div>통화 <fmt:formatNumber value="123456" type="currency"></fmt:formatNumber></div>
	<div>현재 날짜 시간 : <fmt:formatDate value="${nowJP }" type="both"/></div>
</body>
</html>
