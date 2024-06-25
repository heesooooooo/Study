<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		// 1. post로 넘어오는 요청에 대하여 인코딩 작업!
		request.setCharacterEncoding("utf-8");
		
		// 2. 요청에 대한 데이터값 꺼내오기 -> 3개 데이터
		int num1 = Integer.valueOf(request.getParameter("num1"));
		int num2 = Integer.valueOf(request.getParameter("num2"));
		String op = request.getParameter("op");
		
		// 3. 가져온 데이터에 대한 로직 처리
		int result=0;
		if (op.equals("+")){
			result = num1+num2;
		}else if (op.equals("-")){
			result = num1-num2;
		}else if (op.equals("*")){
			result = num1*num2;
		}else{
			result = num1/num2;
		}
	%>
	
	
	<%= 
		// 4. 결과에 대한 출력화면 만들기
		num1+op+num2+"="+result 
	%>
	<br> 
	<!-- 다르게 쓰는 방법 -->
	<%= num1 %><%= op %><%= num2 %>=<%= result %>



</body>
</html>