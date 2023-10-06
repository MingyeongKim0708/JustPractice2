package 생성자복습;

import java.util.ArrayList;
import java.util.HashSet;

public class Cal5 {

	public ArrayList getEven(int[] num) {
		// 배열의 값 중 짝수만 골라서 list에 넣어서 리턴. ArrayList<Integer>사용.
		// 고정된 크기(5개) -> 배열 사용
		// 가변적인 크기 -> 배열 사용 X -> 컬렉션 사용 -> ArrayList<타입>. <타입> 부분은 생략해도 됨

		ArrayList list = new ArrayList<Integer>();
		for (Integer x : num) {
			if (x % 2 == 0) {
				list.add(x); // list 컬렉션에 계속 쌓임. {2, 4, 6, 8, 10}
			}
		} // for
		return list;
	}

	public ArrayList getOdd(int[] num) {
		ArrayList list = new ArrayList<Integer>();
		for (Integer x : num) {
			if (x % 2 != 0) {
				list.add(x); // list 컬렉션에 계속 쌓임 {1, 3, 5, 7, 9}
			}
		} // for
		return list;
	}

	public HashSet getUnique(int[] num) {
		HashSet list = new HashSet<Integer>();
		for (Integer x : num) {
			list.add(x);
		}
		return list;
	}
}
