package programmers;

import java.util.Scanner;

public class d1_04대소문자바꿔서출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (Character.isUpperCase(c)) {
				b += Character.toLowerCase(c);
			} else {
				b += Character.toUpperCase(c);
			}
		}
		System.out.println(b);
	}
}
