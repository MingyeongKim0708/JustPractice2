package 제어문.순차문;

import java.util.Scanner;

public class Scanner연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //JAVA01(변수+연산자+제어문) p.182
		System.out.print("이름 입력 >> ");
		String name = sc.next(); //콘솔 창에 String으로 입력한 값을 가지고 들어온다. 한단어
		System.out.println("당신의 이름은 " + name);
		
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt(); //모든 입력은 String인데 Int로 바꿔줌 --> 코딩테스트 때 유용
		System.out.println("당신의 내년 나이는 " + (age + 1));

		System.out.print("몸무게 입력 >> ");
		double w = sc.nextDouble(); // String --> Double
		System.out.println("당신의 몸무게는 " + (w - 10));
		
		System.out.print("저녁 여부 >> ");
		boolean dinner = sc.nextBoolean(); //true, false
		System.out.println("당신은 저녁 여부는 " + dinner);
		
		System.out.print("좌우명 >> ");
		String motto = sc.nextLine();
		System.out.println("당신의 좌우명은 " + motto + "입니다.");
	}

}
