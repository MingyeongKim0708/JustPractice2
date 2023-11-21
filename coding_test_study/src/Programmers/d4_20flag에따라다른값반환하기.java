package Programmers;

public class d4_20flag에따라다른값반환하기 {

	public static void main(String[] args) {
		int answer = 0;
		int a = -4;
		int b = 7;
		boolean flag = true;
		
		if (flag == true) {
			answer = a + b;
		}else {
			answer = a - b;
		}
		System.out.println(answer);
	}

}
