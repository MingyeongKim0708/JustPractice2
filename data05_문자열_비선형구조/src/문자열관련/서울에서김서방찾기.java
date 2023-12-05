package 문자열관련;

import java.util.Arrays;
import java.util.List;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		Solution6 s = new Solution6();
		String[] s2 = {"Jane", "Kim"};
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution6 {
	public String solution(String[] s2) {
		//String의 문자를 하나하나 분리해야한다면 
		//list, array을 사용하세요.!
		List<String> list = Arrays.asList(s2);
		int index = list.indexOf("Kim");
		String answer = "김서방은 " + index + "에 있다.";
		
		return answer;
	}
}