<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	BbsDAO dao = new BbsDAO();
	ArrayList<BbsVO> list = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BBS List JSP</title>
<style>
* {
	font-family: "마루 부리";
	font-size: 20px;
	text-align: center;
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

td {
	width: 120px;
}

.top {
	background: blue;
	color: white;
}

.no {
	width: 70px;
}

#content {
	width: 220px;
}
</style>
</head>
<body bgcolor="lavender">
	<h5>게시글검색 결과 (여러개)</h5>
	<hr color="blue">

	<table border="1" align="center">
		<tr class="top">
			<td class="no">번호</td>
			<td>제목</td>
			<td id="content">내용</td>
			<td>작성자</td>
		</tr>
		<!-- 반복문(for) 필요 -->
		<%
			//스크립트릿 
			for (BbsVO bag : list) { //{bag, bag, bag, ...}
		%>
		<tr>
			<td class="no"><%=bag.getNo()%></td>
			<td><%=bag.getTitle()%></td>
			<td><%=bag.getContent()%></td>
			<td><%=bag.getWriter()%></td>
		</tr>
		<%
			} //for
		%>
	</table>

	<br>
	<a href="index.html">첫 페이지로</a>
	<br>
	<a href="bbs.html">게시판정보 페이지로</a>
</body>
</html>