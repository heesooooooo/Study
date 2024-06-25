package sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02_GetPost")
public class Ex02_GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// post 방식일 때!
		// 넘겨주는 요청에 대한 한글 인코딩이 필요하다
		request.setCharacterEncoding("utf-8");
		
		// 1. 보내주는 데이터 꺼내오기
		String name = request.getParameter("name");
		
		// 2. 응답화면에 한글이 띄워지도록 인코딩 작업
		response.setContentType("text/html; charset= utf-8");
	
		// 3. 출력을 위한 기능 가져오기
		PrintWriter out = response.getWriter();
		
		out.print("입력한 이름 : " + name);
				
		
		// 클라이언트가 전송한 요청 데이터 인코딩 방식 지정
		// request.setCharacterEncoding("utf-8");
		
		// 클라이언트에 응답할 페이지 
		// response.setContentType("charset= utf-8");
		
	}

}
