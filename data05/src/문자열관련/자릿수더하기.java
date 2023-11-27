package 문자열관련;

public class 자릿수더하기 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int num = 1234;
		int result = s.solution(num);
		System.out.println(result);
	}
}

class Solution2 {
	public int solution(int n) {
		String s = String.valueOf(n);
		int answer = 0;
		// String 값 분리
		// 1)char
		char[] c = s.toCharArray();
		// c = {'1', '2', '3', '4'};
		for (int i = 0; i < c.length; i++) {
			answer = answer + c[i] - '0'; //0 빼기! 아스키코드 주의
		}

		// 2)String --> 함수 더 많아서 편리. 단 메모리를 char보다 많이 먹음
		//String[] s2 = s.split("");
		// s2 = {"1" , "2", "3", "4"};
//		for (int i = 0; i < s2.length; i++) {
//			int x = Integer.parseInt(s2[i]);
//			answer = answer + x;
//		}
		return answer;
	}
}