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
	<div><%=request.getParameter("nickname") %>님이 좋아하는 계절은 <%=request.getParameter("favSeason") %> 입니다.</div>
	
	<div>${param.nickname }님이 좋아하는 계절은 ${param.favSeason } 입니다.</div>
	
	<div>좋아하는 계절 :
		${paramValues.favSeason[0] }
		${paramValues.favSeason[1] }
		${paramValues.favSeason[2] }
		${paramValues.favSeason[3] }
		${paramValues.favSeason[4] }
	</div>
	<hr>
	<c:forEach var="season" items="${ paramValues.favSeason}">
		<div>${season }</div>
	</c:forEach>
</body>
</html>