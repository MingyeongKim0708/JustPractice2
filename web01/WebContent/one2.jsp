<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
    jsp에서 해야하는 작업 3가지
    1) 데이터를 받아서 저장
    2) DAO를 이용해서 데이터를 주며 DB처리 요청
    3) 요청에 대한 결과를 html로 만든다.
     -->
<%
	String no = request.getParameter("no");

	BbsDAO dao = new BbsDAO();

	BbsVO bag = dao.one(Integer.parseInt(no));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BBS ONE JSP</title>
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

td {
	width: 400px;
}

.left {
	/* 여러개를 선택해서 지정하고 싶을 때 클래스를 사용. 클래스 중 left에 해당하는 것만 스타일을 지정해라. */
	/* 클래스 선택은 .클래스명 */
	width: 120px;
	background: blue;
	color: white;
	text-align: center;
}
</style>
</head>
<body bgcolor="lavender">
	<h5>게시글 검색 결과 (한개)</h5>
	<hr color="blue">
	<table border="1" align="center">
		<tr>
			<td class="left">번호</td>
			<td><%=bag.getNo()%></td>
		</tr>
		<tr>
			<td class="left">제목</td>
			<td><%=bag.getTitle()%></td>
		</tr>
		<tr>
			<td class="left">내용</td>
			<td><%=bag.getContent()%></td>
		</tr>
		<tr>
			<td class="left">작성자</td>
			<td><%=bag.getWriter()%></td>
		</tr>
	</table>

	<br>
	<a href="index.html">첫 페이지로</a>
	<br>
	<a href="bbs.html">게시판정보 페이지로</a>
</body>
</html>