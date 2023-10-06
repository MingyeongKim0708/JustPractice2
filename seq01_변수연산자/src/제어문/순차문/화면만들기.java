package 제어문.순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 화면만들기 {

	public static void main(String[] args) {
		//JFrame f
		JFrame f = new JFrame(); //import가 안된 경우 JFrame 마우스위로 올라가서 f2 누르면 import하라고 뜸
		f.setSize(300, 300); //사이즈 200x200
		
		//배치해주는 부품을 따로 설정하지 않으면 다 가운데로 들어가버려!
		//물흐르듯이 순서대로 배치해주는 부품을 써야함.
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		//JButton b
		JButton b = new JButton();
		b.setText("나의 정보 확인");
		f.add(b); //f에 b를 넣어라
		
		//JTextField t1
		//JTextField t2
		//JTextField t3		
		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		JTextField t3 = new JTextField(20);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		f.setVisible(true); //창을 화면에 나타냄. 순서대로 실행되므로 나타내게 하는 것이 가장 마지막에 적음
	}

}
