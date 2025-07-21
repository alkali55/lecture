<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="inputprod.do" method="POST">
		<div>상품명 : <input type="text" name="prodName"></div>
		<div>갯수 : <input type="number" min="0" name="quantity"></div>
		<div>가격 : <input type="number" min="0" name="price"></div>
		<div>
			<select name="color">
				<option value="">색상을 선택하세요</option>
				<option value="red">빨강</option>
				<option value="orange">주황</option>
				<option value="yellow">노랑</option>
				<option value="blue">파랑</option>
			</select>
		</div>
		<input type="submit" value = "전송">
	</form>
</body>
</html>