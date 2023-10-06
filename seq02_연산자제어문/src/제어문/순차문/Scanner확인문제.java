package 제어문.순차문;

import java.util.Scanner;

public class Scanner확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //JAVA01(변수+연산자+제어문) p.182
		System.out.print("나의 이름은? ");
		String name = sc.next(); //콘솔 창에 String으로 입력한 값을 가지고 들어온다. 한단어
		
		System.out.print("나의 키는? ");
		double h = sc.nextDouble(); // String --> Double
		
		System.out.print("나의 몸무게는? ");
		double w = sc.nextDouble(); // String --> Double
		
		System.out.print("나는 저녁을 먹었나요? ");
		boolean dinner = sc.nextBoolean(); //true, false
		
		System.out.print("나의 좌우명은? ");
		sc.nextLine(); //엔터를 인식함. boolean dinner = sc.nextBoolean(); 줄의 엔터를 처리해버려서 이걸 하나 넣어줘야함
		String motto = sc.nextLine();
		
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 내년 키는 " + (h + 10) + "입니다.");
		System.out.println("내 내년 몸무게는 " + (w - 10) + "입니다.");
		System.out.println("나는 저녁을 " + dinner + "했습니다.");
		System.out.println("나의 좌우명은 " + motto + "입니다.");
		
	}
}
