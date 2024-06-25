package sevlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03_UserInfo")
public class Ex03_UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 요청에 대한 인코딩 작업 (post방식이면 무조건!!)
		request.setCharacterEncoding("utf-8");
		
		// 2. 요청에 대한 데이터 꺼내오기
		String job = request.getParameter("job");
		String gender = request.getParameter("gender");
		
		// 여러개의 값을 하나의 name값으로 전송할 때 (복수 체크)
		// getParameterValues()로 값을 찾아온다
		// -> 해당 메소드는 여러개의 데이터를 담아야 하므로 
		//    리턴타입은 String[] 형태!
		String[] hobby = request.getParameterValues("hobby");
		
		
		// 3. 콘솔창에 데이터 띄워보기
		System.out.println("job : " + job);
		System.out.println("gender : " + gender);
		// System.out.println("hobby : " + hobby);
		
		for(String data : hobby) {
			System.out.println("hobby : " + data);
		}
		
	}

}
