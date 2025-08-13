<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!--
	스크립트릿 %% / JSP 내부에서 자바코드를 사용할수있는공간
	표현신  %=%/ 어떤 값이 HTML과 같이 출력될수 있는 공간
	  -->
	
	<% int sum = 0;
		for(int i = 1; i<=100;i++){
			sum+=i;
		}
	%>
	<p>
		<b>1 ~ 100 까지 합 : </b>
		<%= sum %>
	</p>


</body>
</html>