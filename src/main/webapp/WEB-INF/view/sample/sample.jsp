<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jstl 사용을 위한 taglib -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <img src="resources/images/spongebob.png" width="100px;"> -->
<!-- Jquey 기능을 가능하게 하는 SCRIPT -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- <script src="resources/js/sample.js"></script> -->
<!-- bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- bootstrap 기능을 가능하세 하는 SCRIPT -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<style type="text/css">
	ul > li{
		font-size: 20px;
		padding: 8px;
	}
</style>

</head>
<body>
<div align="center">
  <h1>게시판 종류</h1>
</div>
<div style="height: 40px;"></div>
<ul>
	<c:forEach items="${category }" var="vo">
	<li><a href="board.do?categoryNum=${vo.categoryNum }">${vo.categoryName}</a></li>
	</c:forEach>
</ul>

</body>
</html>