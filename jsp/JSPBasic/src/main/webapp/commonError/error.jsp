<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  isErrorPage="true"로 설정해 주어 exception 객체를 받아서 내용 출력 -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외처리 페이지 (공통예외를 처리)</title>
</head>
<body>
	<h1>에러 페이지</h1>
	<h2>일시적인 오류가 발생하였습니다.</h2>
	<div>에러가 지속되면 담당자에게 연락주세요.....</div>
	
	<div><%= exception.getClass().getName() %></div>
	<div><%= exception.getMessage() %></div>
	<div><%= exception.getStackTrace()[0] %></div>
	<div><%= exception.getStackTrace()[1] %></div>
	<div><%= exception.getStackTrace()[2] %></div>
</body>
</html>