package 배열기본;

import java.util.Random;

public class 랜덤한배열최대값찾기 {

	public static void main(String[] args) {
		Random r = new Random();
		r.setSeed(100);
		int[] numbers = new int[1000];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(1000);
			
		}
		Print.arr(numbers);
		
		int max = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		
		System.out.println(max);
	}
}
