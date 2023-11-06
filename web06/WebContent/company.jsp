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
			url : "data/company_mock.json",
			success : function(arr) { //{json,json,json}
			//json 배열 추출해서 프린트
			alert(arr.length)
			for (let i = 0; i < arr.length; i++) {
				console.log(arr[i].name)
				console.log(arr[i].domain)
				console.log('-------------')
				
				$.ajax({
					url : "db_create2.jsp",
					data : {
						id : arr[i].id,
						name : arr[i].name,
						addr : arr[i].addr,
						tel : arr[i].tel,
						domain : arr[i].domain
					},
					success : function(result) {
						console.log(result) //'1'
						console.log(result.length) //'1'
						if(result.trim() == '1'){ //trim = 공백 없애는 함수
							console.log('DB저장 성공')
						}else{
							console.log('DB저장 실패')
						}
					}
				})//ajax
			}//for
			}//success
		})//ajax	
	})//b1
	
	$('#b2').click(function() {
		$.ajax({
			url : "data/company_mock.xml",
			success : function(xml) {
				list = $(xml).find('record')
				$('#d1').empty()
				for(let i = 0; i < list.length; i++){
					let id = $(list[i]).find('id').text()
					let name = $(list[i]).find('name').text()
					let addr = $(list[i]).find('addr').text()
					let tel = $(list[i]).find('tel').text()
					let domain = $(list[i]).find('domain').text()
					console.log(id + " " + name + " " + addr + " " + tel + " " + domain)
					$('#d1').append(id + " " + name + " " + addr + " " + tel + " " + domain + "<br>")
				}//for
			}
		})
	})
	
	
})//$
</script>
</head>
<body>
<button id="b1">company_mock.json 읽어와서 추출하기</button>
<button id="b2">company_mock.xml 읽어와서 추출하기</button>
<div id="d1" style="background: yellow">xml결과 넣는 곳</div>
</body>
</html>