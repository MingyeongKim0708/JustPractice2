package Programmers;

import java.util.Arrays;

public class d3_11문자열섞기 {

	public static void main(String[] args) {
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		String answer = "";
		
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		
		for (int i = 0; i < c2.length; i++) {
			answer = answer + c1[i] + c2[i];
		}
		
		System.out.println(Arrays.toString(c1));
		System.out.println(answer);
	}
}
