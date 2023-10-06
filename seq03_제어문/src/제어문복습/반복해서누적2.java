package 제어문복습;

import java.util.Scanner;

public class 반복해서누적2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값과 종료값을 순서대로 입력해주세요");
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
