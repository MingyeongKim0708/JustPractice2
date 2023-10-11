package 컬렉션;

import java.util.ArrayList;

public class 컬렉션확인문제3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("복습하기");
		list.add("빨래하기");
		list.add("운동하기");
		list.add("저녁먹기");
		list.add("양치하기");
		
		System.out.println(list);
		System.out.println(list.get(0) + ", " + list.get(list.size()-1));
		list.set(1, "청소");
		System.out.println(list);
	}

}
