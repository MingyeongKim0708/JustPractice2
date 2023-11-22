package 배열메서드입출력;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		Solution10 s = new Solution10();
		int[] n = { 2, 36, 1, 3 };
		int div = 1;
		int[] result = s.solution(n, div);
		System.out.println(Arrays.toString(result));

	}

}

class Solution10 {
	public int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int x : arr) {
			if (x % divisor == 0) {
				list.add(x);
			}
		}

		int size = list.size();
		int[] answer = null;

		if (size == 0) {
			answer = new int[1];
			answer[0] = -1;

		} else {
			answer = new int[size];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
			Arrays.sort(answer);
		}
		
		return answer;
	}
}