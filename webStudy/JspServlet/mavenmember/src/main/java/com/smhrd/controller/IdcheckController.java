package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.model.MemberDAO;

@WebServlet("/IdcheckController")
public class IdcheckController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		MemberDAO dao = new MemberDAO();
		int count = dao.idCheck(id);
		
		boolean available = false;
		if (count == 0) {
			available = true;
		}
		// JSON 형태로 응답하기
		response.setContentType("application/json; charset=UTF-8");
		response.getWriter().write("{ \"available\" : " + available + "}");
		System.out.println("가능 여부 : "+ available);
	}

}
