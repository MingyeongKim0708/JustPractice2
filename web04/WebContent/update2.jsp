<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
    1. 앞 페이지에서 전달된 데이터들을 가방을 만들어서 다 집어넣기
    2. dao를 이용해서 db처리
    3. dao로부터 받은 결과가 1이면 alert("수정성공")를 띄우고 bbs.jsp로 화면 넘김
    4. 결과가 1이 아니면 alert("수정실패")를 띄우기
     -->
<jsp:useBean id="bag" class="bean.BbsDTO2"></jsp:useBean>
<jsp:setProperty property="*" name="bag" />

<%
	BbsDAO dao = new BbsDAO();
	int result = dao.update(bag);

	if (result == 1) {
%>
<script>
	alert('수정성공!!');
	location.href = "bbs.jsp";
</script>
<%
	} else {
%>
<script>
	alert('@@@@@@수정실패!!@@@@@@')
	location.href = "bbs.jsp";
</script>
<%
	}
%>
