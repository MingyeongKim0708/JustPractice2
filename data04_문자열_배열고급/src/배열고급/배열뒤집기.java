package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class 배열뒤집기 {

	public static void main(String[] args) {
		Solution01 s = new Solution01();
		int[] num_list = {1, 2, 3, 4, 5};
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution01 {
	public int[] solution(int[] num_list) {
		//Collections.revese()
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for (int x : num_list) {
//			list.add(x);
//		}
//		Collections.reverse(list);
//		System.out.println("list : " + list);
		
		//다른 방법
		int[] answer = new int[num_list.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[answer.length-i-1];
		}
		return answer;
	}
}