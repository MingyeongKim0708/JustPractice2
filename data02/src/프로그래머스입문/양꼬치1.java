package 프로그래머스입문;

import java.util.Scanner;

public class 양꼬치1 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		int result = s.solution(10, 3);
		System.out.println(result);
	}

}

class Solution5 {
	public int solution(int n, int k) {
		int answer = 0;
		int total = 0; // 무료로 받을 수 있는 음료 개수

		// 전체 지불 금액 = 양꼬치 주문 금액 + 음료수 주문 금액
		int food = 12000;
		int drink = 2000;

		if (n >= 10) {
			total = n / 10;
		}

		answer = food * n + drink * (k - total);

		return answer;
	}
}