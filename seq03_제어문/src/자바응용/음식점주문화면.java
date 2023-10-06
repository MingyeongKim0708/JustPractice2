package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식점주문화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700, 500);
		
		f.getContentPane().setBackground(Color.green); // jfame위에 있는 판떼기의 색을 칠해야함. 윗줄 두개와 같음

		//FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		//Button
		JButton b1 = new JButton();
		b1.setText("짬뽕");

		JButton b2 = new JButton();
		b2.setText("우동");

		JButton b3 = new JButton();
		b3.setText("짜장");
		
		//Label
		JLabel l1 = new JLabel();
		l1.setText("개수 : 0개");
		
		JLabel l2 = new JLabel();
		ImageIcon icon = new ImageIcon("main.png");
		l2.setIcon(icon);
		
		JLabel l3 =  new JLabel();
		l3.setText("결제금액");

		//add
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		
		//Font
		Font font = new Font("맑은 고딕", 1, 50);
		b1.setFont(font);
		b1.setBackground(Color.yellow);
		b2.setFont(font);
		b3.setFont(font);
		l1.setFont(font);
		l3.setFont(font);
		
		
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.yellow);
		l1.setBackground(Color.yellow);
		l2.setBackground(Color.yellow);
		l3.setBackground(Color.yellow);
		
		//x를 눌렀을 때 자동으로 종료하고 싶음
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}

}
