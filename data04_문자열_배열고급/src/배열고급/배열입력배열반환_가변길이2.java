package 배열고급;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열입력배열반환_가변길이2 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		int find = 3;
		Solution5 s = new Solution5();
		int[] result = s.solution(n, find);
		System.out.println(Arrays.toString(result));
	}
}

class Solution5 {
	public int[] solution(int[] n, int find) {
		// find의 배수가 되는 값의 목록만 구해보세요.
		// 1. 답안의 개수가 가변이어서 ArrayList필요
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 2. 반복문으로 일단 list에
		// find의 배수가 되는 숫자들을 모으자.
		// if(n[i] % find == 0)

		for (int i = 0; i < n.length; i++) {
			if (n[i] % find == 0) {
				list.add(n[i]);
			}

		}
		// 3. 리스트를 프린트해서 확인해보고, 사이즈확인
		System.out.println(list);
		System.out.println(list.size());
		// 4. 배열을 리스트 사이즈만큼 만들어주고
		// 5. 리스트에서 꺼내서 배열에 같은 인덱스에 넣어주세요.
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
