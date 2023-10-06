package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터프로그램 {

	public static int count; //전역변수 0으로 초기화
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(400, 300);

		//FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout());
		
		//버튼
		JButton plus = new JButton("1더하기");
		JButton reset = new JButton("0으로 초기화");
		JButton minus = new JButton("1빼기");
		
		//라벨
		JLabel number = new JLabel("0");
		
		
		//폰트
		Font font = new Font("맑은 고딕", Font.BOLD, 15);
		plus.setFont(font);
		reset.setFont(font);
		minus.setFont(font);
		
		number.setFont(new Font("궁서", Font.BOLD, 150));
		
		//색상
		plus.setBackground(Color.yellow);
		plus.setBorderPainted(false);
		reset.setBackground(Color.red);
		reset.setForeground(Color.white);		
		reset.setBorderPainted(false);
		minus.setBackground(Color.yellow);
		minus.setBorderPainted(false);
		number.setForeground(Color.blue);
		
		
		
		//add
		f.add(plus);
		f.add(reset);
		f.add(minus);
		f.add(number);
		
		//메서드
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + ""); //String.valueOf();
			}
		});
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + ""); //String.valueOf();
			}
		});
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + ""); //String.valueOf();
			}
		});
		//종료. 나타나기
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		
		
		
//		위의 코드를 풀어보면...
//		public class JFrame() {
//			public String title; //title은 바꿔도 되는 값
//			public static final int EXIT_ON_CLOSE = 3; // EXIT_ON_CLOSE는 바꿀 수 없는 값. final. 상수
//			public JFrame(String title) {
//				this.title = title;
//			}
//		}

	}
}
