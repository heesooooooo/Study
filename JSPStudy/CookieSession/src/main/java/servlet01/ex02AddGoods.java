package servlet01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddGoods")
// Servlet을 생성할 때 url mapping을 잡아주면 좋은 점?
// --> /가 없으면 다음 페이지로 넘어가지 않기 때문에, 내 실수를 방지할 수 있다
// 그냥 여기서 수정해도 되나요? >> 네! 

public class ex02AddGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 쿠키를 지우고 싶다면?
		// --> 쿠키데이터를 전부 꺼내오기
		// --> 쿠키들 중 name이 product로 시작되는 데이터들만
		// --> setMaxAge(0)
		
		
		
		// 1. 요청받은 데이터를 꺼내오기
		String[] products = request.getParameterValues("product");
		
		
		for(int i = 0; i<products.length; i++) {
			// 2. 요청받은 데이터의 개수만큼 쿠키 생성하기
			// --> 들어가는 value값 별도로 encoding을 안잡아줘도 된다!
			Cookie cookie = new Cookie("product"+i, products[i]);
			// ** name값은 중복 불가능이다.
			// 3. 요청받은 데이터의 개수만큼 쿠키를 보내주기
			response.addCookie(cookie);

		}
		
		// 4. Shop.jsp 페이지로 이동
		// ✨✨✨ redirect (요청 2번 / 응답 2번) vs forward (요청 1번 / 응답 1번)
		response.sendRedirect("Shop.jsp");
		

		
		
	}

}
