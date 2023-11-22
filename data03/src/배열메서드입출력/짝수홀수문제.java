package 배열메서드입출력;

import java.util.Arrays;

public class 짝수홀수문제 {

	public static void main(String[] args) {
		Solution8 s = new Solution8();
		int[] n = { 1, 2, 3, 4, 5 };
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}

}

class Solution8 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[2];
		for (int x : num_list) {
			if(x%2 == 0) {
				answer[0]++;
			}else {
				answer[1]++;
			}
		}
		return answer;
	}
}