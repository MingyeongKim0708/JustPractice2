package 배열컬렉션변환;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열입력처리후배열만들기 {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		// 몇개인지 모를때 (가변) ==> collection(ArrayList)
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int x : arr) {
			if (x%3 == 0) {
				list.add(x);
			}
		}
		int size = list.size();
		System.out.println(size);
		System.out.println(list);
		
		int answer[] = new int[list.size()];
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
