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
		Redirect 와 Forward 차이
		
		Redirect
		- 클라이언트에게 다시 페이지를 요청 URL 주소 변화 oo
		- request, response
		- 데이터 전달 힘들다 >> url에 정보를 담아서 보냄
		Forward
		- 서버 내부에서 페이지 전환
		- URL 주소 변화 X
		- 같은 객체 사용가능
		- 데이터 전달 가능 메소드가 있다
		- request.setAttribute()
	 -->
	 <h1>ForwardStrat</h1>
	 <% 
	 	// 데이터를 전달
	 	request.setAttribute("name", "이름");
	 	
	 	// 페이지 재요청 세팅
	 	RequestDispatcher dp = request.getRequestDispatcher("Ex07ForwardEnd.jsp");
	 	
	 	// 페이지 이동시 (요청, 응답 객체를 같이 보냄)
	 	dp.forward(request, response);
	 	
	 	
	 %>
	 
	 
	 
	 
	 


</body>
</html>