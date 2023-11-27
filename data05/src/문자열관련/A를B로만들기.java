package 문자열관련;

import java.util.Arrays;

public class A를B로만들기 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "healo";
		Solution10 s = new Solution10();
		s.solution(before, after);
	}

}

class Solution10 {
    public int solution(String before, String after) {
    	char[] b = before.toCharArray();
    	char[] a = after.toCharArray();
    	Arrays.sort(b);
    	Arrays.sort(a);
        boolean result = Arrays.equals(a, b);
        int answer = 0;
        if(result) {
        	answer = 1;
        }
        System.out.println(answer);
        return answer;
    }
}