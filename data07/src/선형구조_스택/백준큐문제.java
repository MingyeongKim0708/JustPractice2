package 선형구조_스택;

import java.util.LinkedList;

public class 백준큐문제 {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(3);
		queue.add(2);
		System.out.print("첫번째 값 " );
		System.out.println(queue.element()); // front(첫번째값)
		System.out.print("첫번째 값 " );
		System.out.println(queue.peek());
		System.out.print("마지막 값 " );
		System.out.println(queue.get(queue.size()-1));
		System.out.print("크기 " );
		System.out.println(queue.isEmpty());
		System.out.print("큐 사이즈 " );
		System.out.println(queue.size());
		try {
			queue.remove();
			queue.remove();
			queue.remove();
		} catch (Exception e) {
		System.out.println("-1");
		}
	}

}
