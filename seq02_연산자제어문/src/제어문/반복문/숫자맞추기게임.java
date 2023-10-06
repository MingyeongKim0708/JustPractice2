package 제어문.반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		Random r = new Random(10); //Random(10)이라고 쓴 값은 모두 동일하게 나온다
		int target = r.nextInt(99) + 1; //1~99사이
		//r.nextInt(99) ==> 0~98
		int total =0; //몇번만에 맞췄는지
		
		while (true) {
			String data = JOptionPane.showInputDialog("숫자를 입력하세요");
			//데이터 타입이 동일해야 비교 가능
			int data2 = Integer.parseInt(data);
			//CPU가 RAM에 들어있는 값을 가져다가 1을 증가시키고 다시 RAM에 넣는다
			//total = total +1
			total++;
			if (target == data2) {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				System.out.println("전체 시도 횟수 : " + total);
				System.exit(0);
			} else {
				System.out.println("정답이 아닙니다.");
				//정답보다 높은지 낮은지 힌트 주기 (지금은 간단해서 여기에 if를 넣어도 되지만 실제로는 CPU가 계산을 계속 해야해서 나중엔 다른 방식씀
				if(data2 > target) {
					System.out.println("입력한 수보다 작습니다.");
				}else {
					System.out.println("입력한 수보다 큽니다.");
				}//else
			} //else
		}//while
	}//main

}//class
