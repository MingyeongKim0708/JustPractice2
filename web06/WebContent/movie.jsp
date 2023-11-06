<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
//body태그에 있는 것 중에서 특정한 것을 선택한 이후에
//그 선택된 것이 이벤트가 발생했을 때 입력값으로 사용한 이름 없는 함수를 실행시켜줘
//콜백함수
$(function() {
	$('#b1').click(function() {
		$.ajax({
			url : "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101",
			success : function(json) {
				list = 
				$(json).each(function(i, one) {
					$('#d1').append(one.movieNm + "<br>")
				})
			}
		})//ajax	
	})//b1
	
	$('#b2').click(function() {
		$.ajax({
			url : "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.xml?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101",
			success : function(xml) {
				list = $(xml).find('record')
				$('#d1').empty()
				for(let i = 0; i < list.length; i++){
					let id = $(list[i]).find('id').text() //김연아
					let email = $(list[i]).find('email').text() //010
					let car = $(list[i]).find('car').text() //010
					console.log(id + " " + email + " " + car)
					$('#d1').append(id + " " + email + " " + car + "<br>")
				}//for
			}//success
		})//ajax
	})//b2
})//$
</script>
</head>
<body>
<button id="b1">car.json 읽어와서 추출하기</button>
<button id="b2">car.xml 읽어와서 추출하기</button>
<div id="d1" style="background: yellow">xml결과 넣는 곳</div>
</body>
</html>