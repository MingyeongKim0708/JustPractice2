package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;

public class 숫자찾기 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int num = 29183;
		int k = 1;
		int result = s.solution(num, k);
		System.out.println(result);
	}
}

class Solution1 {
	public int solution(int num, int k) {
		//인덱스 활용 문제 ==> array, list, String 등으로 바꿔서 풀기
		String s = String.valueOf(num);
		String k2 = String.valueOf(k);
        int index = s.indexOf(k2);
        int answer = -1; //못 찾은 경우
        if (s.contains(k2)) {
			answer = index + 1;
		}
        return answer;
    }
}