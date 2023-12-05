package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 제일작은수제거하기_list {

	public static void main(String[] args) {
		int[] n = { 4, 3, 2, 1, 5 };
		//리스트로 변환
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			list.add(n[i]);
		}
		//System.out.println(list);

		//최소값
		int min = Collections.min(list);
		//System.out.println(min);
		
		//최소값 지우기
		list.remove(list.indexOf(min));
		//System.out.println(list);
		
		int[] answer = null; //if else에서 size가 달라지기 때문에 null로 선언
		//배열에 옮기기
		if (list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			answer = new int[list.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
