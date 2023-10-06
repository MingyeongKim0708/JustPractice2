package 변수;

public class 친구 {

	public static void main(String[] args) {
		// 기본형 4가지, 문자열 기본형처럼 사용 가능
		// 기본형 4가지 변수(저장소)에 값이 1개만 저장됨.

		String name = "홍길동";
		int age = 200;
		String address = "홍천";
		double weight = 88.8;
		boolean pro = true;
		char color = 'y';

		// 대충치다가 저장하고 컨트롤 시프트 F -> 코드 줄 정리
		// 문법 오류가 있으면 코드 정리 안됨.

		System.out.println("친구의 이름은 " + name + "이고 나이는 " + age + "세 이다.");
		System.out.println(address + "에 살고 있고 몸무게는 " + weight + "킬로이다.");
		System.out.println("좋아하는 색은 " + color + "가 들어가는 색이고, 프로그래머 여부는 " + pro + "이다.");

	}

}
