<%@page import="bean.MemberVO"%>
<%@page import="bean.CarDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
    jsp에서 해야하는 작업 3가지
    1) 데이터를 받아서 저장
    2) DAO를 이용해서 데이터를 주며 DB처리 요청
    3) 요청에 대한 결과를 html로 만든다.
     -->
     <%
     	String id = request.getParameter("id");
          
          CarDAO dao = new CarDAO();
          MemberVO bag = dao.one(id);// MemberVO bag
          /* 자동import : 클릭하고나서 컨트롤 +쉬프트 + m */
     %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MEMBER ONE JSP</title>
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
<h5>회원검색 결과 (한명)</h5>
<hr color = "blue">
검색한 아이디는 <%= bag.getId() %> <br>
검색한 비밀번호는 <%= bag.getPw() %> <br>
검색한 이름은 <%= bag.getName() %> <br>
검색한 전화번호는 <%= bag.getTel() %> <br>
<br>
<a href="index.html">첫 페이지로</a><br>
<a href="member.html">회원정보 페이지로</a>
</body>
</html>