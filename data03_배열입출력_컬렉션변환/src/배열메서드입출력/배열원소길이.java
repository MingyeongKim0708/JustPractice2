package 배열메서드입출력;

import java.util.Arrays;

public class 배열원소길이 {

	public static void main(String[] args) {
		Solution9 s = new Solution9();
		String[] n = { "We", "are", "the", "world!" };
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}

}

class Solution9 {
	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = strlist[i].length();
		}
		return answer;
	}
}