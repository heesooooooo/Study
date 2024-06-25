package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex06_MakeTable")
public class Ex06_MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 데이터 꺼내오기 (printwriter 위에)
		int num = Integer.valueOf(request.getParameter("num"));

		
		PrintWriter out = response.getWriter();
		
		
		out.print("<html>");
		out.print("<body>");
		
		out.print("<table border=1 >");
		out.print("<tr>");
		
		for(int i=1; i<=num; i++) {
			out.print("<td>" + i + "</td>");
		}
		
		out.print("</tr>");
		out.print("</table>");
		
		out.print("</body>");
		out.print("</html>");
		
		
	
	}

}
