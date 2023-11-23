package 문자열관련;

public class 문자열뒤집기 {

	public static void main(String[] args) {
		String my_string = "jaron";
		Solution s = new Solution();
		s.solution(my_string);
	}

}

class Solution {
	public String solution(String my_string) {
		String answer = "";
		for (int i = my_string.length() - 1; i >= 0; i--) {
			answer = answer + my_string.charAt(i);
		}
		System.out.println(answer);
		return answer;
	}
}