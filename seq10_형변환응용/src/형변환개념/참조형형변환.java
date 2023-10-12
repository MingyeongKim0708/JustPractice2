package 형변환개념;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 참조형 형변환은 상속관계에서만 가능하다.
		// 가변길이, 타입 여러개일 때 사용
		// list = {a,b,c};
		// list = {b,c}; // 데이터 변경이 있을 때 자리를 옮긴다.
		// list = {b,d,c}; //자리를 옮긴다.
		// 데이터 변경이 너무 많을 때 사용 불편. ==> 이럴 때는 LinkedList 사용 권장
		ArrayList list = new ArrayList();
		list.add("나는 스트링"); //Object(큰) <-- String(작)
		// 자동으로 Object 타입으로 변환되어 들어감. 자동형변환
		
		list.add(100); //Object(큰) <-- Integer(작)
		// int는 기본형이라 Object의 자식은 아니지만 Integer로 변환하는게 자식으로 들어가있음
		
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("값 >> " + list.get(i));
		}
		//list에 있는 값 각각 꺼내서 변수에 넣기
		String s = (String)list.get(0); //CPU가 Object 상태를 String으로 강제형변환해서 변수에 넣어줌. Casting(캐스팅)
		
		list.add(new JButton("나는 버튼"));
		
		JButton b1 = (JButton)list.get(2);
	}

}
