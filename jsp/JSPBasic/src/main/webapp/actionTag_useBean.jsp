<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>액션 태그 - useBean</title>
</head>
<body>
<!-- 기본 생성자를 이용해서 id속성 값의 이름으로 Bean(객체)를 생성한다. -->
	<jsp:useBean id="member1" class = "com.jspbasic.dto.Member"></jsp:useBean>
	
	<jsp:setProperty property="userId" name="member1" value = "hkd"/>
	<jsp:setProperty property="pwd" name="member1" value = "1234"/>
	<jsp:setProperty property="email" name="member1" value = "hkd@naver.com"/>
	
	<% out.print(member1); %>
	
	<div>아이디 : <jsp:getProperty property="userId" name="member1"/></div>
	<div>비밀번호 : <jsp:getProperty property="pwd" name="member1"/></div>
	<div>이메일 : <jsp:getProperty property="email" name="member1"/></div>
</body>
</html>