package 선형구조_스택;

import java.util.LinkedList;
import java.util.Stack;

public class 스택큐정리문제1 {

	public static void main(String[] args) {

		String[] food = { "apple", "apple", "apple", "banana", "banana", "banana", "melon", "melon", "berry" };
		// Stack 활용해서 풀기
		// 1)위 음식 목록 중 음식 종류를 프린트
		// 2)중복된 목록 프린트 -> 몇번 중복되었는지 체크하지 않음

		Stack<String> stack = new Stack<String>();
		Stack<String> stack2 = new Stack<String>();

		stack.push(food[0]);
		stack2.push(null);

		for (int i = 0; i < food.length; i++) {
			if (!food[i].equals(stack.peek())) {
				stack.push(food[i]);
			} else { // 중복 체크
				if (stack2.peek() != food[i]) {
					stack2.push(food[i]);
				}
			}
		}

		stack2.remove(0); // null 값 제거
		System.out.println(stack);
		System.out.println(stack2);

		//////////////
		String[] wait = { "홍길동", "김길동", "송길동", "정길동", "박길동", "이길동" };
		// Queue 활용해서 풀기
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for (int i = 1; i <= wait.length; i++) {
			queue.add(i);
		}
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		queue.add(queue.remove());
		System.out.println(queue);

		System.out.println(queue.remove());
		queue.add(queue.remove());
		System.out.println(queue);
	}

}
