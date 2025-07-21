<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지시어</title>
</head>
<body>
	
	<%
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdfTime = new SimpleDateFormat("hh시 mm분 ss초");
		
	
	%>
	
	<div>
		오늘은 <b> <%= sdfDate.format(cal.getTime()) %></b> 입니다.
	</div>
	<div>
		현재 시각은 <b><%= sdfTime.format(cal.getTime()) %></b> 입니다.
	</div>
</body>
</html>