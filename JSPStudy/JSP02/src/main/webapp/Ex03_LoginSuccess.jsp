<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">

	<!-- 로그인이 성공되었을 때 볼 수 있는 화면
		 "~~님 환영합니다"
	 -->


	<fieldset>
		<% 
			// get방식의 Query String 문법 사용시 데이터 꺼내오기
			// String id = request.getParameter("data");
			
			// forward 방식으로 넘어온 데이터 꺼내오기
			// getAttribute()의 반환타입은 Object이므로 변수에 저장할 때에는 형변환이 필요하다
			String id = (String)request.getAttribute("id");
		
		
		%>
					
		<%= id %>님 환영합니다! <br>
		<a href="Ex03_Login.html">로그아웃</a>	
	
	</fieldset>
	
</body>
</html>