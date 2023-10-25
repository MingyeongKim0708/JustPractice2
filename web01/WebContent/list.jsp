<%@page import="bean.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	MemberDAO dao = new MemberDAO();
	ArrayList<MemberVO> list = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member List JSP</title>
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
</style>
</head>
<body bgcolor="lavender">
	<h5>회원검색 결과 (여러명)</h5>
	<hr color="blue">

	<table border="1" align="center">
		<tr class = "top">
			<td>아이디</td>
			<td>패스워드</td>
			<td>이름</td>
			<td>전화번호</td>
		</tr>
		<!-- 반복문(for) 필요 -->
		<%
			//스크립트릿 
			for (MemberVO bag : list) { //{bag, bag, bag, ...}
		%>
		<tr>
			<td><%=bag.getId()%></td>
			<td><%=bag.getPw()%></td>
			<td><%=bag.getName()%></td>
			<td><%=bag.getTel()%></td>
		</tr>
		<%
			} //for
		%>
	</table>

	<br>
	<a href="index.html">첫 페이지로</a>
	<br>
	<a href="member.html">회원정보 페이지로</a>
</body>
</html>