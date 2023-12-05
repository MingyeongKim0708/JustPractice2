package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열결과리스트에넣기 {
	public static void main(String[] args) {
		int[] n = { 100, 200, 300, 400, 500 };

		System.out.print("1. 전체 목록 프린트 : ");
		Print.arr(n);

		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 300) {
				count++;
				list.add(i);
			}
		}

		System.out.println("2. 300이상 값 갯수 : " + count);
		System.out.println("3. 300이상 들어있는 위치 저장(ArrayList) : " + list);

		//4. ArrayList안 인덱스의 배열 값 - 100
		for (Integer index : list) {
			n[index] -= 100;
		}
//		for (int i = 0; i < list.size(); i++) {
//			int index = list.get(i);
//			n[index] = n[index] - 100;
//		}

		System.out.print("5. 수정된 배열 전체 프린트 : ");
		Print.arr(n);
	}
}
