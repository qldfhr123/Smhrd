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
		int num1=  Integer.parseInt(request.getParameter("num1"));
		int num2 =  Integer.parseInt(request.getParameter("num2"));
		
		String type = request.getParameter("type");
		
	%>
	<% if(type.equals("+")){ %>
	<%= num1 %>
	+
	<%= num2 %>
	=
	<%= num1 + num2 %>

	<%}%>

	<% if(type.equals("-")){ %>
	<%= num1 %>
	-
	<%= num2 %>
	=
	<%= num1 - num2 %>

	<%}%>

	<% if(type.equals("*")){ %>
	<%= num1 %>
	X
	<%= num2 %>
	=
	<%= num1 * num2 %>

	<%}%>
	
	<% if(type.equals("/")){ %>
	<%= num1 %>
	/
	<%= num2 %>
	=
	<%= num1 / num2 %>

	<%}%>
		<br>


	<%
		int num_1 = Integer.parseInt(request.getParameter("num1"));
		int num_2 = Integer.parseInt(request.getParameter("num2"));
		String type1 = request.getParameter("type");
		
		if(type1.equals("+")) {
		    out.print(num_1);
		    out.print(" + ");
		    out.print(num_2);
		    out.print(" = ");
		    out.print(num_1 + num_2);
		}
		
		if(type1.equals("-")) {
		    out.print(num_1);
		    out.print(" - ");
		    out.print(num2);
		    out.print(" = ");
		    out.print(num_1 - num_2);
		}
		
		if(type1.equals("*")) {
		    out.print(num_1);
		    out.print(" X ");
		    out.print(num2);
		    out.print(" = ");
		    out.print(num_1 * num_2);
		}
		
		if(type1.equals("/")) {
		    out.print(num_1);
		    out.print(" / ");
		    out.print(num2);
		    out.print(" = ");
		    out.print(num_1 / num_2);
		}
	%>

 <%
	int n1 = Integer.parseInt(request.getParameter("num1"));
	int n2 = Integer.parseInt(request.getParameter("num2"));
 	int result = 0;
 	String mark = "";
 	switch(type1){
 	
 	case "+": result = n1+n2; mark ="+"; break;
 	case "-": result = n1-n2; mark ="-"; break;
 	case "*": result = n1*n2; mark ="X"; break;
 	case "/": result = n1/n2; mark ="-"; break;
 	}
 %>
 
 <%= n1  +"mark"+ n2  +"="+ result %>

</body>
</html>