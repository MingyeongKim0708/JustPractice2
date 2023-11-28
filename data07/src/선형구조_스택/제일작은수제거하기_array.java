package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;

public class 제일작은수제거하기_array {

	public static void main(String[] args) {
		int[] n = { 4, 3, 2, 1, 5 };
		//제일 작은 수를 빼고 나머지를 배열에 모으기
		//하나 빼고 아무것도 없는 경우에는 배열에 -1 넣기
		//1. 정렬해서 제일 끝에 있는 수가 제일 작은수
		//2. Collections.min(컬렉션)
		int[] n2 = n.clone(); //깊은 복사를 해야 값의 목록이 따로 생김
		Arrays.sort(n2);
		//System.out.println(Arrays.toString(n));
		//System.out.println(Arrays.toString(n2));
		int min = n2[0];
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n2.length -1 ; i++) {
			if (n[i] != min) {
				list.add(n[i]);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
			
		}
		
		//System.out.println(list);
		System.out.println(Arrays.toString(answer));
	}

}
