package 배열메서드입출력;


import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;
import java.util.Arrays;

public class 최댓값만들기2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] numbers = {10, 20, 30, 5, 5, 20, 5} ;
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution2 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers);
		int last = numbers[numbers.length - 1];
		int last2 = numbers[numbers.length - 2];
		int post = last * last2;
		int first = numbers[0];
		int first2 = numbers[1];
		int pre = first * first2;
		int answer = pre;
		if (pre < post) {
			answer = post;
		}
        return answer;
    }
}