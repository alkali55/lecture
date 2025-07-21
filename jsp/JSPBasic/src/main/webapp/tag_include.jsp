<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기본 태그 - include 지시자</title>
</head>
<body>
<%@ include file="header.jsp" %>

<div class="container">
	<h1>Hello, JSP!</h1>
	
	<div>a=<%=a %></div>
	
	<form action="">
	  <div class="mb-3 mt-3">
	    <label for="email" class="form-label">Email:</label>
	    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
	  </div>
	  <div class="mb-3">
	    <label for="pwd" class="form-label">Password:</label>
	    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
	  </div>
	  <div class="form-check mb-3">
	    <label class="form-check-label">
	      <input class="form-check-input" type="checkbox" name="remember"> Remember me
	    </label>
	  </div>
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>


<%@ include file="footer.jsp" %>
</body>
</html>