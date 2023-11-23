package 배열고급;

import java.util.Arrays;

public class 배열입력배열반환_고정길이 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88};
		Solution1 s = new Solution1();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution1 {
	public int[] solution(int[] n) {
		//배열 최소, 최대값 리턴하기
		int[] answer = {0,0};
		Arrays.sort(n);
		answer[0] = n[0];
		answer[1]= n[n.length-1];
		//int[] answer = new int[2];
		return answer;
	}
}