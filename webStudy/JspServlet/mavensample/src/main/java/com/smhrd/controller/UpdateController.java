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

@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		
		HttpSession session = request.getSession();
		
		MavenMember member = (MavenMember) session.getAttribute("member");
		
	
		if(member != null) {
			member.setName(name);
			MemberDAO dao = new MemberDAO();
			int result = dao.update(member);
			
			System.out.println(result);
			
			if(result >0 ) {
				// 수정된 정보 다시 지정
				session.setAttribute("member", member);
				response.sendRedirect("Mypage.html");
			}
		}
		
		
//		HttpSession session = request.getSession();
//		
//		MavenMember sessionMember = (MavenMember) session.getAttribute("member");
//		String id = sessionMember.getId();
//		String name = request.getParameter("name");
//		
//		MavenMember member = new MavenMembe(id,null,name);
//		
//		MemberDAO dao = new MemberDAO();
//		int result = dao.update(member);
//		
		
		
		
		
	}

}
