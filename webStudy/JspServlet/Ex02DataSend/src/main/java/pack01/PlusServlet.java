package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PlusServlet")
public class PlusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public PlusServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		
		String frist = request.getParameter("frist");
		String second = request.getParameter("second");
		
		 int frist_ = Integer.parseInt(frist);        
		 int second_ = Integer.parseInt(second);
		 int sum = frist_ + second_;
		 
		 out.print(frist);
		 out.print("+");
		 out.print(second);
		 out.print("="+sum);
		 
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}            

}
