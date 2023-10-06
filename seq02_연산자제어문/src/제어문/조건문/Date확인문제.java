package 제어문.조건문;

import java.util.Date;

public class Date확인문제 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int year = date.getHours() + 1900;
		
		String result = "밀레니엄 세대가 아니시군요.";
		if(year>2000) {
			result = "밀레니엄 세대시군요.";
		}
		System.out.println(result);
		System.out.println("-------------------");
		
		int day = date.getDay(); //0부터 일요일
		switch (day) {
		case 0:
		case 6:
			System.out.println("주말이라 쉬자~");
			break; //0에서 break가 걸리지 않기 때문에 0인경우 6인 경우 다 주말이라 쉬자에서 걸린다
		default:
			System.out.println("열심히 공부하자~");
			break;
		}
		
		int month = date.getMonth()+1;
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
			break;
		}
		
	}

}
