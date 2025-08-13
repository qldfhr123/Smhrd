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
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("pw");
		
		
		if(user_id.equals("smart") && user_pw.equals("123")){
			response.sendRedirect("Ex06LoginSuccess.jsp?iuser_id="+user_id);
		}
		else {
			response.sendRedirect("Ex06LoginFail.jsp");
		}
	%>


</body>
</html>