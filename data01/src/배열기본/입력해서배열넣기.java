package 배열기본;

import java.util.Arrays;
import java.util.Scanner;

public class 입력해서배열넣기 {

	public static void main(String[] args) {
		// 입력하는 객체 필요 ==> Scanner
		// 많은 양의 데이터를 선형으로 넣을 수 있는 객체 필요 ==> 배열

		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		// numbers, {0, 0, 0, 0, 0}, length ==> 변수 7개
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("숫자입력>> ");
			numbers[i] = sc.nextInt();
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22) {
				System.out.println("22가 있는 위치는 " + (i + 1) + "번째");
			}
		}
		sc.close(); // 통로 닫기
		System.out.println(Arrays.toString(numbers));
	}

}
