package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class 셋연습3 {

	public static void main(String[] args) {
		HashSet lotto = new HashSet();

		Random r = new Random();
		while (true) {
			lotto.add(r.nextInt(45) + 1);
			if(lotto.size() == 6) {
				break;
			}
		}
		
		System.out.println(lotto);
	}

}
