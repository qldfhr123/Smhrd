package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TableServlet")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TableServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		
		String table_cnt = request.getParameter("table_cnt");
		int table_count = Integer.parseInt(table_cnt);
		
		
		out.print("<table border=\"1px solid black\">");
		out.print("<tr>");
			for(int i = 1; i <= table_count; i++) {
				out.print("<th>"+i+"</th>");
				// tr 가능
			}	
		out.print("</tr>");
		out.print("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
