package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자반복출력하기 {

	public static void main(String[] args) {
		Solution9 s = new Solution9();
		String my_string = "hello";
		int n = 3;
		String result = s.solution(my_string, n);
		System.out.println(result);
	}
}

class Solution9 {
	public String solution(String my_string, int n) {
		char[] c = my_string.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(c[i]);
			}
		}
		String answer = sb.toString();
		return answer;
	}
}
