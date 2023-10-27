<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
        if(session.getAttribute("id") == null){
    	//로그인X
    	out.print("로그인되지 않았습니다. 먼저 로그인을 해주세요.<br>");
    	out.print("로그인 아이디 : <input name=id>");
    }else{
    	out.print(session.getAttribute("id")+ "님이 로그인했습니다.");
    }%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
메일 페이지 - 로그인되었을 때만 메일 목록을 확인할 수 있습니다.

</body>
</html>