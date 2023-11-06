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
	$('#b1').click(function() {
		$.ajax({
			url : "https://api.openweathermap.org/data/2.5/weather?lat=37.508861&lon=127.063149&appid=15770229211726b9ebc61a70a9d8b513",
			success : function(data) {
				console.log(data)
				$('#d1').html('위치 : ' + data.name + '<br>' +
								'날씨 : ' + data.weather[0].description + '<br>' +
								'풍속 : ' + data.wind.spped + '<br>' + 
								'최고 기온 : ' + data.main.temp_max + '<br>' + 
								'최저 기온  : ' + data.main.temp_min + '<br>' + 
								'체감 온도 : ' + data.main.feel_like + '<br>' + 
								'구름 : ' + data.clouds.all
				)
			}//success
		})//ajax
	})//b1
	$('#b2').click(function() {
		$.ajax({
			url : "https://api.openweathermap.org/data/2.5/weather?q=pusan&appid=0b3b55e8f262238476508706d818c2d3",
			success : function(data) {
				console.log(data)
				$('#d1').html('위치 : ' + data.name + '<br>' +
								'날씨 : ' + data.weather[0].description + '<br>' +
								'풍속 : ' + data.wind.speed + '<br>' + 
								'최고 기온 : ' + data.main.temp_max + '<br>' + 
								'최저 기온  : ' + data.main.temp_min + '<br>' + 
								'체감 온도 : ' + data.main.feel_like + '<br>' + 
								'구름 : ' + data.clouds.all
				)
			}//success
		})//ajax
	})//b1
	
})
</script>
</head>
<body>
	<button id="b1">날씨 읽어와서 추출하기 - 삼성역(위도경도)</button>
	<button id="b2">날씨 읽어와서 추출하기 - 부산(지역명)</button>
	<div id="d1" style="background: pink">날씨 결과 넣는 곳</div>
</body>
</html>