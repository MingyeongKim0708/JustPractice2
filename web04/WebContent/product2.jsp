<%@page import="bean.ProductDTO"%>
<%@page import="bean.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
	import bean.ProductDTO;
	ProductDTO bag = new ProductDTO;
	 -->
<jsp:useBean id="bag" class="bean.ProductDTO"></jsp:useBean>
<!-- 
	bag.setId(request.getParameter("id");
	 -->
<jsp:setProperty property="id" name="bag" />
<%
	ProductDAO dao = new ProductDAO();
	ProductDTO bag2 = dao.one(bag);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/project.css">
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
			<!-- 액션태그 -->
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<%
				if (session.getAttribute("id") != null) {
			%>
			<%=session.getAttribute("id")%>님 환영합니다.
			<%
				}
			%>
			<br>

			<table border="1" class="table table-hover">
				<tr class="table-warning">
					<td class="table-info" rowspan="5"><img
						src="img/<%=bag2.getImg()%>" width="100%"></td>
					<td><span class="badge bg-primary">상품 아이디</span> <%=bag2.getId()%></td>
				</tr>
				<tr class="table-warning">
					<td><span class="badge bg-primary">상품 이름</span> <%=bag2.getTitle()%></td>
				</tr>
				<tr class="table-warning">
					<td><span class="badge bg-primary">상품 설명</span> <%=bag2.getContent()%></td>
				</tr>
				<tr class="table-warning">
					<td><span class="badge bg-primary">상품 가격</span> <%=bag2.getPrice()%>원</td>
				</tr>
				<tr class="table-warning">
					<td><span class="badge bg-primary">상품 회사</span> <%=bag2.getCompany()%></td>
				</tr>
			</table>
			<center>
				<button type="button" class="btn btn-primary">장바구니</button>
				<button type="button" class="btn btn-success">주문하기</button>
			</center>
		</div>

	</div>
</body>
</html>