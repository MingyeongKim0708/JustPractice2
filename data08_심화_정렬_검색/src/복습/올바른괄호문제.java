package 복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 올바른괄호문제 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String s2 = "())";
		boolean result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution1 {
	public boolean solution(String s2) {
		//스택에다가 String의 char을 하나씩 넣을 예정
		//'('는 push, ')'는 pop ==> 짝이 맞으면 스택에 아무것도 남지 않음
		
		Stack<Character> stack = new Stack<>();
		boolean answer = false;
		try {
			//배열-->length, String-->length(), Collections(list,set,map)-->size()
			for (int i = 0; i < s2.length(); i++) {
				//꺼낸문자가 '('인지 확인
				if (s2.charAt(i) == '(') {
					stack.push('(');
				} else {
					stack.pop(); //top제거
				}
			}
			answer = stack.empty();
		} catch (Exception e) {
			answer = false;
		}
		
		return answer;
	}
}