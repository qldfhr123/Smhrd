package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FormServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// getParameter("form의 name값")
		// 요청 관련 객체가 가지고 있는 파라미터 값을 String으로리턴
		String form_id = request.getParameter("id");
		System.out.println(form_id);
		
		// 인코딩 오류
//		PrintWriter out = response.getWriter();
//		out.print(from_id);
		
		// 브라우저 출력하기 위해 응답 데이터의 인코딩 형식을 지정
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print(form_id);
		

		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
