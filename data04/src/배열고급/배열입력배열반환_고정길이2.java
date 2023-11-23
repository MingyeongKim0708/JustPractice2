package 배열고급;

import java.util.Arrays;

public class 배열입력배열반환_고정길이2 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		Solution2 s = new Solution2();
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution2 {
	public int[] solution(int[] n) {
		int[] answer = new int[3];
		//배열은 홀수개만 들어온다 
		//중앙값의 위치는 ==> 배열의개수/2
		int med = n.length /2;
		//배열을 정렬 후 
		Arrays.sort(n);
		//중앙값을 구하고 ==> answer배열에 첫번째 위치에 넣는다.
		answer[0] = n[med];
		//중앙값에다 10을 더한 수 ==> answer배열에 두번째 위치에 넣는다.
		answer[1] = n[med]+10;
		//중앙값에다 10을 빼 수 ==> ==> answer배열에 세번째 위치에 넣는다.
		answer[2] = n[med]-10;
		//배열에 하나로 묶어서 리턴 
		return answer;
	}
}