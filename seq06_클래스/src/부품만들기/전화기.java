package 부품만들기;

public class 전화기 {
	// 멤버 변수 + 멤버 메서드
	public int size; // 기본형변수, 전역변수
	// 전역변수는 자동초기화 0이 들어가있음
	public String speaker; // 참조형변수, 전역변수
	// 전역변수는 자동초기화 null로 초기화

	public void 전화받기() {
		System.out.println("전화를 받는다");
	}

	public void 인터넷하다() {
		System.out.println("크롬으로 인터넷을 한다");
	}

	@Override
	public String toString() {
		return "전화기의 사이즈는 " + size + ", 회사는 " + speaker + "이다.";
	}

	// 상속받은 메서드가 8개 있음. (@Override)
	// 눈에 안보임
	// 상속받은 메서드를 재정의해서 쓸 수 있음
	// 마음대로 고쳐쓸 수 있음.
	// Source-Generate toSTring() ==> 소스를 자동생성해주는 코드 (@Override부분)
	// ==> 주소가 들어가는 참조형 변수를 프린트할 때 주소말고 주소가 가르키는 인스턴스 변수의 값들을 프린트하고 싶을 때 사용
	// 이걸 해주지 않으면 우리집.java의 System.out.println(p1); 부분에서 주소가 나온다
}
