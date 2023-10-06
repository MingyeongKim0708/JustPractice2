package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		//필요한 부품을 ram에 다 가져다 놓아야 한다.
		JFrame f = new JFrame(); //100
		// f.setBackground(Color.green); //테두리만 색이 변함 = 아무것도 안 변함
//		Container pane = f.getContentPane();
//		pane.setBackground(Color.green);
		f.getContentPane().setBackground(Color.green); //jfame위에 있는 판떼기의 색을 칠해야함. 윗줄 두개와 같음
		
		f.setSize(700, 500);
		
		//물흐르듯 순서대로 붙여줍니다.
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton plus = new JButton(); //200
		plus.setText("더하기");
		plus.setBackground(Color.yellow); //배경색
		plus.setForeground(Color.blue); //글자색
		JButton minus = new JButton(); //200
		minus.setText("빼  기");
		minus.setBackground(Color.yellow); //배경색
		minus.setForeground(Color.blue); //글자색
		
		//글자넣는 부품 JLabel	
		JLabel l1 = new JLabel();
		l1.setText("숫자1");
		l1.setForeground(Color.blue);
		//html의 input태그 역할
		JTextField t1 = new JTextField(10); //10글자
		t1.setBackground(Color.red);
		t1.setForeground(Color.white);
		
		JLabel l2 = new JLabel();
		l2.setText("숫자2");
		l2.setForeground(Color.pink);
		JTextField t2 = new JTextField(10); //10글자
		t2.setBackground(Color.red);
		t2.setForeground(Color.white);
		
		JLabel top = new JLabel(); //이미지 넣을 예정. 이미지 파일은 프로젝트 바로 아래에 있어야함
		ImageIcon icon = new ImageIcon("cal.jpg"); //imageicon은 크기 조절 불가능
		top.setIcon(icon);
		
		f.add(top);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		
		//font - 글자스타일 담당(글자체, 진하게 여부(1), 글자크기)
		Font font = new Font("나눔고딕", 1, 50);
		l1.setFont(font);
		t1.setFont(font);
		l2.setFont(font);
		t2.setFont(font);
		plus.setFont(font);		
		minus.setFont(font);
		
		
		//위에서 설정한 거 다 보여줘. 맨 끝 줄에 넣기.
		f.setVisible(true);
	}

}
