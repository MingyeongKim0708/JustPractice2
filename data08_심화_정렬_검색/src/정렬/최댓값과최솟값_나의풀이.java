package 정렬;

import java.util.ArrayList;
import java.util.Collections;

public class 최댓값과최솟값_나의풀이 {

	public static void main(String[] args) {
		Solution00 s = new Solution00();
		String s2 = "1 2 3 4";
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution00 {
	public String solution(String s2) {
		ArrayList<Character> list = new ArrayList<>();
		
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) != ' ') {
				list.add(s2.charAt(i));
			}
		}
		Collections.sort(list);
		char a = list.get(0);
		char b = list.get(list.size()-1);

		String answer = "";
		answer = a + " " + b;
		return answer;
	}
}