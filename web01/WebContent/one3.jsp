<%@page import="bean.ProductVO"%>
<%@page import="bean.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
    jsp에서 해야하는 작업 3가지
    1) 데이터를 받아서 저장
    2) DAO를 이용해서 데이터를 주며 DB처리 요청
    3) 요청에 대한 결과를 html로 만든다.
     -->
<%
	String id = request.getParameter("id");

	ProductDAO dao = new ProductDAO();
	ProductVO bag = dao.one(id);
	/* 	ProductVO bag = new ProductVO(); // one3.jsp
		bag = dao.one(id); */
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PRODUCT ONE JSP</title>
<style>
* {
	font-family: "마루 부리";
	font-size: 20px;
	text-align: center;
}

a {
	color: blue;
	text-decoration: none;
	cursor: pointer;
}

a:hover {
	color: red;
	text-decoration: none;
}

td {
	width: 400px;
}

.left {
	/* 여러개를 선택해서 지정하고 싶을 때 클래스를 사용. 클래스 중 left에 해당하는 것만 스타일을 지정해라. */
	/* 클래스 선택은 .클래스명 */
	width: 120px;
	background: blue;
	color: white;
	text-align: center;
}
</style>
</head>
<body bgcolor="lavender">
	<h5>게시글 검색 결과 (한개)</h5>
	<hr color="blue">
	<table border="1" align="center">
		<tr>
			<td class="left">상품 번호</td>
			<td><%=bag.getId()%></td>
		</tr>
		<tr>
			<td class="left">상품이름</td>
			<td><%= bag.getName()%></td>
		</tr>
		<tr>
			<td class="left">상품설명</td>
			<td><%=bag.getContent()%></td>
		</tr>
		<tr>
			<td class="left">상품가격</td>
			<td><%=bag.getPrice()%></td>
		</tr>
		<tr>
			<td class="left">제조회사</td>
			<td><%=bag.getCompany()%></td>
		</tr>
		<tr>
			<td class="left">상품이미지</td>
			<td><img src="img/<%=bag.getImg()%>" width=100%></td>
		</tr>

	</table>

	<br>
	<a href="index.html">첫 페이지로</a>
	<br>
	<a href="product.html">상품정보 페이지로</a>
</body>
</html>