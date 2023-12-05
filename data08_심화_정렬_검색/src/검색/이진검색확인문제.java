package 검색;

import java.util.Arrays;

public class 이진검색확인문제 {
	public static void main(String[] args) {
		int[] num = { 1, 4, 5, 2, 7, 8, 9, 6 };
		int[] search = {1, 7, 6};
		
		//int[] search = {1, 7, 6}을 찾고 싶다. 오름차순후 위치를 찾아서 다음과 같이 프린트되도록 해주세요.
		//출력은==>  “- 인덱스 - 인덱스 - 인덱스”
		//StringBuilder 사용
		
		Arrays.sort(num); //퀵정렬
		StringBuilder sb = new StringBuilder();
		for (int find : search) {
			sb.append(" - " + Arrays.binarySearch(num, find));//이진검색
		}
		System.out.println(sb);		

	}
}
