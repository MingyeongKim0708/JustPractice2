package 문자열관련;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		String s2 = "Zbcdefg";
		String result = sol.solution(s2);
		System.out.println(result);
	}
}

class Solution4 {
	public String solution(String s) {
		//String --> char[]
		char c[] = s.toCharArray();
		//오름차순
		Arrays.sort(c);
		//char[] --> String
		//String s = new String(c)
		String x = new String(c);
		StringBuilder sb = new StringBuilder(x);
		sb.reverse();
		String answer = sb.toString();
		
		
//		//내림차순
//		char c2[] = new char[s.length()];
//		for (int i = 0; i < c.length; i++) {
//			c2[i] = c[c.length - i - 1];
//		}
//		//System.out.println(Arrays.toString(c2));
//		String answer = String.valueOf(c2);
		return answer;
		
	}
}