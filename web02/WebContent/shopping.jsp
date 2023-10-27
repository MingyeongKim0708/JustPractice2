<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //뉴스 댓글을 쓸 떄 로그인했을 떄와 로그인하지 않았을 떄의 화면이 다름.
    //로그인했을 때, 안했을 때 판단을 세션에 id가 저장되어 있는지 확인해서 판단함
    if(session.getAttribute("id") == null){
    	//로그인X
    	out.print("로그인되지 않았습니다. 먼저 로그인을 해주세요.<br>");
    	out.print("로그인 아이디 : <input name=id>");
    }else{
    	out.print(session.getAttribute("id")+ "님이 로그인했습니다.");
    }
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
쇼핑 페이지 - 로그인되었을 때만 댓글을 작성할 수 있습니다.
</body>
</html>