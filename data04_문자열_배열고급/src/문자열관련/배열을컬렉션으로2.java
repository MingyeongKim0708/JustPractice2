package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열을컬렉션으로2 {

	public static void main(String[] args) {
		String[] s2 = { "감자", "고구마", "우유", "감자", "양파" };
		List<String> list = Arrays.asList(s2);
		System.out.println(list); // 읽기 전용

		//1.마지막 감자 위치
		System.out.println(list.lastIndexOf("감자"));
		//2.양파 OX
		if (list.contains("양파")) {
			System.out.println("양파는 안 사도 된다.");
		}else {
			System.out.println("양파를 사서 냉장고에 넣기");
		}
		//3.우유->춘식이 우유
		list.set(2, "춘식이 우유");
		System.out.println(list);
		//4.양파 위치 찾기 -> 양파즙으로 수정
		int index = list.indexOf("양파");
		list.set(index, "양파즙");
		System.out.println(list);
		//5.다시 배열로 변환
		String[] s3 = (String[])list.toArray(); //Object[]
		System.out.println(Arrays.toString(s3));
	}

}
