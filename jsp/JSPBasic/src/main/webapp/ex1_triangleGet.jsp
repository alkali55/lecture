<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function validation(){
		let isValid = false;
		let base = document.getElementById("base").value;
		let height = document.getElementById("height").value;
		
		console.log(base, height);
		
		if (base <= 0 || height <= 0){
			alert("입력한 값이 유효하지 않습니다");
		} else {
			isValid = true;
		}
		
		return isValid;
	}
</script>
</head>
<body>
	<form action="TriangleGet" method="GET" >
		<div>밑변 : <input type="text" name = "base" id="base"></div>
		<div>높이 : <input type="text" name = "height" id="height"></div>
		<input type="submit" value = 전송 onclick="return validation();">
	</form>
	
	
</body>
</html>