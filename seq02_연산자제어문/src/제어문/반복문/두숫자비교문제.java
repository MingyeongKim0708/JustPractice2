package 제어문.반복문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 두숫자비교문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//콘솔 창에서 키보드로 입력을 받음 
		
		while (true) {
			System.out.print("숫자1 입력 >> ");
			int numA =  sc.nextInt();
			System.out.print("숫자2 입력 >> ");
			int numB =  sc.nextInt();
			
//			String numA = JOptionPane.showInputDialog("숫자를 입력하세요");
//			int numA2 = Integer.parseInt(numA);
//			String numB = JOptionPane.showInputDialog("숫자를 입력하세요");
//			int numB2 = Integer.parseInt(numB);

			String result = "";
			if (numA > numB) {
				result = "앞 숫자가 더 큽니다.";
			} else if (numA < numB) {
				result = "뒷 숫자가 더 큽니다.";
			} else {
				result = "숫자가 같습니다.";
			}
			
			System.out.println(result);
			System.out.print("더 하시겠습니까? 종료 (x) >>");
			String answer = sc.next();
//			String answer2 = answer.toLowerCase(answer); //answer에 입력된 걸 무조건 소문자로 바꿈
			//char answer2 = answer.charAt('x'); //char형으로 바꾸는 법
//			String answer = JOptionPane.showInputDialog("더 하시겠습니까? 종료(x), 계속(o)");
			if (answer.equals("x") || answer.equals("X")) { //소문자로 바꾸지 않는다면 대문자인 케이스도 적어줘야함
				System.exit(0);
			} //if
		}//while
		
	}//main

}
