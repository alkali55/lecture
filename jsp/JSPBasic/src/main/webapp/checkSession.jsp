<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% 
		String userId = (String)session.getAttribute("loginMemberId");
		out.print("로그인 한 userId : " + userId + "<br>");
		
		Enumeration<String> enm = session.getAttributeNames();
		
		String name = "";
		String value = "";
		
		while(enm.hasMoreElements()){
			name = enm.nextElement();
			value = (String)session.getAttribute(name);
			
			out.print("속성 이름 : " + name + "<br>");
			out.print("속성 값 : " + value + "<br>");
		}
		
		out.print("=====================================================<br>");
		long createdTime = session.getCreationTime();
		long lastTime = session.getLastAccessedTime();
		
		out.print("세션 아이디 : " + session.getId() + "<br>");
		out.print("세션에 머문 시간 : " + (lastTime - createdTime) + "(밀리초) <br>");
		out.print("세션 유효시간 : " + session.getMaxInactiveInterval() + "(초)");
	%>


</body>
</html>