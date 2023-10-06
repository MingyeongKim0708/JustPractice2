package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤테스트 {

	public static void main(String[] args) {
		Random r = new Random(100); //여기에 100을 적어도 아래와 동일함
		//r.setSeed(100); // ==>100을 적으면 항상 그것과 관련된 고정값이 나옴
		
		int[] arr = new int[1000];
		for (int i = 0; i < 1000; i++) {
			arr[i] = r.nextInt(100); // +-21억 ==>0부터 시작해서 지정한 값보다 하나 작은 범위의 값(0~99)
		}
		System.out.println(Arrays.toString(arr));
	}

}
