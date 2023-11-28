package 선형구조_스택;

import java.util.LinkedList;

public class 백준큐카드문제 {

	public static void main(String[] args) {
		int x = 4;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for (int i = 1; i <= x; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		for (int i = 0; i <= queue.size(); i++) {
			//버리기
			System.out.println(queue.remove());
			//하나 빼서 맨 뒤로 붙이기
			queue.add(queue.remove());
			System.out.println(queue);
		}
		
		System.out.println(queue.remove());
		System.out.println(queue);
	}

}
