<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! int globalCnt = 0; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	int localCnt = 0;

	out.print("localCnt :" );
	out.print(localCnt++);
	
	out.print("<br>");
	out.print("globalCnt : ");
	out.print(globalCnt++);

%>


</body>
</html>