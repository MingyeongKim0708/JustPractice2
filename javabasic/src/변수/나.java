package 변수;

public class 나 {

	public static void main(String[] args) {
		// 기본형 데이터 변수에 저장하는 것 연습
		// 기본형 데이터 - 정수, 실수, 문자 한 글자, 논리
		//변수는 반드시 초기값을 넣어주세요. (초기화)
		int age = 100;
		double height = 172.2;
		char gender = '남';
		boolean food = true;
		// String은 기본형이 아닌데 너무 많이 써서 기본형처럼 쓸 수 있게 됨. 대문자로 사용
		String name = "임아무개";
		
		System.out.println("오늘은 월요일입니다.");
		System.out.println("내 나이는 " + age);
		System.out.println("내 키는 " + height);
		System.out.println("내 성별은 " + gender);
		System.out.println("나는 밥을 먹었다 " + food);
		System.out.println("나는 밥을 먹었다 " + food);
		System.out.println("나의 이름은 " + name);
	}

}
