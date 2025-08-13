package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MavenMember;
import com.smhrd.model.MemberDAO;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MavenMember member = new MavenMember(id,pw);
		
		MemberDAO dao = new MemberDAO();
		MavenMember result = dao.login(member);
		
		if (result == null) {
			response.sendRedirect("Login.html");
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("member",result);
			response.sendRedirect("index.jsp");
		}
	
	}

}
