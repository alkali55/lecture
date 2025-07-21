<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>param객체</title>
</head>
<body>
	<form action="jstl_choosewhen2.jsp">
		<div>좋아하는 계절</div>
		<div>
			<select name="favSeason" multiple="multiple">
				<option >봄</option>
				<option>여름</option>
				<option>가을</option>
				<option>겨울</option>
			</select>		
		</div>
		<div>별명 : <input type="text" name="nickname" ></div>
		<div><input type="submit" value="전송"></div>
	</form>
</body>
</html>