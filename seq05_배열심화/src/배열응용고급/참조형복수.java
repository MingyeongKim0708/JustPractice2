package 배열응용고급;

import java.util.Arrays;

public class 참조형복수 {

	public static void main(String[] args) {
		int[] n1 = {100,200,300};
		int[] n2 = n1; //얕은 복사
		
		//무더기 영역에서 깊은 복사를 하기
		int[] n3 = n1.clone();
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		n2[0] = 999;
		n3[0] = 888;
		
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
	}

}
