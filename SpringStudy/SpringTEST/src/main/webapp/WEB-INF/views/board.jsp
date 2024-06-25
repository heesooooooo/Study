<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:set var="cpath" value="${pageContext.request.contextPath}"/>
<!--  == controller -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

			<table class="table table-bordered table-hover">
				
				<!-- JSTL/EL 사용해서 request 영역 안에 저장돼 있는 게시글 정보를 전부 화면에 출력 -->
				<!-- var: 사용할 변수명 -->
				<c:forEach items="${list}" var="b">
					<tr>
						<td>${b.idx}</td>
						<td>
							<!-- 1. QueryString으로 데이터 보내기 (?idx=)
								 2. 경로상에 그냥 바로 데이터 포함해서 보내기 (PathVariable)
							-->
							<a href="${cpath}/boardContent/${b.idx}">${b.title}</a>
						</td>
						<td>${b.writer}</td>
						<td>${b.indate}</td>
					</tr>
				</c:forEach>
			</table>
	
	
	
	
	
	
	
	
</body>
</html>