<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<c:set var="cpath" value="${pageContext.request.contextPath}" />

<!--  == controller -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	<div class="container">

		<h1>보유 도서 현황</h1>
		<br>
		<table class="table table-bordered table-hover">
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>작가</td>
				<td>출판사</td>
				<td>ISBN</td>
				<td>보유도서수</td>
			</tr>

			<c:forEach items="${list}" var="b">
				<tr>
					<td>${b.num}</td>
					<td>${b.title}</td>
					<td>${b.author}</td>
					<td>${b.company}</td>
					<td>${b.isbn}</td>
					<td>${b.count}</td>
				</tr>
			</c:forEach>
		</table><br><br>

		<div>
			<form action="${cpath}/bookInsert.do" method="post">
				<h1>도서 입력</h1><br>
					<div>
						<label for="title">제목 :</label>
						<input name="title" type="text" id="title">
					</div>
					<div>
						<label for="author">작가 :</label>
						<input name="author" type="text" id="author">
					</div>
					<div>
						<label for="company">출판사 :</label>
						<input name="company" type="text" id="company">
					</div>
					<div>
						<label for="isbn">ISBN :</label>
						<input name="isbn" type="text" id="isbn">
					</div>				
					<div>
						<label for="count">보유도서 수 :</label>
						<input name="count" type="text" id="count">
					</div>
				<button type="submit" class="btn btn-success btn-sm">등록</button>
			</form>
		</div>
	</div>
	
	<script type="text/javascript">
		var cpath = "${cpath}";
	</script>
	<script src="resources/js/myfirstjs.js"></script>
</body>
</html>