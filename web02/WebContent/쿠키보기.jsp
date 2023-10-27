<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//브라우저에 심어놓은 쿠키들을 한꺼번에 다 가지고 온다
	//브라우저---> 서버 , request
	Cookie[] cookies = request.getCookies(); //Cookie[]
	//{cookie1,cookie2,cookie3} + length(3), cookie = name + value
	String name = ""; //초기값 넣어두기. 누적을 시킬 때는 "", 아니면 null
	String value = "";
	//==>서블릿으로 변환될 때 servie() 메서드 안으로 들아가서 코드 생성 
	for (Cookie c : cookies) {
		/* name = name + " " + c.getName();
		value = value + " " + c.getValue(); */
		out.print(c.getName() + " " + c.getValue() + "<br>");
		
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	쿠키의 개수 <%=cookies.length%>개<br>
	쿠키의 이름 <%= name %><br>
	쿠키의 값 <%= value %><br>
	<a href="특정한쿠키지우기.jsp">특정한쿠키지우기</a>
</body>
</html>