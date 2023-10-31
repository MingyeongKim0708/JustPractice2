<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	//세션끊자- 각 브라우저에 해당하는 서버 램에 저장했던 값들을 삭제
	//id 삭제 ==> sesison 내장 객체
	session.invalidate(); //세션을 무효로 만듦
	//첫페이지로 이동 ==> 서버가 브라우저에 명령(response 내장 객체)
	response.sendRedirect("member.jsp");
%>