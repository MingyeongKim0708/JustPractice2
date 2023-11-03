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
		$('div').empty()
		$.ajax({
			url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fsports%2F%3FoutputType%3Dxml",
			success : function(x) {
				console.log(x) // 브라우저의 콘솔에 출력
				let list = x.items // json 배열 [{title : ..., content : ...},{},{}]
				for (let i = 0; i < list.length; i++) {
				console.log(list[i].title)
				console.log(list[i].link)
				console.log(list[i].content)
				aTag = "<a href =" + list[i].link + ">" +  list[i].title + "</a>"
				$('#d1').append(aTag + " " + list[i].content + "<hr>") //계속 덧붙이기 - 댓글만들때 사용
				}
			},
			error : function(e) {
				alert('에러발생함.')
			}
		})//ajax
	})//b1
	
	$('#b2').click(function() {
		$('div').empty()
		$.ajax({
			url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fentertainments%2F%3FoutputType%3Dxml",
			success : function(x) {
				console.log(x) // 브라우저의 콘솔에 출력
				let list = x.items // json 배열 [{title : ..., content : ...},{},{}]
				for (let i = 0; i < list.length; i++) {
				console.log(list[i].title)
				console.log(list[i].link)
				console.log(list[i].content)
				aTag = "<a href =" + list[i].link + ">" +  list[i].title + "</a>"
				$('#d1').append(aTag + " " + list[i].content + "<hr>") //계속 덧붙이기 - 댓글만들때 사용
				}
			},
			error : function(e) {
				alert('에러발생함.')
			}
		})//ajax
	})//b2
	
	$('#b3').click(function() {
		$('div').empty()
		$.ajax({
			url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fculture-life%2F%3FoutputType%3Dxml",
			success : function(x) {
				console.log(x) // 브라우저의 콘솔에 출력
				let list = x.items // json 배열 [{title : ..., content : ...},{},{}]
				for (let i = 0; i < list.length; i++) {
				console.log(list[i].title)
				console.log(list[i].link)
				console.log(list[i].content)
				aTag = "<a href =" + list[i].link + ">" +  list[i].title + "</a>"
				$('#d1').append(aTag + " " + list[i].content + "<hr>") //계속 덧붙이기 - 댓글만들때 사용
				}
			},
			error : function(e) {
				alert('에러발생함.')
			}
		})//ajax
	})//b2
})

/* $(function(){
	$.ajax({
		url : "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fsports%2F%3FoutputType%3Dxml",
		success : function(x) {
			console.log(x) // 브라우저의 콘솔에 출력
			let list = x.items // json 배열 [{title : ..., content : ...},{},{}]
			for (let i = 0; i < list.length; i++) {
			console.log(list[i].title)
			console.log(list[i].link)
			console.log(list[i].content)
			aTag = "<a href =" + list[i].link + ">" +  list[i].title + "</a>"
			$('#d1').append(aTag + " " + list[i].content + "<hr>") //계속 덧붙이기 - 댓글만들때 사용
			}
		},
		error : function(e) {
			alert('에러발생함.')
		}
	})//ajax
}) */
</script>
</head>
<body>
<button id="b1">스포츠 기사</button>
<button id="b2">연예 기사</button>
<button id="b3">문화 기사</button>
<div id="d1"></div>
</body>
</html>