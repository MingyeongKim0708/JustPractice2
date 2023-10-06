package 변수;

public class 기본형심화 {

	public static void main(String[] args) {
		// 기본형 데이터 4가지 ==> 값을 변수에 바로 넣는다
		// 정수, 실수, 문자1, 논리
		// 정수 4가지(byte(8bit), short, int, long) long을 넘어가면 너무 커서 담당하는 클래스가 따로 있음
		// 실수 2가지(float, double)
		byte age = 127; //+-127 (-128~127)
//		byte age2 = 128; //error
		short wallet = 25000; // +-3만, 2byte
		int money = 2000000000; // +-21억, 4byte
		long space = 20000000000L; //21억 이상, 8byte, L을 적어주지 않으면 기본적으로 int라고 생각해버려서 오류가 뜬다
		
		
		float weight = 88.8f; // 소수점을 많이 쓸 생각 없으니까 F 붙여주기(소문자,대문자 가능)
		double height = 185.5;
		
		// age, wallet, money 모두 int로 했을 때와 메모리 크기 비교!
		// 각각 타입을 다르게 해서 메모리 할당 ==> 7byte
		// 모두 같은 타입인 int로 메모리 할당 ==> 12byte
		// 은행 고객이 5명 로그인을 한 경우
		// 1) 7*5 = 35byte
		// 2) 12*5 = 60byte

	}

}
