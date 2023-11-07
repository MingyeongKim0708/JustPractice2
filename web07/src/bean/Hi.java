package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class Hi extends HttpServlet {
	//HttpServlet에 있는 service()
	//모든 요청은 service()가 받아서 get/post 구분해서 get 요청이 들어오면 doGet(), post 요청이 들어오면 doPost() 호출
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get요청이 들어왔음.");
		//q=pusan
		String q = request.getParameter("q");
		PrintWriter out = response.getWriter(); //브라우저에 글자를 보낼 수 있음
		out.print("<h1>your data: " + q + "</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post요청이 들어왔음.");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		PrintWriter out = response.getWriter();
		out.print("<h1>ID : " + id + "</h1>");
		out.print("<h1>PW : " + pw + "</h1>");
	}

}
