package 제어문.반복문;

import java.util.Random;

public class 랜덤Test {

	public static void main(String[] args) {
		Random r = new Random(10); //10에 해당하는 값으로 나옴. 다른 컴퓨터에서도 똑같이 나옴
		//int target = r.nextInt(0); //랜덤한 정수
		//int target = r.nextInt(100); //0부터 99까지 랜덤한 정수
		int target = r.nextInt(99) + 1; //1부터 99까지 랜덤한 정수
		System.out.println(target);

	}

}
