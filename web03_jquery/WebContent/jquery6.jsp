<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b4').click(function() {
			let testValue = $('#test').val()
			//동기식: test.jsp?test=hong
			//비동기통신(ajax)으로 요청해서 결과 받고 div에 넣기
			$.ajax({
				url : "test.jsp",
				data : {
					test : testValue
				},
				success : function(x) {
					$('div').html(x)
				}//success
			})//ajax
		})//b4
		
		$('#b1').click(function() {
			let moneyValue = $('#money').val()
			let choiceValue = $('#choice').val()
			//동기식: test.jsp?test=hong
			//비동기통신(ajax)으로 요청해서 결과 받고 div에 넣기
			$.ajax({
				url : "money.jsp",
				data : {
					money : moneyValue,
					choice : choiceValue
				},
				success : function(x) {
					$('div').html(x)
				}//success
			})//ajax
		})//b1
		
		$('#b2').click(function() {
			$.ajax({
				url : "idCheck.jsp",
				data : {
					id : $('#id').val()
				},
				success : function(x) {
					$('div').html(x)
				}//success
			})//ajax
		})//b2
		
		$('#b3').click(function() {
			//let testValue = $('#tel').val()
			$.ajax({
				url : "phone.jsp",
				data : {
					tel : $('#tel').val()
				},
				success : function(x) {
					$('div').html(x)
				}//success
			})//ajax
		})//b3
	})
</script>
</head>
<body bgcolor="pink">
<h3>비동기통신으로 서버와 통신하기</h3>
ajax테스트 : <input type="text" id="test" value="hong"'>
<button id='b4'>ajax테스트(test.jsp)</button>
<br>

결제금액 :
<input type="text" id="money" value="10000">
<br> 1)계좌이체, 2)신용카드, 3)휴대폰결제
<br> 결제수단 :
<input type="text" id="choice">
<button style="color: blue; background: green;" id='b1'>결제하기</button>
<hr color="red">
회원가입할 id입력 :
<input type="text" id="id">
<button style="color: blue; background: yellow;" id='b2'>회원가입시 id중복 체크</button>
<hr color="red">
인증받을 전화번호 입력 :
<input type="text" id="tel" value="01011112222">
<button style="color: blue; background: fuchsia;" id='b3'>인증번호 받기</button>
<hr color="green">
<div style="background: yellow"></div>

</body>
</html>