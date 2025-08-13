<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1>ForwardEnd</h1>
	<%
		// 객체 처리로 형변환 하자
		String message = (String)request.getAttribute("name");
	%>
	<h2><%= message %></h2>

</body>
</html>