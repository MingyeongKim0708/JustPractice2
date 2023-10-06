package 배열문제;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class 다양한타입배열 {

	public static void main(String[] args) {
		String[] location = new String[5];
		char[] color = new char[5];
		double[] actor = new double[5];

		// 좋아하는 여행지 5개 (location)
		for (int i = 0; i < location.length; i++) {
			location[i] = JOptionPane.showInputDialog("좋아하는 여행지를 입력하세요");
		}
		// location 배열 출력
		System.out.println(Arrays.toString(location));

		System.out.println("--------------------");

		// 좋아하는 색 첫글자 5개 (color)
		for (int i = 0; i < color.length; i++) {
			String c = JOptionPane.showInputDialog("좋아하는 색의 첫 글자를 입력하세요");
			color[i] = c.charAt(0);
		}

		// color 배열 출력
		System.out.println(Arrays.toString(color));

		System.out.println("--------------------");

		// 좋아하는 연예인 5명 키
		for (int i = 0; i < actor.length; i++) {
			String h = JOptionPane.showInputDialog("좋아하는 연예인 5명의 키를 입력하세요");
			actor[i] = Double.parseDouble(h);
		}

		// location 배열 출력
		System.out.println(Arrays.toString(actor));

	}

}
