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
          
          int result = dao.delete(id); // 1,0
          
          String resultText = "회원 탈퇴 실패.";
          String resultText2 = "는 없는 아이디입니다.";
          String resultImg = "sad.png";
          if(result == 1){
         	 resultText = "회원 탈퇴 성공";
         	 resultText2 = "의 탈퇴가 완료되었습니다.";
         	 resultImg = "happy.png";
          }
     %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MEMBER DELETE JSP</title>
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
</style>
</head>
<body bgcolor="lavender">
<h5><%= resultText %></h5>
<hr color = "blue">
<img src="img/<%=resultImg%>" width="10%"><br>
<%= id %> <%= resultText2 %><br>
<br>
<a href="index.html">첫 페이지로</a><br>
<a href="member.html">회원정보 페이지로</a>
</body>
</html>