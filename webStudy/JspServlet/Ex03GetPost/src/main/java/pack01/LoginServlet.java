package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	// 클라이언트가 POST 방식으로 요청했을떄 실행될 메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// URL이 기본적을 UTF-8이므로 GET은 인코딩 해주지 않아도된다
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("pw");

		String set_id = "admin1234";
		String set_pw = "1234";

		if (user_id.equals(set_id) && user_pw.equals(set_pw)) {
			System.out.println("로그인 성공");
			out.print(user_id+"님 환영합니다!!!");
		} else if (!(user_id.equals(set_id)) || !(user_pw.equals(set_pw))) {
			System.out.println("입력한 정보는가 다릅니다");
			out.print("입력한 정보는가 다릅니다");
		}
		

	}

}
