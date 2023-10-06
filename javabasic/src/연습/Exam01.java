package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// 가로 110, 세로 220 입력
		// 사각형 면적 출력
		String width = JOptionPane.showInputDialog("가로 길이를 입력하세요. (숫자만)");
		String height = JOptionPane.showInputDialog("세로 길이를 입력하세요. (숫자만)");

		int width2 = Integer.parseInt(width); //width에 바로 저장하지 않는 이유는 width의 타입이 String이기 때문
		int height2 = Integer.parseInt(height);

		int result = width2 * height2;

		JOptionPane.showMessageDialog(null, "사각형의 면적은 : " + result);
		System.out.println("사각형의 면적은 : " + result);

	}

}
