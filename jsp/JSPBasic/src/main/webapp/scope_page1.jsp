<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>page 1</h1>
	
	<%
		// 각 내장 객체 영역에 정보 바인딩
		pageContext.setAttribute("name", "page data");
		request.setAttribute("name", "request data");
		session.setAttribute("name", "session data");
		application.setAttribute("name", "application data");
		
		// 각 내장 객체 영역에 바인딩된 정보 확인
		out.print("pageContext : " + pageContext.getAttribute("name") + "<br>");
		out.print("request : " + request.getAttribute("name") + "<br>");
		out.print("session : " + session.getAttribute("name") + "<br>");
		out.print("application : " + application.getAttribute("name") + "<br>");
		
		request.getRequestDispatcher("scope_page2.jsp").forward(request, response);
	%>
	
	<div><a href = "scope_page2.jsp">2페이지로 이동</a></div>
</body>
</html>