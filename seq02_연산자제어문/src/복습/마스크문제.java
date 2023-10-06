package 복습;

public class 마스크문제 {

	public static void main(String[] args) {
		int waterP = 1000;
		int waterC = 2;
		int maskP = 2000;
		int maskC = 3;
		//변수는 상수가 아니면 소문자로 사용한다
		
		int waterR = waterP * waterC;
		int maskR = maskP * maskC;
		int result = waterR + maskR;
		
		System.out.println("생수값 : " + waterR + ", 마스크값 : " + maskR + ", 총 지불금액 : " + result);
	}

}
