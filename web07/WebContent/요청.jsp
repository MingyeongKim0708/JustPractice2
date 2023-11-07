<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- a태그 get 요청, 단순한 요청 -->
	<a href="hi?q=car">Get요청</a>
	<!-- form태그 get/post 요청 중 선택 (기본 : get) -->
	<form action="hi" method="post">
		id : <input name="id" value = "apple"><br>
		pw : <input name="pw" value = "1234"><br>
		<button>서버로 제출</button>
	</form>
</body>
</html>