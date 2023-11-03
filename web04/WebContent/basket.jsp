<%@page import="bean.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:useBean id="bag" class="bean.ProductDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="bag"/>
	<%
		//bag에 데이터가 들어있지 않으면 장바구니에 추가하지 말기
		ArrayList<ProductDTO> list = null; //a,location.href할때 가방에 비어있는 데이터가 들어가지 않게 하기 위해서
		if (bag.getId() != null) {
			if (session.getAttribute("basket") == null) {
				list = new ArrayList<>();
			} else {
				list = (ArrayList<ProductDTO>) session.getAttribute("basket"); //list(작) <- Object(큰)
			}
			list.add(bag);
			session.setAttribute("basket", list); //Object(큰) <- list(작)
		}else{//a,location.href로 호출했을 때 기존의 장바구니 리스트가 있으면 리스트 가져오기
			if(session.getAttribute("basket") != null){
				list = (ArrayList<ProductDTO>) session.getAttribute("basket"); 
			}
		}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/project.css">
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
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
			<br> <br>
			<% if(session.getAttribute("id") != null) { %>
			<%=session.getAttribute("id")%>님 환영합니다. &nbsp; <a href="logout.jsp"><button
					class="btn btn-outline-danger">로그아웃</button></a>
			<% }
				if (session.getAttribute("basket") != null) {
			%>
			장바구니 개수 :
			<%=list.size()%>개 <br>
			
			<%
				}
				if (session.getAttribute("basket") != null) {
			%>
			<hr>
			<table class="table tablehover">
				<tr>
					<td>아이디</td>
					<td>물건이름</td>
					<td>가격</td>
					<td>주문하기</td>
				</tr>
				<%
					for (ProductDTO bag2 : list) {
				%>
				<tr>
					<td><%=bag2.getId()%></td>
					<td><%=bag2.getTitle()%></td>
					<td><%=bag2.getPrice()%></td>
					<td><button>주문하기</button></td>
				</tr>
				<%
					} //for
				%>
			</table>
			<%
				} //if
			%>
		</div>
	</div>
</body>
</html>