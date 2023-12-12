package programmers;

public class d3_15두수의연산값비교하기 {

	public static void main(String[] args) {
		int answer = 0;
		int a = 2;
		int b = 91;
		
		String s1 = Integer.toString(a) + Integer.toString(b);
		int s11 = Integer.parseInt(s1);
		int x = 2 * a* b;
		if (s11 < x) {
			answer = x;
		}else {
			answer = s11;
		}
		System.out.println(answer);
	}

}
