package 제어문.반복문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {		
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int total = 0; //전체 몇번 반복 했는지
		int win = 0; //내가 몇번 이겼는지. 이기는 if마다 ++
		
		while (true) {
			//횟수 카운트
			total++;
			
			//컴퓨터가 냄
			int com = r.nextInt(3); // 0  가위, 1 바위, 2 보
			
			//내가 냄
			System.out.println("----------------------------------------");
			System.out.print("!고르세요! 0  가위, 1 바위, 2 보 >> ");
			int me = sc.nextInt();
			
			//나의 값 변환
			String me2 = "";
			if (me == 0) {
				me2 = "가위";
			} else if (me == 1) {
				me2 = "바위";
			} else {
				me2 = "보";
			}
			//낸 것 확인
			//System.out.println("내가 낸 것 : " + me2);
			
			//컴의 값 변환
			String com2 = "";
			if (com == 0) {
				com2 = "가위";
			} else if (com == 1) {
				com2 = "바위";
			} else {
				com2 = "보";
			}
			
			//낸 것 확인
			System.out.println("나 ▶ " + me2 + " VS " + com2 + " ◀ 컴퓨터");
			
			//내가 가위를 냈을 때
			if (me == 0) {
				if (com == 0) {
					System.out.println("비김");
				} else if (com == 1) {
					System.out.println("컴퓨터 승");
				} else {
					System.out.println("나 승");
					win++;
				}
			}else if (me == 1) { //내가 바위를 냈을 때
				if (com == 0) {
					System.out.println("나 승");
					win++;
				} else if (com == 1) {
					System.out.println("비김");
				} else {
					System.out.println("컴퓨터 승");
				}
			}else { //내가 보를 냈을 때
				if (com == 0) {
					System.out.println("컴퓨터 승");
				} else if (com == 1) {
					System.out.println("나 승");
					win++;
				} else {
					System.out.println("비김");
				}
			}//if문 종료
			
			System.out.print("종료하시겠습니까? (x) >> ");
			
			String exit = sc.next();
			String exit2 = exit.toLowerCase();
			if(exit2.equals("x")) {
				System.out.println("========================================");
				System.out.println("전체 게임 횟수 >> " + total + "|| 나의 승리 횟수 >> " + win);
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		}//while끝

	}

}
