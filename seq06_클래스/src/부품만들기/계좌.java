package 부품만들기;

public class 계좌 {
	public String 이름;
	public String 계좌이름;
	public int 금액;

	public void 입금하다() {
		System.out.println(이름 + "이 " + 금액 + "원을 입금하다.");
	}

	public void 출금하다() {
		System.out.println(이름 + "이 " + 계좌이름 + "에서 출금하다.");
	}

	@Override
	public String toString() {
		return "계좌 [이름=" + 이름 + ", 계좌이름=" + 계좌이름 + ", 금액=" + 금액 + "]";
	}
	
}
