<%@page import="java.util.Random"%>
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
		1. createInput.jsp 에서 넘겨주는 
			title, item 데이터 꺼내오기
			
		2. 가지고 온 item의 갯수에 따라 랜덤으로 한가지 주제 출력
	 -->

	<%
		// 1. post방식의 한글 데이터 인코딩 작업하기
		request.setCharacterEncoding("utf-8");
	%>
	
	<fieldset>
		<legend>랜덤당첨결과</legend>
		
		<%
			String title = request.getParameter("title"); 
			// 다수의 데이터가 하나의 그룹으로 지정되어 있을 때 꺼내오는 방법
			String[] items = request.getParameterValues("item"); 
			// items = ["햄버거", "피자", "치킨"]
			
			// 3. 랜덤수 생성하기
			Random ran = new Random();
			//int i = ran.nextInt(items.length); // 3 -> 0,1,2
			
			String result = items[ran.nextInt(items.length)];
		%>
			
		<%= title %> <br>
		<%-- <%= items[i] %> --%>
		<%= result %>
		
	</fieldset>

</body>
</html>