package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {
		Random r = new Random(42); // seed값 42
		int[] jumsu = new int[10000];

		int sum = 0;

		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451); // 0~450
			sum = sum + jumsu[i];
		}
		System.out.println(Arrays.toString(jumsu));
		System.out.println("평균 : " + (double) sum / jumsu.length);

		// 최대값, 최소값
		// 오름차순으로 정렬해보자
		// cpu가 ram의 값을 변경해버림 ==> 파괴형 함수
		Arrays.sort(jumsu); // 램에 들어있는 10000개의 데이터를 위치를 옮겨 정렬해줌

		String data = "100";
		// cpu가 ram의 값을 변경하지 않는다(함수들 중에 85%에 해당) ==> 비파괴형 함수
		int data2 = Integer.parseInt(data);
		// Arrays.toString(jumsu); //==>비파괴형 함수
		// Double.parseDouble(data); //==>비파괴형 함수

		System.out.println(Arrays.toString(jumsu));

		int min = jumsu[0];
		int max = jumsu[jumsu.length - 1];

		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);

		// 최소, 최대점인 사람의 수
		int minCount = 0, maxCount = 0;

		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == min) {
				minCount++;
			} else if (jumsu[i] == max) {
				maxCount++;
			}
			// if를 둘다 써두는 것보다 if-else if를 쓰는 게 좋음. cpu를 적게 씀.
			//  if에서 이미 처리 되면 else if를 처리할 필요없어짐. if 두개면 둘다 CPU가 체크해야함
		}
		System.out.println("최하점수를 받은 사람 수 : " + minCount);
		System.out.println("최고점수를 받은 사람 수 : " + maxCount);

		// 300점 이상인 사람의 수를 카운트
		int count300 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				count300++;
			}
		}
		System.out.println("300점 이상인 사람의 수 : " + count300);
	}

}
