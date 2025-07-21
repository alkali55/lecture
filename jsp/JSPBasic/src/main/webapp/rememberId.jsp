<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<h1>로그인</h1>

	<form action="RememberIdServlet" method="POST">
		<div>아이디 : 
			<% Cookie[] cooks = request.getCookies();
				boolean isYes = false;
				String userId = "";
				String rememberChecked = "";
				for(Cookie c : cooks){
					if(c.getName().equals("rememberId") && c.getValue().equals("Y")){
						isYes = true;
					}
					if(c.getName().equals("userId")){
						userId = c.getValue();
					}
				}
				
				if(isYes) rememberChecked = "checked";
				
// 				if (isYes){
// 					out.write("<input type='text' name='userId' id='inputId' value='" + userId + "'>");
// 					out.write("<input type='checkbox' name='rememberId' value='Y' checked='true'/>");
// 				} else {
// 					out.write("<input type='text' name='userId' id='inputId'>");
// 					out.write("<input type='checkbox' name='rememberId' value='Y' />");
// 				}

			%>			
			<input type="text" name="userId" id="inputId" value="<%= userId%>">
			<input type="checkbox" name="rememberId" value="Y" <%= rememberChecked %> /> 
			아이디저장
		
		</div>
		<div>비밀번호 : <input type="password" name="userPwd"></div>
		<input type="submit" value="로그인">
	</form>
</body>
</html>