package servlet01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 한글 인코딩 잡아주기
		request.setCharacterEncoding("utf-8");
		
		
		
		// 2. id와 pw 데이터 꺼내오기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
	
		// 3. id가 test이면서 pw가 12345와 일치하는지 조건을 비교
		
		if(id.equals("test") && pw.equals("12345")){
			// 4-1. 일치한다면 세션을 꺼내오기
			HttpSession session = request.getSession();
			// 4-2. 세션 안에 내 이름 데이터를 집어넣기
			session.setAttribute("name", "엄희수");
			// 4-3. Main.jsp로 redirect방식으로 이동
			response.sendRedirect("Main.jsp");
		// 5. 일치하지 않는다면, Loginform.jsp로 redirect방식으로 이동
		}else {
			response.sendRedirect("Loginform.jsp");
		}
	
	
	
	
	
	}

}
