package 메서드기본;

public class 계산유틸리티 {
	public static void main(String[] args) {
		double num = 567.1234;
		double num2 = -567.1234;
		
		System.out.println(Math.abs(num2)); //절대값
		System.out.println(Math.ceil(num)); //올림
		System.out.println(Math.floor(num)); //내림
		System.out.println(Math.round(num)); //반올림
		System.out.println(Math.sqrt(num)); //루트
		System.out.println(Math.pow(num, 2)); //제곱
		System.out.println(Math.max(num, num2));
		System.out.println(Math.min(num, num2));
	}
	
	//유틸리티(utility, util) - import java.util.*;
	//Date, Random - import java.util.Date
	//핵심 유틸리티, 너무 자주 쓰는 것들 - java.lang.*
	//System, String, Math ==> 너무 기본적이라 import 하지 않아도 이미 들어가있음
}
