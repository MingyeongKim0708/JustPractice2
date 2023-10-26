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
     
     int result = dao.delete(Integer.parseInt(no));
     
     String resultText = "게시글 삭제 실패. 없는 번호입니다.";
     String resultImg = "sad.png";
     if(result == 1){
    	 resultText = "게시글 성공";
    	 resultImg = "happy.png";
     }
     %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BBS DELETE JSP</title>
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
<img src="img/<%= resultImg %>" width="10%"><br>
삭제한 게시글 번호는 <%= no %> <br><br>
<a href="index.html">첫 페이지로</a><br>
<a href="bbs.html">게시판정보 페이지로</a>
</body>
</html>