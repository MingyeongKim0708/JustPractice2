<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Cookie[] cookies = request.getCookies();
    
    for(Cookie c:cookies){
    	String name2 = c.getName();
    	if(!name2.equals("JSESSIONID")){
    		out.print("쿠키이름 : " + c.getName() + " | 쿠키값 : " + c.getValue() +"<br>");
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

</body>
</html>