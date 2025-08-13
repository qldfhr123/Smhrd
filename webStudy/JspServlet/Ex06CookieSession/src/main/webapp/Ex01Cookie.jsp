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
		// 쿠키 객체 생성
		Cookie ck = new Cookie("test","testCookie");
		
		// 만료 기간
		ck.setMaxAge(10);
		
		// 클라이언트로 쿠키 응답
		response.addCookie(ck);
		
		// 생성과 동시 응답에 넣기 (만료기간 설정 힘듬)
		response.addCookie(new Cookie("name","이름"));
		response.addCookie(new Cookie("name1","이름1"));
		
		// 생성되어있는 모든 쿠키 가져오기ㅏ
		Cookie[] cookies = request.getCookies();
		
		// for-each 사용해서 쿠키정보 출력
		for(Cookie c : cookies){
			out.print(c.getName() +" : "+ c.getValue());
			out.print("<br>");
		}
	
	%>


</body>
</html>