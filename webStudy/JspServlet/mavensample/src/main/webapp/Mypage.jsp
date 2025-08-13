<%@page import="com.smhrd.model.MavenMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!--  로그인 되어있으면 상태면 ~~ 님의 마이페이지입니다 -->
	
		<% 
		MavenMember member = (MavenMember) session.getAttribute("member");
	%>

	<%if(member == null){ %>
			<p>로그인후 이용해주세요</p>
			<a href="Login.html"><button>로그인 하러 가기</button></a>
			
		<%} else{ %>
			<p> <%= member.getName() %> 님 환영합니다! </p>
			<a href="Update.html"><button>이름 변경</button></a>

		<%} %>

	
	<!--  로그인 되어있지 않으면 로그인후 이용가능 -->

</body>
</html>