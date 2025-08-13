<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% 
		String user_id_s = request.getParameter("user_id");
		out.print(user_id_s+"님 ");
		out.print("<h4>  로그인 성공 </h4>");
	%>
	
</body>
</html>