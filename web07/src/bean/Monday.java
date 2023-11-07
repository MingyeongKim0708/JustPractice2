package bean;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/hi22") // web07/hi2
//@ 막고 web.xml로 주소 지정 (WEB-INF에 있음)
public class Monday extends HttpServlet {
	//서블릿이 언제 만들어지고 언제 사라지는지까지 ==> 생명주기
	@Override
	public void init(ServletConfig config) throws ServletException { //init-param 읽어오는 역할
		System.out.println("서블릿이 탄생함.");
		String temp = config.getInitParameter("temp");
		System.out.println("상태 : " + temp);
	}
	
	@Override
	public void destroy() {
		System.out.println("서블릿 생명을 다함.");
		//관리자에게 문자 보내기 처리
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()메서드가 자동호출됨");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()메서드가 자동호출됨");
	}

}
