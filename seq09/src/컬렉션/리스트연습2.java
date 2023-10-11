package 컬렉션;

import java.util.ArrayList;

public class 리스트연습2 {

	public static void main(String[] args) {
		//순서가 있는 항목 --> list 유형 --> ArrayList 사용
		ArrayList list = new ArrayList();
		//java.lang.* ==> String, System, Integer, ...
		//java.util.* ==> ArrayList, HashSet, Random, Date, ...
		
		list.add("박소정"); //1등
		list.add("김정민"); //2등
		list.add("소지현"); //3등
		list.add("김개념"); //4등
		list.remove(1); //2등 반칙 탈락
		
		//등수 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "등 " + list.get(i));
		}
		
		System.out.print("김정민이 포함되어 있나요?");
		System.out.println(list.contains("김정민"));
		
		System.out.print("박소정이 몇 등인가요?");
		System.out.println(list.indexOf("박소정")+1+"등");
		
		System.out.println("소지현 개명 -> 소혜련");
		list.set(1, "소혜련");
		System.out.println(list);
		
	}

}
