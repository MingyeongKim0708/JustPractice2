<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 자바 스크립트
	 history : 앞,뒤로가기 
	 location : 주소창
	 document : 아래 큰 창 -->
<script type="text/javascript">
	function age() {
		let yearTag = document.getElementById('year'); // id가 year인 input 태그 인식
		let yearValue = yearTag.value; //'100', window.parseInt(), parseFloat()
		let year2 = 2023;
		let age = year2 - parseInt(yearValue);
		alert('당신의 나이는 ' + age);
	}
	function rec() {
		let wTag = document.getElementById('w');
		let hTag = document.getElementById('h');
		let wValue = wTag.value;
		let hValue = hTag.value;
		let result = parseFloat(wValue) * parseFloat(hValue);
		alert('사각형 면적은 '+ result);
	}
</script>
</head>
<body>
	태어난 해 입력 : <input name="year" id="year" value="2000"><button onclick="age()">나이계산</button><br>
	사각형의 면적 가로 :<input name="w" id="w" value="30"> 세로 :<input name="h" id="h" value="20"><button onclick="rec()">사각형의 면적 계산</button>
	<hr>
</body>
</html>