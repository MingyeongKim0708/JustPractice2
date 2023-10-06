package 메서드기본;

public class 계산기 {
	//public X - 같은 패키지 내에서만 사용함
	//public O - 다른 패키지에서도 사용 가능
	public void add() {
		//add라고 하는 명령어(함수=메서드)에 대한 처리 내용
		System.out.println("더하기 기능 처리됨.");
	}
	public int add2() {
		int price = 5000;
		int count = 3;
		int sum = price * count;
		return sum;
	}
	
	//입력값을 받기 위해서 만들어진 변수
	//전달, 받는 중간 다리 역할을 하는 변수
	//매개변수(parameter, 파라메터)
	public int add3(int price, int count) {
		int sum = price * count;
		return sum;
	}
	
	//입력한 값 10000원에 미수금 2000원을 더해서 리턴한 다음 1000을 빼서 출력
	public int add4(int price) {
		return price + 2000;
	}
}
