package 예외처리;

public class 문제발생 {

	public static void main(String[] args) {
		System.out.println("1. 나는 실행됨");
		try {
			System.out.println("2. 0으로 나누기" + 10/0); // 0으로 나누기 --> 수학적 에러 --> 런타임 에러
			int[] arr = {1,2,3};
			System.out.println(arr[3]); // 0~2 --> 배열 에러 --> 런타임 에러 발생
		} catch (Exception e) {
			// e.printStackTrace();
			// 서버 관리자에게 이메일 보내는 처리, 서버 관리자에게 문자 보내는 처리 - 관리자를 위한 처리
			// git History 처리, Jira History 처리 - 관리자를 위한 처리
			System.out.println("0으로 나누는 것은 실패함"); // 사용자를 위한 처리
		}
		System.out.println("3. 여기는 프린트 될까요?");
	}

}
