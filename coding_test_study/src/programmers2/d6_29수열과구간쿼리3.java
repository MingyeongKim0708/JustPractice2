package programmers2;

import java.util.Arrays;

public class d6_29수열과구간쿼리3 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 3},{1, 2},{1, 4}};
		int a = 0;
		System.out.println(queries.length);
		System.out.println(queries[0].length);
		
		for (int i = 0; i < queries.length; i++) {
			queries[i][0] = a;
			queries[i][0] = queries[i][1];
			queries[i][1] = a;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
