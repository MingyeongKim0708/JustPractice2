package 선형구조_스택;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어_stack {
	public static void main(String[] args) {
		int[] n = { 1, 1, 3, 3, 0, 1, 1 };
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(n[0]); //peek() ==>1
		
		//연속으로 같은 숫자 제거
		for (int i = 0; i < n.length; i++) {
			if (stack.peek() != n[i]) {
				stack.push(n[i]);
			}
		}
		System.out.println(stack);
		
		int[] answer = new int[stack.size()];
		for (int i = answer.length -1; i >= 0 ; i--) {
			answer[i] = stack.pop();
		}
		
		System.out.println(Arrays.toString(answer));
	}
}