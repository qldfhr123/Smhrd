<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1> 랜덤 당첨 게임 </h1>

<h3>랜덤 뽑기</h3>

<% 
	ArrayList title_list = new ArrayList();
	String s_cnt = request.getParameter("count");
	int cnt = Integer.parseInt(s_cnt);
	
	title_list.add(request.getParameter("game_title_[cnt]"));


	Random ran = new Random();
	int ran_n = ran.nextInt(cnt)+1;
	
	String game_title = request.getParameter("game_title");
	
	out.print("game_title");
	out.print("title_list[ran_n]");
	
	
%>

</body>
</html>