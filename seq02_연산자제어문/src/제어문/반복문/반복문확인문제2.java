package 제어문.반복문;

public class 반복문확인문제2 {

	public static void main(String[] args) {
		//별 10개
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();

		//커피*5
		for (int i = 0; i < 5; i++) {
			System.out.print("커피*");
		}
		System.out.println();
		
		//커피*우유3
		for (int i = 0; i < 3; i++) {
			System.out.println("커피*우유");
		}
		
		//1:짱!
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println((i+1) +" : 짱!");
		}

	}

}
