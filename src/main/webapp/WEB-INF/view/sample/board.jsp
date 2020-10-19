<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<style type="text/css">
	tr, td{
		border: 1px solid black;
		border-collapse: collapse;
	}
</style>
</head>
<body>
<div align="center">
<h1>게시판 리스트</h1>

<table class="table table-striped">
	<tr class="a">
		<td>글번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>날짜</td>
		<td>조회수</td>
	</tr>
	<c:forEach items="${board }" var="vo">
	<tr>
		<td>${vo.boardNum }</td>
		<td>${vo.boardTitle }</td>
		<td>${vo.boardWriter }</td>
		<td>${vo.createDate }</td>
		<td>${vo.readCnt }</td>
	</tr>
	</c:forEach>	
	
</table>

</div>
</body>
</html>