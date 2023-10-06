package 제어문.반복문;

public class 정리문제 {

	public static void main(String[] args) {
		// 33~222를 더하세요
		int sum = 0;
		for (int i = 33; i <= 222; i++) {
			sum = sum + i;
		}
		System.out.println("33~222의 합은 : " + sum);

		// 55~4500, 2씩 점프하면서 더하세요
		int sum2 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum2 = sum2 + i;
		}
		System.out.println("55~4500, 2씩 점프한 합은 : " + sum2);

		// 0~6000, 5씩 점프하면서 더하세요
		int sum3 = 0;
		for (int i = 0; i <= 600; i = i + 5) {
			sum3 = sum3 + i;
		}
		System.out.println("0~6000, 5씩 점프한 합은 : " + sum3);

		// 1~1000까지 중 3씩 점프해 더해주세요. 더한 값이 100이 넘으면 더하기를 종료. 5의 배수는 더하지 않습니다.
		int sum4 = 0;

		for (int i = 0; i <= 1000; i = i + 3) {
			if (sum4 <= 100) {
				if (i % 5 != 0) {
					sum4 = sum4 + i;
				}
			}
		} // for문

		System.out.println("답 >> " + sum4);

	}

}
