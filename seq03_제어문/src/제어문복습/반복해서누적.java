package 제어문복습;

public class 반복해서누적 {

	public static void main(String[] args) {
		// 1~10 다 더해보자
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
