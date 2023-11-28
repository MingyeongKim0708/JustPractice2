package 선형구조_스택;

import java.util.Stack;

public class 백준스택문제 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		System.out.println("가장 마지막 : " + stack.peek());
		System.out.println("스택 크기 : " + stack.size());
		System.out.print("스택이 비었다면 1, 아니면 0 : ");
		System.out.println(stack.empty()? 1 : 0); //삼항연산자 ==> 조건? TRUE : FALSE
		
		System.out.println();
		try {
			stack.pop(); //2
			stack.pop(); //1
			stack.pop(); // error
		} catch (Exception e) {
			System.out.println("-1");
		}
		System.out.println("스택 크기 : " + stack.size());
		System.out.print("스택이 비었다면 1, 아니면 0 : ");
		System.out.println(stack.empty()? 1 : 0); //삼항연산자 ==> 조건? TRUE : FALSE

		System.out.println();
		try {
			stack.pop(); // error
		} catch (Exception e) {
			System.out.println("-1");
		}
		stack.push(3);
		System.out.println("스택 크기 : " + stack.size());
		System.out.print("스택이 비었다면 1, 아니면 0 : ");
		System.out.println(stack.empty()? 1 : 0); //삼항연산자 ==> 조건? TRUE : FALSE
		
		String s = "홍길동";
		System.out.println(s.length());
	}

}
