package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03_plus")
public class Ex03_plus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	int data1 = Integer.valueOf(request.getParameter("data1"));
	int data2 = Integer.valueOf(request.getParameter("data2"));
	
	
	int result = data1 + data2;
	
	PrintWriter out = response.getWriter();
	out.print(result);
	
	
	
	
	
	}

}
