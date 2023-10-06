package 메서드기본;

import java.util.Random;

public class 내카페2 {

	public static void main(String[] args) {
		계산기2 cal = new 계산기2();

		// 메서드 이름이 하나로 똑같다.
		// 입력형태가 다양하다.
		// 하나의 이름으로 여러 형태를 만들 수 있다.
		// 다형성(오버로딩) 제공
		int total = cal.add(100, 200);
		System.out.println(total);

		double total2 = cal.add(100, 200.1);
		System.out.println(total2);

		double total3 = cal.add(100.1, 200.1);
		System.out.println(total3);

		String total4 = cal.add("가나다", 200);
		System.out.println(total4);

		int[] total5 = cal.add();
		for (int i = 0; i < total5.length; i++) {
			System.out.print(total5[i] + " ");
		}
		System.out.println(total5[0] + 100);
		
		double total6 = cal.add(100, 200) + cal.add(100.1, 200.1);
		System.out.println(total6);
		
		Random r = new Random();
		int x = r.nextInt();
		int y = r.nextInt(100);
		double z = r.nextInt(); //double 8byte <-- int 4byte
		

	}

}
