<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숫자 형식</title>
</head>
<body>
	<div><fmt:formatNumber value="123456.89"/></div>
	
<!-- 통화형식 지정 -->

	<div><fmt:formatNumber value="123456" type="currency" ></fmt:formatNumber></div>
	<div><fmt:formatNumber value="123456" type="currency" currencySymbol="$"></fmt:formatNumber></div>
	
	<hr>
	<div><fmt:formatNumber value="0.574" type="percent"></fmt:formatNumber></div>
	
	<hr>
	<div><fmt:formatNumber value="123456.89" pattern="#,###.#"></fmt:formatNumber></div>
	<div><fmt:formatNumber value="123456.8956" pattern="#,###.###"></fmt:formatNumber></div>
	<div><fmt:formatNumber value="123456.89" pattern="#,###.###"></fmt:formatNumber></div>
	
	<hr>
<!-- 	0은 빈자리만큼 0으로 채운다 -->
	<div><fmt:formatNumber value="123456.89" pattern="#,###.000"></fmt:formatNumber></div>
	<div><fmt:formatNumber value="123456.8" pattern="#,###,###.000"></fmt:formatNumber></div>
	<div><fmt:formatNumber value="123456.89" pattern="000,000,000.000"></fmt:formatNumber></div>
	<div><fmt:formatNumber value="123456.89" pattern="0,000.000"></fmt:formatNumber></div>
	
</body>
</html>