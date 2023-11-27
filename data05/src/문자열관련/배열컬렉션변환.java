package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 배열컬렉션변환 {

	public static void main(String[] args) {
		String[] s3 = { "박명수", "유재석", "김종국", "송지효", "하하" };
//		오름차순 정렬해서 프린트
//		내림차순 정렬해서 프린트
//		글자수가 3미만인 사람 삭제후  프린트
//		유재석을 찾아서 유재돌로 변경한 후 프린트
//		전체 목록에 "김종민"을 3번째에 추가한 후 프린트
		//List list = Arrays.asList(s3); 
		List<String> list = Arrays.asList(s3); 
		//단점! 읽기중심, 값변경은 가능!
		//추가, 삭제 기능도 사용하고 싶은 경우는 ArrayList를 새로 만드세요.!
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(s3));
//		오름차순 정렬해서 프린트
		Collections.sort(list2);
		System.out.println(list2);
//		내림차순 정렬해서 프린트
		Collections.reverse(list2);
		System.out.println(list2);
//		글자수가 3미만인 사람 삭제후  프린트
		for (int i = 0; i < list2.size(); i++) {
			String s2 = list2.get(i);
			if (s2.length() < 3) {
				list2.remove(i);
			}
		}
		System.out.println(list2);
//		유재석을 찾아서 유재돌로 변경한 후 프린트
		int index = list2.indexOf("유재석");
		list2.set(index, "유재돌");
		System.out.println(list2);
//		전체 목록에 "김종민"을 3번째에 추가한 후 프린트
		list2.add(3, "김종민");
		System.out.println(list2);
	}
}