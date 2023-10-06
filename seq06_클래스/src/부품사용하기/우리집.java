package 부품사용하기;

import 부품만들기.Tv;
import 부품만들기.전화기;

public class 우리집 {

	public static void main(String[] args) {
		// 틀-클래스 ==> 실제-객체
		Tv myTv = new Tv();
		myTv.ch = 7;
		myTv.vol = 9;
		myTv.onOff = false;

		Tv yourTv = new Tv();
		yourTv.ch = 7;
		yourTv.vol = 9;
		yourTv.onOff = false;

		// new ==> 객체 생성 키워드
		// Ram에 주소 + 멤버변수를 힙 영역(무더기 영역)에 만들어준다.4개. 주소변수1개+멤버변수3개
		
		System.out.println(myTv.ch);
		System.out.println(myTv.vol);
		System.out.println(myTv.onOff);
		
		전화기 p1 = new 전화기();
		p1.size = 11;
		p1.speaker = "바나나사";
		
		전화기 p2 = new 전화기();
		p2.size = 9;
		p2.speaker = "메론사";
		
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		System.out.println(p1);
		System.out.println(p2);
		p2.인터넷하다();
	}

}
