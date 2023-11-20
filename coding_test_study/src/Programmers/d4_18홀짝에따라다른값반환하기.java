package Programmers;

public class d4_18홀짝에따라다른값반환하기 {

	public static void main(String[] args) {
		int answer = 0;
		int n = 10;

		if (n % 2 == 1) {
			for (int i = 0; i <= n; i++) {
				if (i % 2 == 1) {
					answer += i;
				}
			}
		} else {
			for (int i = 0; i <= n; i++) {
				if (i % 2 == 0) {
					answer += i*i;
				}
			}
		}

		System.out.println(answer);
	}

}
