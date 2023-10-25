<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    String tel = request.getParameter("tel");
    
    MemberDAO dao = new MemberDAO();
    
    int result = dao.update(id, tel);
    
    String resultText = "회원 수정 실패. 없는 아이디입니다.";
    if(result == 1){
   	 resultText = "회원 수정 성공";
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
수정한 아이디는 <%= id %> <br>
수정한 전화번호는 <%= tel %>입니다. <br><br>
<a href="index.html">첫 페이지로</a><br>
<a href="member.html">회원정보 페이지로</a>
</body>
</html>