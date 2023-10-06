package 복습;

public class 나이문제 {

	public static void main(String[] args) {
		int age = 100;
		int next = age + 1;
//		String answer = "";
//		if (next > 100) {
//			answer = "이제부터 시작";
//		}else {
//			answer = "아직 젊어요";
//		}
		
		//선호 코드. CPU입장에선 else를 할 필요 없음.
		String answer = "아직 젊어요";
		if (next > 100) {
			answer = "이제부터 시작";
		}
		
		System.out.println(answer);
	}

}
