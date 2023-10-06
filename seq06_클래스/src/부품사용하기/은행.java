package 부품사용하기;

import 부품만들기.계좌;

public class 은행 {

	public static void main(String[] args) {
		계좌 dad = new 계좌(); //dad ==> 지역변수, 참조형변수
		dad.이름 = "홍길동";
		dad.계좌이름 = "튼튼적금";
		dad.금액 = 1000;
		
		계좌 mom = new 계좌();
		mom.이름 = "박길동";
		mom.계좌이름 = "튼튼예금";
		mom.금액 = 2000;
		
		계좌 me = new 계좌();
		me.이름 = "홍기사";
		me.계좌이름 = "다음적금";
		me.금액 = 3000;
		
		System.out.println(dad);
		System.out.println(mom);
		System.out.println(me);
		
		me.입금하다();
		
		//toString은 언제 호출되나? 참조형 변수를 프린트할 때 자동으로 호출됨
		//부품만들기.계좌@7852e922
		//패키지명.클래스명@주소관리코드값(해시코드값-중복되지 않는 값)

	}

}
