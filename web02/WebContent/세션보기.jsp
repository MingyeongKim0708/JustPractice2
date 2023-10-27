<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	out.print(session.getAttribute("name")+"<br>");
       	out.print(session.getAttribute("age")+"<br>");
       	//if(session.getAttribute("age") != null){
    		int age2 = (int) session.getAttribute("age");
    	//}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션에 저장된 name값은 ${name}<br>
세션에 저장된 age값은 ${age}<br>
내년의 내나이는 <%= age2 + 1 %>세
</body>
</html>