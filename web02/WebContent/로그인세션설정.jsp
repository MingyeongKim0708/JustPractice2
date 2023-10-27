<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //로그인 성공한 경우 id를 세션으로 설정해주세요
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    //db에 저장된 id와 pw를 임의로 설정
    String id2 = "apple";
    String pw2 = "1234";
    //id와 id2가 동일하고 pw와 pw2가 동일한지 비교해서 모두 동일하면 id만 세션으로 잡기
    //둘 중 하나라도 틀리면 다시 로그인하도록 링크를 넣는다
    //<a href=네이버로그인>로그인하는페이지로이동</a>
    if(id.equals(id2) && pw.equals(pw2))
    {
    	session.setAttribute("id", "apple");
    	out.print("<h3>로그인 성공</h3>");
    	out.print("<script>alert('로그인성공')</script>");
    }else{
    	out.print("로그인 실패<br><a href=네이버로그인.jsp>로그인 페이지로 이동</a><br>");
    }
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="news.jsp">뉴스로 링크</a><br>
<a href="mail.jsp">메일로 링크</a><br>
<a href="shopping.jsp">쇼핑으로 링크</a><br>
</body>
</html>