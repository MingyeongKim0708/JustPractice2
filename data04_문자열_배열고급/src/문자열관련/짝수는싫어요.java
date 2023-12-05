package 문자열관련;

import java.util.Arrays;

public class 짝수는싫어요 {

	public static void main(String[] args) {
		int n = 10;
		Solution11 s = new Solution11();
		int[] answer = s.solution(n);
		System.out.println(Arrays.toString(answer));
	}

}

class Solution11 {
	public int[] solution(int n) {
		int len = 0;
		if (n % 2 == 0) {
			len = n / 2;
		} else {
			len = n / 2 + 1;
		}
		int[] answer = new int[len];
		for (int i = 0; i < len; i++) {
			answer[i] = 1 + 2*i;
		}
		
		return answer;
	}
}