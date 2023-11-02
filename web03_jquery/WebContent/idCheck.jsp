<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    
    //입력한 id가 배열에 있는지 확인
    String[] list = {"root","admin","hong"};
    
    String result = "아이디 사용 가능.";
    
    for(String s : list){
    	if(s.equals(id)){
    		result = "아이디 중복. 사용 불가능.";
    		break;
    	}
    }
    %>
    
    <%= result%>