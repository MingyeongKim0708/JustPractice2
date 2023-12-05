package 선형구조_스택;

import java.util.Stack;

public class 스택주요함수 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.add("홍길동");
		stack.add("김길동");
		stack.add("송길동");
		stack.add("정길동");
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.get(0));
		System.out.println(stack.pop()); //remove
		System.out.println(stack);
		System.out.println(stack.contains("김길동"));
		System.out.println(stack.peek()); //find
		System.out.println(stack);
		System.out.println(stack.indexOf("김길동"));
		System.out.println(stack.set(0, "파이팅"));
		System.out.println(stack);
		
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(i + " : " + stack.get(i));
		}
		
		System.out.println(stack.firstElement()); //get(0)
		System.out.println(stack.lastElement()); //peek()
		
		stack.clear(); //stack 비우기
		System.out.println(stack);
	}

}
