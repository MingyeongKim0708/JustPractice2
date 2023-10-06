package 제어문.반복문;

import java.util.Scanner;

public class 정리문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID를 입력하세요 >> ");
		String id = sc.next();
		System.out.print("PW를 입력하세요 >> ");
		String pw = sc.next();
		
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
	}

}
