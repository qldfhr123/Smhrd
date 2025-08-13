package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MavenMember;


@WebServlet("/LogoutController")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 세션 삭제
		HttpSession session = request.getSession();
		session.removeAttribute("member");
		//삭제후 다시 index.jsp 이동 로그인 회원가입 버튼이 살아있어야함
		response.sendRedirect("index.jsp");
	}

}
