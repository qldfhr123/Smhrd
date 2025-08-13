package pack01;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;


@WebServlet("/Ex03LoginCheck")
public class Ex03LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Ex03LoginCheck() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("pw");
		
		if(user_id.equals("test") && user_pw.equals("12345")) {
			HttpSession session = request.getSession();
			session.setAttribute("id", user_pw);
			response.sendRedirect("Ex03LoginMain.jsp");
		}else {
			// 정보 전달 할필요없다
			response.sendRedirect("Ex03LoginForm.html");
		}
		

	}

}
