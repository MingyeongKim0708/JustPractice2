package 제어문복습;

import java.util.Scanner;

public class 로그인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("id와 pw를 입력하세요");
		String id = sc.next();
		String pw = sc.next();

		String result = ""; // = 대입연산자
		if (id.equals("root") && pw.equals("1234")) { // && 논리연산자
			result = "로그인 성공";
		}else {
			result = "로그인 실패";
		}
		System.out.println(result);
	}

}
