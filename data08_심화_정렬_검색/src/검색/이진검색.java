package 검색;

import java.util.Arrays;

public class 이진검색 {
	public static void main(String[] args) {
		int[] num = { 1, 4, 5, 2, 7, 8, 9, 6 };
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.binarySearch(num, 5)); // 3
		System.out.println(Arrays.binarySearch(num, 8)); // 6
		System.out.println(Arrays.binarySearch(num, 10)); // -값
		System.out.println(Arrays.binarySearch(num, 1, 5, 1)); //num[1]~num[4]
		//Arrays.binarySearch(a, fromIndex, toIndex, key)

	}
}
