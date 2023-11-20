package Programmers;

public class d3_12문자리스트를문자열로변환하기 {

	public static void main(String[] args) {
		String[] arr = {"a", "b", "c"};
		String answer = "";
		
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		
		System.out.println(answer);
	}

}
