<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% String id = (String)session.getAttribute("id"); %>
	<h1><%= id %> 님 환영합니다</h1>
	<a href = "Ex03Main.jsp">마이페이로 이동!</a>
	<form action="Ex03LoginCheck" method= "post">
		<input type ="submit" value = "로그아웃">
	</form>
	


</body>
</html>