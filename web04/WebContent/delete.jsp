<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
    1. id를 받아서 dtd에 저장
    2. dao db처리
    3. 성공하면 bbs.jsp로 넘어가기. 넘어가기전 alert()띄우기
     -->
<jsp:useBean id="bag" class="bean.BbsDTO2"></jsp:useBean>
<jsp:setProperty property="id" name="bag" />

<%
	BbsDAO dao = new BbsDAO();
	int result = dao.delete(bag); //int
	if (result == 1) {
%>
<script>
	alert('삭제 완료 되었습니다.');
	location.href="bbs.jsp";
</script>
<%
	} else {
%>
<script>
	alert('삭제 중 문제가 생겼습니다.')
</script>
<%
	}
%>
