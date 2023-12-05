package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열뒤집기2 {

	public static void main(String[] args) {
		Solution02 s = new Solution02();
		int[] num_list = { 1, 2, 3, 4, 5, 33, 22, 55, 11 };
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution02 {
	public int[] solution(int[] num_list) {
		// 내림차순 만들기
		Arrays.sort(num_list);
		int[] answer = new int[num_list.length];

		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[num_list.length - i - 1];
		}
		return answer;
	}
}