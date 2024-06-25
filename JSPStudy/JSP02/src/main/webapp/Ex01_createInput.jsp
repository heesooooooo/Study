<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body align="center">

	<!-- 
		1. html이 보내주는 데이터 꺼내오기
		
		2. 
		주제를 입력할 수 있는 input태그 필요
		꺼내온 데이터의 값에 따라 아이템을 입력할 수 있는 input태그 생성하기
		데이터를 보낼 수 있는 구조로 만들어 전달
		3. 
	 -->


	<fieldset>
		<legend>랜덤당첨 작성</legend>

	<%
		request.setCharacterEncoding("utf-8");
		int num = Integer.parseInt(request.getParameter("num"));
	%>	
		
		<form action="Ex01_randomWinner.jsp" method="post">
			주제: <input type='text' name='title'><br>
			
			<% 
				for(int i=1; i<=num; i++){	
					// 아이템의 내용을 입력할 수 있는 input태그 생성
					// 1. for문의 영역을 완벽하게 구분하여 작성한다.
					// 2. 내장객체인 out을 사용하여 태그를 입력한다.
					out.print("아이템" + i + ":" + "<input type='text' name='item'><br>");
				} %>
			
			<input type='submit' value='시작'>
		</form>
		
	</fieldset>

</body>
</html>