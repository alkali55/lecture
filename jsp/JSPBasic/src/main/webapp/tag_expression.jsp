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
	
<!-- 	out.print(str); -->
<%-- 	<div><%= str; %></div> --%>
<!-- 	표현식에서 out.print()로 변환되므로, 세미콜론을 입력하지 않아야 한다. -->
	<div><%= str %></div>
	<div><%= abs(-4) %></div>

	
</body>
</html>