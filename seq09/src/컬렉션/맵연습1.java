package 컬렉션;

import java.util.HashMap;

public class 맵연습1 {

	public static void main(String[] args) {
		// map - 매핑시킨다. 연결시킨다.
		// 키 - 값의 쌍으로 매핑시켜서 연결시켜서 저장함.
		HashMap map = new HashMap();
		map.put("apple", "사과");
		map.put("melon", "메론");
		map.put("ice", "아이스크림");
		System.out.println(map);
		System.out.println(map.get("apple"));
		//map은 순서(index)가 없다.
		map.put("apple", "파란사과"); //덮어쓰기
		System.out.println(map.get("apple"));
		map.remove("apple"); //파괴함수
		System.out.println(map);
		map.replace("ice", "아이스크림", "초코아이스크림");
		System.out.println(map);
		map.clear(); //map지우기
		System.out.println(map);
	}

}
