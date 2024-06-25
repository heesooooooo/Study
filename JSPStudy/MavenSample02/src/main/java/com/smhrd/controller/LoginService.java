package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.coyote.Request;

import com.smhrd.database.DAO;
import com.smhrd.model.MemberVO;

@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1. 한글 인코딩
		request.setCharacterEncoding("utf-8");
		
		// 2. 요청데이터 꺼내오기 (2개)
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		
		// 3. 요청데이터들을 하나로 묶어주기
		// vo에 값 4갠데 email,pw값만 넣어주기
		MemberVO vo = new MemberVO();
		vo.setEmail(email);
		vo.setPw(pw);
		
		// 4. DAO 생성하기
		DAO dao = new DAO();
		
		// 5. DAO 안에 있는 로그인 기능 사용하기
		// login에 email,pw필요한데 vo에 저장해놨으니 매개변수로 vo
		MemberVO resultVo = dao.login(vo);  
		
		// 6. 로그인 성공했다면, session 영역에 회원 정보를 저장하기
		if(resultVo != null) {
			// 6-1. session 꺼내오기
			HttpSession session = request.getSession();
			// 6-2. session 데이터 저장하기 (member name값으로 저장)
			session.setAttribute("member", resultVo);
		}
		
		// 7. main.jsp로 redirect 방식으로 이동하기
		response.sendRedirect("main.jsp");
	
	}

}
