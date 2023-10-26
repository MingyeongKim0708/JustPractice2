<%@page import="bean.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 
    1. db처리(dao)
    2. db처리한 결과를 html로 만들기 (jsp<-list<-DAO)
     -->

<%
	ProductDAO dao = new ProductDAO();
	ArrayList<ProductVO> list = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PRODUCT LIST JSP</title>
<style type="text/css">
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
	width: 120px;
}

.top {
	background: blue;
	color: white;
}

.data {
	font-size: 0.8rem;
}

</style>
</head>
<body bgcolor="lavender">
	<h5>상품검색 결과 (여러개)</h5>
	<hr color="blue">

	<table border="1" align="center">
		<tr>
			<td class="top">상품번호</td>
			<td class="top">상품이름</td>
			<td class="top">상품가격</td>
			<td class="top">상품이미지</td>
		</tr>
		<!-- 반복문(for) 필요 -->
		<%
			for (ProductVO bag : list) { //{bag, bag, bag, ...}
		%>
		<tr>
			<td class="data"><%=bag.getId()%></td>
			<td class="data"><a href="one3.jsp?id=<%=bag.getId()%>"><%=bag.getName()%></a></td>
			<td class="data"><%=bag.getPrice()%></td>
			<td class="data"><img src="img/<%=bag.getImg()%>" width=100%></td>
		</tr>
		<%
			} //for
		%>
	</table>
	<br>
	<a href="index.html">첫 페이지로</a>
	<br>
	<a href="product.html">상품정보 페이지로</a>

</body>
</html>