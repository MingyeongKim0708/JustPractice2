package 문자열관련;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		String my_string = "Bcad";
		Solution11 s = new Solution11();
		System.out.println(s.solution(my_string));
	}

}

class Solution11 {
    public String solution(String my_string) {
    	String after = my_string.toLowerCase();
    	char[] c = after.toCharArray();
    	Arrays.sort(c);
    	String answer = new String(c);
    	
        return answer;
    }
}