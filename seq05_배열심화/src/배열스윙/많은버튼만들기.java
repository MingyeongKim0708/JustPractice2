package 배열스윙;

import java.awt.Color;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 많은버튼만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800, 500);
		f.setTitle("나의 버튼들");
		f.setLayout(null); // 레이아웃을 정하지 않음

		// 여러개의 버튼이 들어갈 배열 필요
		JButton[] buttons = new JButton[200];
		// {null, null, null, ...} 모든 기본형 제외한 참조형 배열 초기값은 null

		// 버튼 만들기
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText("버튼" + i);
		}
		
		System.out.println(Arrays.toString(buttons));

		// 버튼 위치, 색상, 배치
		for (int i = 0; i < buttons.length; i++) {
			Random r = new Random();
			int x = r.nextInt(800);
			int y = r.nextInt(500);
			// 버튼(왼쪽 위 모서리 기준) 가로위치, 세로위치, 가로크기, 세로크기
			buttons[i].setBounds(x, y, 100, 100);
			buttons[i].setBackground(Color.yellow);
			buttons[i].setForeground(Color.red);
			f.add(buttons[i]);
		}

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
