package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식점주문화면 {
	static int total = 0;
	// 클래스 전체에서 접근 가능
	// main 안에서 사용하기 위해서는 main이 static이 붙어있음.
	// main 밖에 있는 변수도 static이 붙어있어야함.

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 700);

		f.getContentPane().setBackground(Color.green);

		// FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		// Button
		JButton b1 = new JButton();
		b1.setText("짬뽕");

		JButton b2 = new JButton();
		b2.setText("우동");

		JButton b3 = new JButton();
		b3.setText("짜장");

		// Label
		JLabel l1 = new JLabel();
		l1.setText("개수 : " + total + " 개");

		JLabel l2 = new JLabel();
		ImageIcon icon = new ImageIcon("main.png");
		l2.setIcon(icon);

		JLabel l3 = new JLabel();
		l3.setText("결제 금액 : " + total * 5000 + "원");

		// add
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		f.add(l3);

		// Font
		Font font = new Font("맑은 고딕", 1, 50);
		b1.setFont(font);
		b1.setBackground(Color.yellow);
		b2.setFont(font);
		b3.setFont(font);
		l1.setFont(font);
		l3.setFont(font);

		// Background 배경색
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.yellow);

		// Foreground 글자색
		b1.setForeground(Color.blue);
		b2.setForeground(Color.blue);
		b3.setForeground(Color.blue);
		l1.setForeground(Color.red);
		l3.setForeground(Color.red);

		// ActionListener
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리하고 싶은 내용을 쭉 써주면 된다.
				System.out.println("짬뽕 선택");
				total++;
				l1.setText("개수 : " + total + " 개");
				l3.setText("결제 금액 : " + total * 5000 + "원");
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리하고 싶은 내용을 쭉 써주면 된다.
				System.out.println("우동 선택");
				total++;
				l1.setText("개수 : " + total + " 개");
				l3.setText("결제 금액 : " + total * 5000 + "원");
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리하고 싶은 내용을 쭉 써주면 된다.
				System.out.println("짜장 선택");
				total++;
				l1.setText("개수 : " + total + " 개");
				l3.setText("결제 금액 : " + total * 5000 + "원");
			}
		});

		// x를 눌렀을 때 자동으로 종료하고 싶음
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
