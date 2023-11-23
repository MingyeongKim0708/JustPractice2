package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열을컬렉션으로 {

	public static void main(String[] args) {
		String[] s2 = {"aaa", "ccc", "bbb"};
		//컬렉션이 함수가 풍부함
		List<String> list = Arrays.asList(s2);
		System.out.println(list); //읽기 전용
		
		//순서확인
		int index = list.indexOf("bbb");
		System.out.println(index);
		
		//포함여부확인
		boolean result = list.contains("ccc");
		System.out.println(result);
		
		//오름차순
		Collections.sort(list);
		System.out.println(list);
		
		//뒤집기
		Collections.reverse(list);
		System.out.println(list);
		
		//list.add("ttt"); //java.lang.UnsupportedOperationException - asList 는 Read Only - 수정 불가능
		System.out.println(list);
		
		//수정을 하고 싶은 경우 new로 list 새로 만들기
		ArrayList<String> list2 = new ArrayList<String>(list);
		System.out.println(list2); //편집가능
		
		list2.add("ttt");
		System.out.println(list2);
	}

}
