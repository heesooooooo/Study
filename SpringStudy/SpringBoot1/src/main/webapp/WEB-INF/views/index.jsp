<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cpath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>첫번째 Spring boot 웹페이지</h1>
	<form action="${cpath}/login" method="post">
		ID : <input type="text" name="id">
		<br>
		PW : <input type="text" name="pw">
		<br>
		<input type="submit" value="로그인">
	</form>
	<a href="${cpath}/join">회원가입 하러가기</a>



</body>
</html>