package 배열문제;

import java.util.Arrays;
import java.util.Scanner;

public class 정수입력배열넣기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] s = new int[5];
		
		for (int i = 0; i < s.length; i++) {
			System.out.print("숫자를 입력하세요 >> ");
			s[i] = sc.nextInt();
		}
		System.out.println(s[0] + s[2]);
		
		String[] s2 = new String[3];
//		System.out.println(Arrays.toString(s2));
		
		for (int i = 0; i < s2.length; i++) {
			System.out.print("언어를 입력하세요 >> ");
			s2[i] = sc.next();
		}
		System.out.println(s2[0] + "보다는 " + s2[1]);
	}

}
