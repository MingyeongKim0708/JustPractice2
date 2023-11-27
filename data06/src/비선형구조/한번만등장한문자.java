package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String s2 = "abcabcadc";
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution1 {
	public String solution(String s2) {
		//1.String 하나씩 분리. list에 모으기
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < s2.length(); i++) {
			list.add(s2.charAt(i) + "");
		}
		//System.out.println(list);
		
		//2.어떤 것이 들어있는지 목록 만들기.
		//list 중에서 중복 제거하고 모으기. ==> set
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		//System.out.println(set); //set 변수는 주소가 들어있음
		//주소가 들어있는 참조형 변수를 프린트할 때 그 주소가 가리키는 값을 프린트하고 싶다면
		//주소를 찍어주는 함수를 바꾸면 된다.
		//컬렉션의 toString()이 모두 바뀌어져있음(오버라이드)
		//[값,값,값]
		
		//set은 get함수 사용 불가
		//set 안에 있는 값(엘리먼트, 요소)을 하나씩 접근하기 위해서 반복자 필요
		Iterator<String> it = set.iterator();
		String answer = "";
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i = 0; i < set.size(); i++) {
			String s3 = it.next();
			int f = Collections.frequency(list, s3);
			if (f == 1) {
				result.add(s3);
			}
		}
		
		//3.정렬
		Collections.sort(result);
		answer = String.join("", result);
		return answer;
	}
}