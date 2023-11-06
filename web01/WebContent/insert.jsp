<%@page import="bean.MemberVO"%>
<%@page import="bean.CarDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
    jsp에서 해야하는 작업 3가지
    1) form안에 입력한 데이터 받아서 저장해두자. ==> java
    2) 받은 데이터를 DAO에게 주자. ==> java
    3) 결과를 html로 만들자. ==> html
     -->

<%
	// 자바코드를 쭉 쓰면됨. 스크립트릿(let, flt ==> 작은 프로그램, 작은 코드 블럭)
	//form안에 입력한 데이터 받아서 저장해두자.
	//HttpSurvletRequest request = new HttpSurvletRequest();
	//미리 톰킷에서 자주 사용하는 부품은 new를 이용해서 객체를 만들어놨음
	//미리 만들어서 제공하는 객체(부품) ==> 내장된 객체
	//클라이언트로부터 데이터를 받아오는 객체 ==> request
	String id = request.getParameter("id"); //input안에 있는 name을 적어줌
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");

	//2. DAO에 데이터를 주소 db처리 요청
	// JSP = java + html
	CarDAO dao = new CarDAO();
	//bag 기능을 하는 DTO(VO)가 필요 --> 만들어주고 --> 값을 넣어야함
	MemberVO bag = new MemberVO();
	bag.setId(id);
	bag.setPw(pw);
	bag.setName(name);
	bag.setTel(tel);

	int result = dao.insert(bag);

	String resultText = "회원 가입 실패";
	String resultText2 = "이미 존재하는 아이디입니다. 다른 아이디로 가입하세요.";
	String resultImg = "sad.png";
	if (result == 1) {
		resultText = "회원 가입 성공";
		resultImg = "happy.png";
		resultText2 = "환영합니다!";
	}
	//3. 결과를 html로 만들어서 클라이언트에 전송
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MEMBER INSERT JSP</title>
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
	width: 300px;
}

.left {
	width: 120px;
	background: blue;
	color: white;
	text-align: center;
}
</style>

</head>
<body bgcolor="lavender">
	<h5><%=resultText%></h5>
	<hr color="blue">
	<img src="img/<%=resultImg%>" width="10%">
	<table border="1" align="center">
		<tr>
			<td class="left">아이디</td>
			<td><%=id%></td>
		</tr>
		<tr>
			<td class="left">비밀번호</td>
			<td><%=pw%></td>
		</tr>
		<tr>
			<td class="left">회원이름</td>
			<td><%=name%></td>
		</tr>
		<tr>
			<td class="left">회원전화</td>
			<td><%=tel%></td>
		</tr>
	</table>
	<br>
	<%=resultText2%>
	<!-- 자바에 있는 id 변수 값 출력(프린트) representaion 표현식 -->
	<br>
	<br>
	<a href="index.html">첫 페이지로</a>
	<br>
	<a href="member.html">회원정보 페이지로</a>
</body>
</html>