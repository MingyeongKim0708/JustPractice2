package 제어문.반복문;

import java.util.Date;

public class 반복문기본1 {

	public static void main(String[] args) {
		// 반복문을할때는 cpu가 처음값을 변수에 저장해두고 1씩 증가시키면서 조건을 체크해서 반복
		// 처음값, 증감값, 조건식이 필요
		
		//for문
		for (int i = 0; i < 10; i++) {
		//   처음값              조건식          증감값
			System.out.println("@");
		} //처음값 - 조건식 - 출력 - 증감값 순으로 실행

		//while문
		int start = 0;
		while (start < 10) {
			System.out.println("%");
			start++;
		}
		
		//while 무한반복
		while (true) {
			System.out.println("내가 계속 돌아간다.");
			Date date = new Date();
			if(date.getMinutes() == 26) { //26분이 되면 그만둔다
				System.out.println("EXIT");
				break; //break 안에 걸기. 나를 포함하고 있는 괄호를 break한다는 뜻
			}
		}
	}

}
