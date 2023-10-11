package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class 셋연습1 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		//고정 길이, 같은 타입 --> 배열
		
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
		}
		
		System.out.println(lotto);
	}

}
