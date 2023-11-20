package 배열기본;

import java.util.Arrays;

public class 스트링정리문제 {

	public static void main(String[] args) {

		String s1 = "참좋다";
		String s2 = "진짜좋다";
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		String rs = "두 문자열은 다름";
		String rs2 = s1 + " 의 길이가 더 길다.";
		
		if (s1.equals(s2)) {
			rs = "두 문자열이 동일함";
		}
		
		if (l1 < l2) {
			rs2 = s2 + " 의 길이가 더 길다.";
		}else if(l1 == l2) {
			rs2 = "두 문자열의 길이가 같다.";
		}
		
		System.out.println(rs);
		System.out.println(rs2);
		
		System.out.println("==================================");
		
		String s3 = "나는 진짜 java programmer가 되었어";
		int l3 = s3.length();
		String s33 = s3.substring(6, 21);
		System.out.println(s33.toUpperCase());
		
		System.out.println("==================================");
		
		String s4 = "2056521";
		char c = s4.charAt(0);
		
		if (c == '2' || c == '4') {
			System.out.println("여성");
		}else {
			System.out.println("남성");
		}
		
		System.out.println("==================================");
		
		String s5 = " [  10, 222, 30, 405, 50]";
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		s5 = s5.trim();
		String[] s6 = s5.split(", ");
		Print.arr(s6);
		int sum = 0;
		for (String s : s6) {
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
		
		int[] newArr = new int[s6.length];
		
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = Integer.parseInt(s6[i]);
		}
		Print.arr(newArr);
		Arrays.sort(newArr);
		Print.arr(newArr);
		
		System.out.println("==================================");
		
		String s10 = "정길동";
		String s20 = "정길동";
		System.out.println(s10 == s20); //참조형 - 주소 비교
		s10 = "홍길동";
		System.out.println(s10 == s20); //참조형 - 주소 비교
		//참조형 - 주소가 가리키는 값이 동일한지 비교 : 함수 이용
		System.out.println(s10.equals(s20));
		
		s10 = "김길동";
		s10 = "박길동";
		//String이 변경될 때는 새로운 메모리에 새로운 변경된 데이터를 넣음 -> 비효율적
		StringBuilder sb = new StringBuilder();
		sb.append("홍길동");
		System.out.println(sb);
		sb.append("가나다");
		System.out.println("append : " + sb);
		sb.insert(2, "하하하");
		System.out.println("insert : " + sb);
		sb.delete(0, sb.length());
		sb.append("끝");
		System.out.println("최종 : " + sb);
		String s30 = "푸하하굿바이";
		char[] c2 = s30.toCharArray();
		Print.arr(c2);
		char c3 = s30.charAt(0);
		System.out.println(c3);
		
		//String --> String[], char[], char, subString
	}

}
