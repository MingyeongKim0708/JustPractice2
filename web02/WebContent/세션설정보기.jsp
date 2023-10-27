<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	int view = (int)session.getAttribute("view"); //int(작) <--Object(큰)
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
저장된 세션 값은 <%=view %> <!-- 조회수 -->
<a href="조회수증가.jsp">조회수증가</a>
</body>
</html>