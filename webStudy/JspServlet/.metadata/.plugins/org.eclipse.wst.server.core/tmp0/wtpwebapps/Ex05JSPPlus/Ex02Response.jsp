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
		String name = request.getParameter("name");
	
		String java = request.getParameter("java");
		int java_s = Integer.parseInt(java);
		
		String web = request.getParameter("web");
		int web_s = Integer.parseInt(web);
		
		String iot = request.getParameter("iot");
		int iot_s = Integer.parseInt(iot);
		
		String and = request.getParameter("and");
		int and_s = Integer.parseInt(and);
		
		if(java_s >= 60 ){
			out.print(name+" PASS");
		} else{
			out.print(name+" 재시험 당첨");
		}
	
	%>


</body>
</html>