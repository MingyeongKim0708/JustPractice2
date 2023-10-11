package 컬렉션;

import java.util.HashMap;

public class 맵연습2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(100, "김데이");
		map.put(200, "김사전");
		map.put(300, "김구조");
		map.put(400, "김자료");
		
		map.remove(200); //200번 고객 탈퇴
		map.replace(300, "김충성"); //300번 고객 개명
		
		System.out.println(map);
	}

}
