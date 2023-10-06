package 제어문.조건문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Switch연습 {

	public static void main(String[] args) {
		//Scanner 방식
		Scanner sc = new Scanner(System.in);
		System.out.print("먹고 싶은 음식 입력 >> ");
		String name = sc.next();
		switch (name) {
		case "짜장면":
			System.out.println("중국집으로 가요");
			break;
		case "라면":
			System.out.println("분식집으로 가요");
			break;
		case "회":
			System.out.println("횟집으로 가요");
			break;
		default:
			System.out.println("그냥 안먹어요");
			break;
		}
		
		
		//JOptionPane 방식
//		String food = JOptionPane.showInputDialog("당신이 먹고 싶은 점심 메뉴는?(짜장면,라면,회,기타)");
//		String result = "";
//		switch (food) {
//		case "짜장면":
//			result = "중국집으로 가요";
//			break;
//		case "라면":
//			result = "분식집으로 가요";
//			break;
//		case "회":
//			result = "횟집으로 가요";
//			break;
//		default:
//			result = "그냥 안 먹어요";
//			break;
//		}
//		JOptionPane.showMessageDialog(null, result);

	}

}
