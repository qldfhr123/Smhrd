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
		
		int count = 0;
		// 쿠기가 있는지 없는지 확인 >> 모든 쿠키 확인
		 Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies){
			if(c.getName().equals("visitCount")){
				count = Integer.parseInt(c.getValue());				
			}
		}
		// 쿠키에 하나씩 카운트 올리기
		count++;
		
		Cookie visit = new Cookie("visitCount",String.valueOf(count));
		visit.setMaxAge(10);
		response.addCookie(visit);
	%>
	
	
	<h2> 당신은 이 페이지를 <%= count %>번 방문했습니다</h2>
		
	


</body>
</html>