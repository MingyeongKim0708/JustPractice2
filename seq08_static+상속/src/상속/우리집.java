package 상속;

public class 우리집 {

	public static void main(String[] args) {
		System.out.println("최초의 아빠 지갑 : " + 딸.dadW + "원");
		딸 d1 = new 딸("홍길순", "여");
		System.out.println(d1);
		딸 d2 = new 딸("홍길진", "여");
		System.out.println(d2);

		System.out.println("딸이 총 몇 명인가 : " + 딸.count + "명");
		System.out.println("현재 아빠의 지갑 : " + 딸.dadW + "원");
	}

}
