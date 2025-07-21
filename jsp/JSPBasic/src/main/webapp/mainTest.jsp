<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>


	 function login(){
		 location.href = "loginTest1.jsp";
	 }
 
 	let query = window.location.search;
 	
	if(query.split("=")[1] == "loginSuccess"){
		alert("로그인 성공");
	} else if (query.split("=")[1] == "loginFail"){
		alert("로그인 실패");
	}
</script>
</head>
<body>
	<h1>mainTest.jsp</h1>
	
	<button onclick="login()">로그인 하기</button>
<!-- 	<div><a href='jstl/loginTest_jstl.jsp'>로그인 (session, jstl)</a></div> -->
	
<%-- 	<% if (session.getAttribute("loginMemberId") == null) { --%>
<!-- 		out.print("<div><a href='loginTest2.jsp'>로그인 (session)</a></div>"); -->
<!-- 	} else { -->
<!-- 		out.print("<div><a href='SessionLogoutServlet'>로그아웃 (session)</a></div>"); -->
<!-- 	}%> -->
<%-- 	<% String tmpaa = (String)session.getAttribute("loginMemberId");%>  --%>
<%-- 		<%pageContext.setAttribute("tmpaa", tmpaa);%> --%>
	
	<hr>
	<div>${sessionScope.loginMemberId }</div>
	<hr>
	
	<c:set var="tmpaa" value="${sessionScope.loginMemberId }" scope="page"></c:set>
	<c:out value="${tmpaa}"/>
	<div>${tmpaa == "" }</div>
	<div>${tmpaa == null }</div>
	<div>${tmpaa }</div>
	
	
	
	<c:choose>
<%-- 	<c:when test="${empty loginMemberId }"> --%>
	<c:when test="${empty tmpaa}">
<%-- 	<c:when test="${tmpaa == ''}"> --%>
		
		<div><a href='loginTest2.jsp'>로그인 (session)</a></div>
	</c:when>
	<c:otherwise>
		<div><a href='SessionLogoutServlet'>로그아웃 (session)</a></div>
	</c:otherwise>
	</c:choose>
	
	
	
	
	
	<div>세션 id : <%= session.getId() %></div>
	<div>로그인한 유저 아이디 : <%= session.getAttribute("loginMemberId") %></div>
	
<!-- 	session.isNew() -->
	
	<div><a href="checkSession.jsp">세션 정보 확인</a></div>
</body>
</html>