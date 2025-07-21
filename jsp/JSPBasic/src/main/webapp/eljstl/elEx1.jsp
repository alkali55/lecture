<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL로 표현가능한 데이터</title>
<script type="text/javascript">
	// 템플릿 문자열 사용
	// jsp에서 템플릿 문자열을 사용할 때는 반드시 \(역슬래시)를 붙여서 자바에서는 실행이 되지 않도록 해야 한다.
	let name = "홍길동";
	let str = `\${name} 님 방가`;
	console.log(str);
</script>
</head>
<body>
	<div>정수형 : ${10 }</div>
	<div>실수형 : ${3.14 }</div>
	<div>문자열 : ${"오늘은 날이 따뜻합니다." }</div>
	<div>논리형 : ${true }</div>
	<div>null : ${null }</div>
</body>
</html>