package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 제일작은수제거하기_stack2 {

	public static void main(String[] args) {
		int[] n = { 500, 400, 200, 300, 900 };
		//Stack을 이용하여 최대값을 제외한 값 목록을
		//1.오름차순으로 배열을 모아 프린트
		//2.내림차순으로 배열을 모아 프린트
		Arrays.sort(n);
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n.length; i++) {
			stack.push(n[i]);
		}
		System.out.println(stack);
		int[] answer = new int[stack.size() - 1];
		int[] answer2 = new int[stack.size() - 1];
		stack.pop(); //최대값 제외
		//오름차순
		for (int i = answer.length -1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
		
		//내림차순
//		for (int i = 0; i < answer.length; i++) {
//			answer2[i] = stack.pop();
//		}
		
		System.out.println(Arrays.toString(answer));
		//System.out.println(Arrays.toString(answer2));
	}

}
