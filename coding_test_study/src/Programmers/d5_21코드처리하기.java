package Programmers;

import java.util.Arrays;

public class d5_21코드처리하기 {

	public static void main(String[] args) {
		Solution s = new Solution();
		String code = "abc1abc1abc";
		System.out.println(s.solution(code));
	}

}

class Solution {
	public String solution(String code) {
		String answer = "";

		String ret = "";
		int mode = 0;
		char[] c = code.toCharArray();
		// System.out.println(Arrays.toString(c));

		for (int i = 0; i < c.length; i++) {
			if (mode == 0) {
				if (c[i] != '1') {
					if (i % 2 == 0) {
						ret = ret + c[i];
					}
				} else {
					mode = 1;
				}
			} else {
				if (c[i] != '1') {
					if (i % 2 == 1) {
						ret = ret + c[i];
					}
				} else {
					mode = 0;
				}
			}
		}

		if (ret.isEmpty()) {
			answer = "EMPTY";
		} else {
			answer = ret;
		}

		return answer;
	}
}