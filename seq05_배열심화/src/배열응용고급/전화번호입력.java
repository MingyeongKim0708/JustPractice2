package 배열응용고급;

import java.util.Arrays;

public class 전화번호입력 {

	public static void main(String[] args) {
		String num = "   011-245-1234";
		String num2 = num.trim();
		String[] num3 = num2.split("-");
		
		System.out.println(num.indexOf("0")); //0이 인덱스 몇번에 있는지
		
		System.out.println(Arrays.toString(num3));
		
		//첫번째 문자열으로 회사 구분
		String com = "";
		if (num3[0].equals("011")) {
			com = "SK";
		}else if (num3[0].equals("019")) {
			com = "LG";
		}else {
			com = "Apple";
		}
		
		//두번째 문자열의 길이가 4개이상. 최신폰, 올드폰
		String stat = "";
		if (num3[1].length() >=4) {
			stat = "최신폰";
		}else {
			stat = "올드폰";
		}
		
		//전체 전화번호의 길이가 10글자 이상
		//배열 합치기
		String num4 = "";
		for (String x : num3) {
			num4 = x + num4;
		}
		
		String val = "";
		if (num4.length() >= 10) {
			val = "유효한 전화번호";
		}else {
			val = "유효하지 않은 전화번호";
		}
		
		System.out.println(num2 + "는 " + com + "의 " + stat + "입니다. " + val + "입니다.");
	}

}
