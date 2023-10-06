package 생성자복습;


import java.util.ArrayList;
import java.util.HashSet;

public class 내카페5 {

	public static void main(String[] args) {
		int[] num = { 1, 3, 4, 5, 7, 8, 2, 2, 4, 5, 6, 9 };

		Cal5 cal5 = new Cal5();
		
		//배열 중 짝수만 골라서 출력
		ArrayList list = cal5.getEven(num);
		System.out.println(list);
		
		//배열 중 홀수만 골라서 출력
		ArrayList list2 = cal5.getOdd(num);
		System.out.println(list2);
		
		//배열 중 중복된 값은 제외하고 출력
		HashSet list3 = cal5.getUnique(num);
		System.out.println(list3);

	}
}
