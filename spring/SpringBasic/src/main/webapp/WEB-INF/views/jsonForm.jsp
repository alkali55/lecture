<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 입력</title>
</head>
<body>
	<h1>상품 입력</h1>
	<form action="saveJson" method="post">
		<div>상품 번호 : <input type="text" name="prodNo" /></div>
		<div>상품 이름 : <input type="text" name="prodName" /></div>
		<div>상품 가격 : <input type="text" name="price" /></div>
		<button type="submit">저장</button>
	</form>
</body>
</html>