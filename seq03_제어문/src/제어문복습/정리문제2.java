package 제어문복습;

import java.util.Scanner;

public class 정리문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 득표수
		int iu = 0;
		int js = 0;
		int bt = 0;

		while (true) {
			System.out.print("입력 1)아이유 2)유재석 3)방탄 4)종료 >> ");
			int choice = sc.nextInt();
			
			// 득표수 카운트
			if (choice == 4) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("아이유 득표수 >> " + iu + "표");
				System.out.println("유재석 득표수 >> " + js + "표");
				System.out.println("방탄 득표수 >> " + bt + "표");
				System.exit(0);
			}
			else if (choice == 1) {
				iu++;
			} else if (choice == 2) {
				js++;
			} else if (choice == 3) {
				bt++;
			}else {
				System.out.println("잘못 입력함!");
			}// 득표수 카운트 종료
		} // while 종료

	}// main 종료

}//class 종료
