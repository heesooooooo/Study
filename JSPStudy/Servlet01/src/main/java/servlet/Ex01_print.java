package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// annotation 어노테이션
// 주석처럼 사용되는 기능 -> 차이점 : 무언가를 실제로 실행할 수 있는 기능을 가지고 있다
// 컴파일이나 배포, 실행할 때 참조할 수 있는 주석
// 클래스나 필드, 메소드에 대해 부가정보 등록 가능



// @WebServlet - url 맵핑 기술
// 	:Web browser에서 Servlet을 동작시키기 위해 실제 Java 클래스의 이름 대신,
// 	 Servlet을 요청하기 위한 문자열을 Servlet 클래스와 Mapping(맵핑)시키는 것
// 경로가 드러남 -> 보안상의 문제

@WebServlet("/print")
public class Ex01_print extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 한글 인코딩 작업
		response.setContentType("text/html; charset=utf-8");
		
		// 2. 웹 화면에 출력문 띄우기
		PrintWriter out = response.getWriter();
		
		out.print("<h1>엄...</h1>");	
	}

}
