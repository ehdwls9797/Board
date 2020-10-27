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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="resources/js/board.js?ver=5"></script>
<style type="text/css">
	tr, td{
		text-align: center;
	}
</style>
</head>
<body>
<input type="hidden" value="${category }" id="boardCategory">
<div style="height: 30px;"></div>
<div align="center">
	<form action="board.do" method="post">
	<table border="1" style="width: 800px;">
		<tr>
			<td align="center">검색조건</td>
			<td align="center">
				<select style="width: 95%" name="searchKeyword">
					<option value="BOARD_TITLE">제목</option>
					<option value="BOARD_WRITER">작성자</option>
				</select>
			</td>
		
			<td align="center">제목검색</td>
			<td align="center"><input type="text" style="width: 98%" name="searchValue"></td>
			<td align="center"><input type="submit" value="검색" style="width: 98%"></td>
		</tr>
	</table>
	<input type="hidden" value="${category }" name="categoryNum" id="boardCategory">
	</form>
</div>

<!-- 자유게시판 -->

<c:if test="${category == 1 }">
<div align="center">
<div style="height: 50px;"></div>
<h1>${categoryName.categoryName }</h1>
<div style="height: 50px;"></div>
<table class="table table-striped">
	<tr>
		<td>글번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>날짜</td>
		<td>조회수</td>
	</tr>
	<c:forEach items="${board }" var="vo">
	<tr>
		<td>${vo.boardNum }</td>
		<!-- 댓글갯수 입력 -->
		<td><a href="boardDetail.do?categoryNum=${category }&boardNum=${vo.boardNum}">${vo.boardTitle }<c:if test="${vo.commentCnt != 0 }"> <span style="color: red"> (${vo.commentCnt})</span></c:if></a></td>
		<td>${vo.boardWriter }</td>
		<td>${vo.createDate }</td>
		<td>${vo.readCnt }</td>
	</tr>
	</c:forEach>
</table>
<button type="button" class="btn btn-success" id="board1">글쓰기</button>

</div>
</c:if>

<!-- 건의게시판 -->
<c:if test="${category == 2 }">
<div align="center">
<div style="height: 50px;"></div>
<h1>${categoryName.categoryName }</h1>
<div style="height: 50px;"></div>
<table class="table table-striped">
	<tr>
		<td>제목</td>
		<td>작성자</td>
		<td>날짜</td>
		<td>조회수</td>
	</tr>
	<c:forEach items="${board }" var="vo">
	<tr>
		<td><a href="boardDetail.do?categoryNum=${category }&boardNum=${vo.boardNum}"><c:if test="${vo.boardGroup != 0}"><span>[답글]</span></c:if>${vo.boardTitle }</a></td>
		<td>${vo.boardWriter }</td>
		<td>${vo.createDate }</td>
		<td>${vo.readCnt }</td>
	</tr>
	</c:forEach>
</table>
<button type="button" class="btn btn-success" id="board2">글쓰기</button>

</div>
</c:if>

<!-- 공지게시판 -->

<c:if test="${category == 3 }">
<div align="center">
<div style="height: 50px;"></div>
<h1>${categoryName.categoryName }</h1>
<div style="height: 50px;"></div>
<table class="table table-striped">
	<tr>
		<td>글번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>날짜</td>
		<td>조회수</td>
	</tr>
	<c:forEach items="${board }" var="vo">
	<tr>
		<td>${vo.boardNum }</td>
		<td><a href="boardDetail.do?categoryNum=${category }&boardNum=${vo.boardNum}">${vo.boardTitle }</a></td>
		<td>${vo.boardWriter }</td>
		<td>${vo.createDate }</td>
		<td>${vo.readCnt }</td>
	</tr>
	</c:forEach>
</table>
<button type="button" class="btn btn-success" id="board3">글쓰기</button>

</div>
</c:if>

</body>
</html>