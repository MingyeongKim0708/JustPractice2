package 컬렉션;

import java.awt.Button;
import java.util.ArrayList;

public class 리스트연습1 {

	public static void main(String[] args) {
		// 순서가 있는 데이터를 모으고 싶을 때
		// 배열??? 컬렉션(리스트 형태)
		// ArrayList
		ArrayList list = new ArrayList();
		// Collection 상속 - add(), ...
		list.add(100);
		list.add(11.1);
		list.add(true);
		list.add('a');
		list.add("hong");
		list.add("hong");
		list.add(new Button());
		System.out.println(list); // toString()
		// ArrayList안에 toString()이 재정의(Override)
		// list라고 주소가 가리키고 있는 데이터들을 프린트하도록 Override되어있음
		
		System.out.println(list.get(0)); //0번째 값
		System.out.println(list.size()); //개수
		
		//hong을 꺼내서 gildong을 붙여 프린트
		System.out.println(list.get(4)+"gildong");
		//for문으로 이용해서 하나씩 꺼내와 프린트 : "값>> " + 100
		//for문, for-each문 둘다 사용 가능
		for (int i = 0; i < list.size(); i++) {
			System.out.println("값 >> " + list.get(i) + 100);
		}
		for (Object x : list) { //list 안에 다양한 데이터 타입이 있기 때문에 Object를 사용함
			System.out.println("값>> " + x);
		}
		System.out.println(list.contains("hong")); //contains = 값이 들어있는지 확인함
		System.out.println(list.indexOf("hong")); //indexOf = 값의 위치 (가장 첫번째로 있는 것)
		System.out.println(list.isEmpty()); //isEmpty = list가 비어있는지 확인 // 원본을 건드리지 않는 함수 - 비파괴형 함수
		list.remove(0); //원본을 건드리는 함수 - 파괴형 함수
		list.remove(11.1);
		list.add(0,"추가"); //0번 앞에 넣기-->얘가 0번이 됨
		list.set(0, "또 수정"); //0번 값을 수정
		System.out.println(list);
	}

}
