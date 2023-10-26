<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	String tel = request.getParameter("tel");

	MemberDAO dao = new MemberDAO();

	int result = dao.update(id, tel);

	String resultText = "회원 수정 실패.";
	String resultText2 = "해당하는 아이디가 없습니다.";
	String resultImg = "sad.png";
	if (result == 1) {
		resultText = "회원 수정 성공";
		resultText2 = "수정이 완료 되었습니다.";
		resultImg = "happy.png";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MEMBER UPDATE JSP</title>
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
	width: 300px;
}

.left {
	width: 120px;
	background: blue;
	color: white;
	text-align: center;
}
</style>
</head>
<body bgcolor="lavender">
	<h5><%=resultText%></h5>
	<hr color="blue">
	<img src="img/<%=resultImg%>" width="10%">
	<br>
	<table border="1" align="center">
		<tr>
			<td class="left">아이디</td>
			<td><%=id%></td>
		</tr>
		<tr>
			<td class="left">회원전화</td>
			<td><%=tel%></td>
		</tr>
	</table>
	<br>
	<%=resultText2%>
	<br><br>
	<a href="index.html">첫 페이지로</a>
	<br>
	<a href="member.html">회원정보 페이지로</a>
</body>
</html>