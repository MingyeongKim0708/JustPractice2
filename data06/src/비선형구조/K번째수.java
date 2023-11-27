package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class K번째수 {

	public static void main(String[] args) {
		int[] arr = { 22, 33, 66, 11, 10, 15 };
		int[] arr2 = { 22, 22, 44, 11, 11, 33, 55, 66, 20, 10, 30, 55 };

		int k = 2;
		int k2 = 3;
		
		//선형구조로 풀기 - 배열
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length -1]); //최대값
		System.out.println(arr[arr.length - k]); // k번째 큰수
		
		System.out.println("=======================");
		
		//선형구조로 풀기 - list
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		System.out.println(list);
		int answer = list.get(list.size() - k);
		System.out.println(answer);
		
		System.out.println("=======================");
		
		//비선형구조로 풀기 (단, 중복된 값들은 한번으로 처리 후 찾으세요(중복제거))
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for (int i = 0; i < arr2.length; i++) {
			tree.add(arr2[i]);
		}
		System.out.println(tree);
		System.out.println(tree.size());
		System.out.println("최대" + tree.first()); //최소값
		System.out.println("최소" + tree.last()); //최대값
		System.out.println("20보다 작은 수" + tree.lower(20)); // 20보다 작은 수
		Object[] arr3 = tree.toArray();
		System.out.println("K2번째 큰 수" + arr3[tree.size() - k2]);
	}

}
