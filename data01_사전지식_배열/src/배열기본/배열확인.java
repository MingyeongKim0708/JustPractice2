package 배열기본;

import java.util.Arrays;

public class 배열확인 {

	public static void main(String[] args) {
		//배열은 많은 양의 데이터를 다루기 위한 자료구조
		
		//1) 배열을 만드는 방법
		//	배열을 만들 때 이미 값들을 알고 있는 경우
		//	선형으로 쭉 값들을 집어 넣음.
		int[] ages = {60, 50, 30, 20, 10};
		// 변수 7개
		System.out.println(ages);
		System.out.println(ages.length);
		System.out.println(ages[0]);
		
		//for : 값 입력/출력용으로 모두 사용 가능
		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		
		System.out.println("");
		
		//for-each : 값 출력용도로만 사용 가능
		for (int x : ages) {
			System.out.print(x + " ");
		}
		
		System.out.println("");
		
		//Arrays.toString (코딩테스트 추천)
		System.out.println(Arrays.toString(ages));
		
		//2) 배열을 만드는 방법
		//	배열을 만들 때 아직 값들을 모르고 있는 경우
		//	저장공간을 만들고 값들을 나중에 집어 넣음.
		double[] weight = new double[5]; //{0.0, 0.0, 0.0, 0.0, 0.0}
		weight[0] = 88.8;
		weight[1] = 88.7;
		weight[2] = 88.6;
		weight[3] = 88.5;
		weight[4] = 88.4;
		
		//배열에 있는 값을 확인하기! 방법 3가지
		for (double d : weight) {
			System.out.print(d + " ");
		}
		
		System.out.println("");
		System.out.println(Arrays.toString(weight));
	}

}
