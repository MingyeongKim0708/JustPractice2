package 배열메서드입출력;

import java.util.*;
import 배열기본.Print;

public class 중앙값구하기_짝수 {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int[] numbers = { 0, 31, 24, 10, 1, 9, 11, 12 };
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution4 {
	public int solution(int[] numbers) {
		int answer = 0;
		Arrays.sort(numbers);
		Print.arr(numbers);
		int median  = numbers.length /2;
		int median2 = numbers.length /2 -1;
		answer = numbers[median] + numbers[median2];
		return answer;
	}
}