<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Cookie c1 = new Cookie("like", "운동");
    Cookie c2 = new Cookie("field", "축구");
    response.addCookie(c1);
    response.addCookie(c2);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="page02.jsp">쿠키보기</a>
</body>
</html>