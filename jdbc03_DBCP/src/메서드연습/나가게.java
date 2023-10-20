package 메서드연습;

public class 나가게 {

	public static void main(String[] args) {
		int coffeePrice = 5000;
		int coffeCount = 15;

		계산기 cal = new 계산기();
		
		// 커피계산가격이 5만원 이상이면 5000원 할인
		int result = cal.mul(coffeePrice, coffeCount);
		if (result >= 50000) {
			System.out.println("최종 계산 금액은 " + (result - 5000));
		} else {
			System.out.println("최종 계산 금액은 " + result);
		}
		
		// array()를 호출하여 결과를 받아온 후, 배열의 첫번째 값을 꺼내 100을 더해 프린트
		int result2[] = cal.array();
		System.out.println(result2[0] + 100);
		
		// get2를 호출하여 결과를 받아온 후 비밀번호를 1111로 수정후 vo에 값 넣을 때 set() 사용 전체 멤버 정보 프린트
		MemberVO result3 = cal.get2("win2", "1234", "win2", "011");
		result3.setPw("1111");
		System.out.println(result3);
		
		
		//get4("홍길동", 100)을 호출하여 결과를 받아온 후, 맨 뒤에 "입니다. 환영해주세요"를 붙여서 프린트
		String g = cal.get4("홍길동", 100);
		System.out.println(g + "입니다. 환영해주세요");
		
	}// main

}// class
