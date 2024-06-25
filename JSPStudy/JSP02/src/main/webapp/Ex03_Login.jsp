<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- html에서 보내주는 데이터를 활용하여 로그인이 가능한지 판단하는 페이지
		 요청을 받고 다시 응답을 해줘야 한다
	 -->

	<% 
		// 0. 요청에 대한 인코딩 작업 진행
		request.setCharacterEncoding("utf-8");
		
		
		// 1. 요청(post 방식)의 값을 받아오기
		String id = request.getParameter("id"); // smart담겨있음
		String pw = request.getParameter("pw");
	
		// 2. 사용자가 입력한 데이터가 로그인이 가능한지 판단
		// 		- smart/123
		if(id.equals("smart") & pw.equals("123")){
			// 로그인 성공의 상태
			// Login.jsp에서 새롭게 요청을 전달하는 위치
			// 보내고 싶은 / 공유하고 싶은 데이터를 포함하여 요청한다
			// -> get방식에서 사용할 수 있는 Query String 문법
			// data라는 변수명에 id 담아서 보내준다
			// response.sendRedirect("Ex03_LoginSuccess.jsp?data=" + id);
		
			// forward 방식 : 요청에 대한 내용을 공유하며 새로운 요청을 할 수 있는 기법
			RequestDispatcher rd = request.getRequestDispatcher("Ex03_LoginSuccess.jsp");
			// 공유하고자 하는 데이터 연결하기
			request.setAttribute("id", id);
			rd.forward(request, response);
		
		
		} else{
			// 로그인 실패의 상태
			response.sendRedirect("Ex03_LoginFail.jsp");
		}
	%>
	

</body>
</html>