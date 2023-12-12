package programmers;

public class d4_17공배수 {
	public static void main(String[] args) {
		int answer = 0;
		int number = 55;
		int n = 10;
		int m = 5;
		
		int a =number%n;
		int b = number%m;
		if (a == 0 && b == 0) {
			answer = 1;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(answer);		
	}
}
