<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jstl 사용을 위한 taglib -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Jquey 기능을 가능하게 하는 SCRIPT -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- <img src="resources/images/spongebob.png" width="100px;"> -->
<script src="resources/js/boardDetail.js?ver=1"></script>
<!-- bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- bootstrap 기능을 가능하세 하는 SCRIPT -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style type="text/css">
	table {
		border: 1px solid black;
		width: 900px;
		border-collapse: collapse;
		height: auto;
	}

	tr, td {
		border: 1px solid black;
		border-collapse: collapse;
		padding: 6px;
	}

	.title {
		background: #eeeeee;
		text-align: center;
	}
	
	.bb > input{
		width: 98%;
	}
	pre{
		width: 809px;
		height: 500px;
		border: none;
		background: none;
	}
</style>

</head>
<body>
	<div align="center">
	
		<div style="height: 40px;"></div>
		<h1>게시글 작성 화면</h1>
		<div style="height: 40px;"></div>

			<table>
				<colgroup>
					<col width="10%">
					<col width="40%">
					<col width="10%">
					<col width="40%">
				</colgroup>
				<tr>
					<td class="title">제목</td>
					<td class="bb">${detail.boardTitle }</td>
					<td class="title">작성자</td>
					<td class="bb">${detail.boardWriter }</td>
				</tr>
				<tr height="500px;">
					<td class="title">내용</td>
					<td colspan="3"><pre>${detail.boardContent }</pre></td>
				</tr>
			</table>
</div>
<div style="height: 10px;"></div>
<hr>
<div>
	<p style="padding-left: 840px; font-size: 20px;">댓글</p>
	
	<div>
		<ul>
			<li>댓글1</li>
			<li>댓글2</li>
			<li>댓글3</li>
		</ul>
	</div>
	<div>댓글 쓰는곳</div>
</div>

<input type="hidden" value="${detail.boardNum }" id="btnD1">
<input type="hidden" value="${detail.categoryNum }" id="btnD2">


<div style="height: 30px;"></div>
<div align="center">
<button type="button" class="btn btn-success" id="updateBtn">글수정</button>
<button type="button" class="btn btn-success" id="deleteBtn">글삭제</button>
</div>
	
	
</body>
</html>