package 배열메서드입출력;

import java.util.*;
import 배열기본.Print;

public class 배열입력값정리 {

	public static void main(String[] args) {
		int[] n = { 11, 33, 55, 22, 66, 77, 88, 99 };
		
		// 1. 배열의 평균을 구해서 프린트
		int sum = Arrays.stream(n).sum();
		double avg = Arrays.stream(n).average().orElse(0);
		System.out.println(avg);
		
		// 2. 배열의 최소값을 3개를 찾아서 더해서 프린트
		Arrays.sort(n);
		System.out.println(n[0] + " " + n[1] + " " + n[2]);
		
		// 3. 배열의 중앙값을 구해서 프린트
		int med = n.length / 2;
		// 홀수인 경우) 중앙값에 10을 곱해서 프린트
		// 짝수인 경우) 중앙값들을 곱해서 프린트
		if (n.length%2 == 0) {
			System.out.println(n[med] * n[med-1]);
		}else {
			System.out.println(n[med]*10);
		}
		
		
//		if (n.length%2 == 0) {
//		int med2 = med - 1;
//		double median = ((double)n[med] + n [med2]) /2;
//		System.out.println(median);
//		}else {
//		System.out.println(n[med]);
//		}
		

	}
}
