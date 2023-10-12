package 자바입문;

public class 데이터활용 {

	public static void main(String[] args) {
		String account = "01-123-456"; //계좌
		int balance = 0; //잔액 저장
		int deposit = 0; //입금액 저장
		int withdraw = 0; //출금액 저장
		double rate = 3.3; //이율
		double interest = 0.0; //이자금액 저장
		deposit = 500000; //500000원 입금
		balance += deposit; //잔액 계산
		withdraw = 200000; //200000원 출금
		balance -= withdraw; //잔액 계산
		interest = balance * rate; //이자 계산
		System.out.println(balance); //잔액 출력
	}

}
