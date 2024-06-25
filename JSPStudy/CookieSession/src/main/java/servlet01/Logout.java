package servlet01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 세션 데이터 전부 삭제하기
		request.getSession().invalidate();
		// HttpSession session에 담지 않아도 됨
		
		// 2. Loginform.jsp로 redirect방식으로 이동하기
		response.sendRedirect("Loginform.jsp");
	
	
	
	}

}
