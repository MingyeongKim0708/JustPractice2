package 제어문.순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 화면만들기2 {

	public static void main(String[] args) {
		// 1. 필요한 부품을 ram에 다 준비합시다.
//		JFrame f
//		JButton b
//		JTextField t1
//		JTextField t2
//		JTextField t3
//		FlowLayout flow
		
		//한꺼번에 다 import하는 단축키 - 컨트롤 + 쉬프트 + O
		JFrame f = new JFrame();
		f.setSize(250, 300);
		
		JButton b = new JButton();
		//버튼에 텍스트 넣기
		b.setText("-------------------- 나를 눌러요 --------------------");
		
		//20글자를 넣을 수 있는 칸
		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		JTextField t3 = new JTextField(20);
		FlowLayout flow = new FlowLayout();
		
		//글자써주는 부품 JLabel
		JLabel l1 = new JLabel();
		l1.setText("이름");
		JLabel l2 = new JLabel();
		l2.setText("나이");
		JLabel l3 = new JLabel();
		l3.setText("취미");
		
		f.setLayout(flow);
		f.add(b);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		
		//맨 끝에 넣어야 함. 위에서 작업한 것들 다 보여지게 함.
		f.setVisible(true);

	}

}
