package 메서드기본;

public class 내카페3 {

	public static void main(String[] args) {
		계산기3 cal = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전
		int count2 = 4; // 오후

		int total = cal.add(count1, count2);
		System.out.println("손님 수 : " + total + "명");
		
		int result = cal.minus(count1, count2);
		System.out.println("오전 오후 손님수 차이는 " + result + "명");
		
		int today1 = cal.mul(count1, price);
		System.out.println("오전 손님 결제 금액 : " + today1);
		
		int today2 = cal.mul(count2, price);
		System.out.println("오후 손님 결제 금액 : " + today2);
		
		int money = cal.add(today1, today2);
		System.out.println("오전 오후 총 결제 금액 : " + money);
		
		int one = cal.div(money, total);
		System.out.println("1인당 결제 금액 : " + one);

	}

}
