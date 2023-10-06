package 연습;

import javax.swing.JOptionPane;

public class 연습문제3 {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("첫 번째 수 입력");
		String b = JOptionPane.showInputDialog("두 번째 수 입력");
		String c = JOptionPane.showInputDialog("더하기=1, 빼기=2, 곱하기=3, 나누기=4, 나머지=5를 누르세요");
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int c1 = Integer.parseInt(c);
		
		int result = 0;
		if(c1 == 1) {
			result = a1 + b1;
		}else if(c1 == 2) {
			result = a1 - b1;
		}else if(c1 == 3) {
			result = a1 * b1;
		}else if(c1 == 4) {
			result = a1 / b1;
		}else if(c1 == 5) {
			result = a1 % b1;
		}else {
			System.out.println("잘못된 값 입력");
		}
		
		System.out.println("사칙연산 결과 : " + result);
		
	}

}
