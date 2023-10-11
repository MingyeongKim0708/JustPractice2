package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class 셋연습2 {

	public static void main(String[] args) {
		// 로또 문제
		ArrayList lotto = new ArrayList();// 넣을 공간
		// 고정길이, 같은 타입

		// 랜덤하게 만들어서 배열에 6개의 숫자를 넣자.
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			int num = r.nextInt(45) + 1;
			if (!lotto.contains(num)) {
				lotto.add(r.nextInt(45) + 1);
			}
		}

		System.out.println(lotto);
	}

}
