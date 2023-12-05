package 배열컬렉션변환;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class 배열자르기 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] n = {1,2,3,4,5};
		int start = 1;
		int end = 3;
		int[] result = s.solution(n, start, end);
		System.out.println(Arrays.toString(result));
	}
}

class Solution1 {
    public int[] solution(int[] numbers, int num1, int num2) {
    	//시간, 공간복잡도 제일 좋은 것 Arrays.copyOfRange(배열, 시작, 끝+1)
        //int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
        int[] answer = new int[num2 - num1 + 1];
        
        for (int i = 0; i < answer.length; i++) {
			answer[i] = numbers[num1 + i];
		}
        
        return answer;
    }
}