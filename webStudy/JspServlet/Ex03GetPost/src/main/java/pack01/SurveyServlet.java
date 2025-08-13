package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SurveyServlet")
public class SurveyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SurveyServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String user_job = request.getParameter("job");
		String user_gen = request.getParameter("gender");
		String[] user_hobby = request.getParameterValues("hobby");
		
		out.println(user_job+"<br>");
		out.println(user_gen+"<br>");
		
		for(int i = 0; i<user_hobby.length; i++) {
			out.print(user_hobby[i]);
			out.print(" ");
		}
		
		
		
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		

	}

}
