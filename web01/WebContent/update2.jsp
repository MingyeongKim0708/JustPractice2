<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String no = request.getParameter("no");
String content = request.getParameter("content");
String title = request.getParameter("title");

	BbsDAO dao = new BbsDAO();

	int result = dao.update(title, content, Integer.parseInt(no));

	String resultText = "게시글 업데이트 실패. 없는 번호입니다.";
	if (result == 1) {
		resultText = "게시글 수정 성공";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BBS UPDATE JSP</title>
<style>
* {
	font-family: "마루 부리";
	font-size: 20px;
}
a {
	color: blue;
	text-decoration: none;
	cursor: pointer;
}

a:hover {
	color: red;
	text-decoration: none;
}
</style>
</head>
<body bgcolor="lavender">
<h5><%= resultText %></h5>
<hr color = "blue">
수정한 게시글 번호는 <%= no %><br>
수정한 게시글 제목은 <%= title %><br>
수정한 게시글 내용은 <%= content %><br><br>
<a href="index.html">첫 페이지로</a><br>
<a href="bbs.html">게시판정보 페이지로</a>
</body>
</html>