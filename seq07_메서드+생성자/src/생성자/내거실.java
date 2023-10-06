package 생성자;

import 부품만들기.Tv;

public class 내거실 {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.ch = 5;
		tv.onOff = false;
		tv.vol = 100;
		System.out.println(tv);
		
		TV2 tv2 = new TV2(6, 200, true);
		System.out.println(tv2);
		
		TV2 tv3 = new TV2(6, 200);
		System.out.println(tv3);
	}

}
