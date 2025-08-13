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

	<form action="Ex03RandomOutput.jsp" method="get">
		주제 : <input type="text" name = "game_title">
		<% 
			String s_cnt = request.getParameter("count");
			int cnt = Integer.parseInt(s_cnt);
			for (int i = 0; i <= cnt; i++) {
				out.print("아이템 : <input type=\"text\" name = \"game_title_i\">");	
			}
			
		%>
	<input type="text" name = "count" style="hidden">
	<input type="submit" value="랜덤 뽑기">
	
	</form>





</body>
</html>