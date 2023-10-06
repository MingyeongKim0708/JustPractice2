package 배열문제;

import java.util.Arrays;

public class 더블배열 {

	public static void main(String[] args) {
		int[] s = new int[200];
		s[0] = 1000;
		s[1] = 2000;
		s[2] = 3000;
		s[s.length-1] = 5000;
		
		for (int x : s) {
			System.out.print (x + " ");
		}
		System.out.println();
		
		double[] s2 = new double[300]; // 자동 초기화. double s2[] 도 가능
		s2[0] = 10.1;
		s2[1] = 20.2;
		s2[2] = 30.3;
		s2[s2.length-1] = 50.5;
		
		System.out.println(Arrays.toString(s2));
		
		for (double y : s2) {
			System.out.print (y + " ");
		}

	}

}
