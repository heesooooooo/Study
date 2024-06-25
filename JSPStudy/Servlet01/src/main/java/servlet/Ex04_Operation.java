package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex04_Operation")
public class Ex04_Operation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. html에서 넘겨주는 데이터 꺼내오기 -> 두개 데이터 꺼내오기
		// - 꺼내온 데이터 변수에 저장하기

		// 형 변환 
		// Integer.valueOf() , Integer.parseInt()
 		int num1 = Integer.valueOf(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		// + 선택한 연산자 데이터 꺼내오기
		String op = request.getParameter("op");

		// 2. 꺼내온 데이터 연산 진행하기
		// + 연산에 따라 해당 연산을 진행할 수 있는 로직 -> 조건문
		int result = 0;
		if(op.equals("+")){  	// 문자열 비교 .equals("")
			result = num1+num2;
		}else if(op.equals("-")){
			result = num1-num2;
		}else if(op.equals("*")){
			result = num1*num2;
		}else {
			result = num1/num2;
		}
		
		// 3. 화면에 결과값이 출력되도록 만들기
		PrintWriter out = response.getWriter();
		out.print(result);
		
	
	
	
	
	}

}
