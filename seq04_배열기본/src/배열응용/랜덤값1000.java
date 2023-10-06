package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤값1000 {

	public static void main(String[] args) {
		Random r = new Random(18);
		int[] arr = new int[1000];

		// 값을 넣기 위한 반복문
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1000);
		}

		// 배열 전체 목록 프린트
		System.out.println(Arrays.toString(arr));

		// 300 이상의 개수
		int count3 = 0, count4 = 0, count5 = 0, count6 = 0;
		//배열으로 저장할때
		int[] count = new int[4];

		// 값을 꺼내기 위한 반복문
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 600) {
				count6++;
				count5++;
				count4++;
				count3++;	
				count[3]++;
				count[2]++;
				count[1]++;
				count[0]++;
			} else if (arr[i] >= 500) {
				count5++;
				count4++;
				count3++;
				count[2]++;
				count[1]++;
				count[0]++;
			} else if (arr[i] >= 400) {
				count4++;
				count3++;
				count[1]++;
				count[0]++;
			} else if (arr[i] >= 300) {
				count3++;
				count[0]++;
			} // if
			
			if (arr[i] == 1) {
				System.out.println("최소값이 0인 위치 >> " + i);
			}
		} // for

		System.out.println("300 이상의 개수 : " + count3);
		System.out.println("400 이상의 개수 : " + count4);
		System.out.println("500 이상의 개수 : " + count5);
		System.out.println("600 이상의 개수 : " + count6);

		System.out.println(Arrays.toString(count));
		System.out.println("==================================");

		// 오름차순으로 정렬 후 배열 전체 목록 프린트
		Arrays.sort(arr); // 파괴함수 (RAM에 있는 값 변경)
		System.out.println(Arrays.toString(arr));

		// 최대값, 최소값 프린트
		System.out.println("최대값 : " + arr[arr.length - 1]);
		System.out.println("최소값 : " + arr[0]);

	}

}
