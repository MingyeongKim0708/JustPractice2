<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
$(function(){
	$.ajax({
		url : "ok.jsp",
		success : function(result) {
			$('#d1').html(result)
		}//success
	})//ajax
	$.ajax({
		url : "weather.jsp",
		success : function(result) {
			$('#d2').html(result)
		}//success
	})//ajax
	$.ajax({
		url : "tour.jsp",
		success : function(result) {
			$('#d3').html(result)
		}//success
	})//ajax
})
</script>
</head>
<body>
<div id="d1" style="background: yellow">결과들어가는곳</div>
<div id="d2" style="background: pink">결과들어가는곳</div>
<div id="d3" style="background: green">결과들어가는곳</div>
<a href="ok.jsp">오케이정보</a> <!-- 동기 통신 -->
</body>
</html>