package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.MavenMember;
import com.smhrd.model.MemberDAO;

@WebServlet("/JoinController")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		MavenMember member = new MavenMember(id,pw,name);
			
		// member 매개변수로 주고 가입 메소드 실행
		MemberDAO dao = new MemberDAO();
		int res = dao.join(member);
		
		System.out.println("회원가입 쿼리 실행 결과: "+res);
		
		if (res > 0 ) {
			// 회원가입 성공시
			// -> 로그인 페이지 이동
			response.sendRedirect("Login.html");
		} else {
			response.sendRedirect("Join.html");
		}
		
	}

}
