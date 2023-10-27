<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Cookie[] list = request.getCookies();
	int sum = 0;
	for (Cookie c : list) {
		if (c.getName().equals("apple") || c.getName().equals("ice")) {
			out.print(c.getName() + " " + c.getValue() + "<br>");
			sum = sum + Integer.parseInt(c.getValue());
			//쿠키의 값은 모두 타입이 String
			//쿠키의 값으로 계싼을 할 목적이면 int로 변환 필요
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
apple + ice = <%=sum %>
</body>
</html>