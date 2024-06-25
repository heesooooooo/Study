<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 
		데이터 전송조건 3가지를 지키고 있나?
		1) 어디로 보낼 건지: form 태그의 action
		2) 무엇을 보낼 건지: input 태그의 name
		3) 언제 보낼 건지: input 태그의 type="submit" 버튼
	 -->

	<h3>로그인 페이지</h3>
	<form action="LoginCheck" method="post">
		아이디 : <input type="text" name="id">
		<br>
		비밀번호 : <input type="text" name="pw">
		<br>
		<input type="submit" value="로그인">
	</form>


</body>
</html>