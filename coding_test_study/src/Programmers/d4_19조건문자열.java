package programmers;

public class d4_19조건문자열 {

	public static void main(String[] args) {
		int answer = 0;
		String ineq = ">";
		String eq = "!";

		int n = 41;
		int m = 78;

		char c1 = '>';
		char c2 = '=';

		boolean result = false;

		if (ineq.equals("<")) {
			if (eq.equals("!")) {
				result = n < m;
			} else {
				result = n <= m;
			}
		} else {
			if (eq.equals("!")) {
				result = n > m;
			} else {
				result = n >= m;
			}
		}

		if (result == true) {
			answer = 1;
		}

		System.out.println(answer);
	}

}
