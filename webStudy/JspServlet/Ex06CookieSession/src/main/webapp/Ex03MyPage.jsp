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
		String id = (String)session.getAttribute("id");
		if(id == null){
			// 로그인 정보없을시 로그인으로
			response.sendRedirect("Ex03LoginForm.html");
		}
	
	%>
	 <h1> <%= id %>님 의 마이페이지 입니다!</h1>
	 <a href = "Ex03Main.jsp">메인으로 이동</a>
	 <a href = "Ex03Logout">로그아웃</a>

</body>
</html>