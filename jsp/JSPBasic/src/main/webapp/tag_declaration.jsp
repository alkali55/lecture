<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		String str = "안녕하세요"; // 멤버 변수
	
		public int abs(int n){ // 멤버 메서드
			if (n < 0){
				n = -n;
			}
			return n;
		}
	%>
	
	<%
		out.print("<div>" + str + "</div>");
		out.print("<div>" + abs(-4) + "</div>");
		
		// 스크립트릿에서 선언된 변수는 _jspService() 메서드의 지역변수로 만들어진다.
		int num1 = 3;
		int num2 = 5;
		int result = num1 + num2;
		
		out.print("<div>" + num1 + " + " + num2 + " = " + result + "</div>");
	%>
</body>
</html>