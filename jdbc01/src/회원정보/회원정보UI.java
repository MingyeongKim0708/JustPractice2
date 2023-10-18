package 회원정보;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 회원정보UI {

	public static void main(String[] args) {
		// 필요한 부품들을 RAM에 가져다놓아야한다

		// JFrame
		JFrame f = new JFrame();
		f.setSize(300, 500);
		f.setTitle("나의 회원정보UI");
		f.getContentPane().setBackground(Color.GREEN);
		
		// FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// JLabel 5
		JLabel l1 = new JLabel("이미지");
		JLabel l2 = new JLabel("회원 ID : ");
		JLabel l3 = new JLabel("회원 PW : ");
		JLabel l4 = new JLabel("회원 이름 : ");
		JLabel l5 = new JLabel("회원 TEL: ");
		
		// JTextField 4
		JTextField t1 = new JTextField(10); //10 글자수
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		t1.setBackground(Color.pink);
		t2.setBackground(Color.pink);
		t3.setBackground(Color.pink);
		t4.setBackground(Color.pink);
		t1.setForeground(Color.red);
		t2.setForeground(Color.red);
		t3.setForeground(Color.red);
		t4.setForeground(Color.red);

		// JButton 2
		JButton b1 = new JButton("회원가입 요청");
		JButton b2 = new JButton("회원탈퇴 요청");
		JButton b3 = new JButton("회원수정 요청");
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.yellow);
		b1.setForeground(Color.blue);
		b2.setForeground(Color.blue);
		b3.setForeground(Color.blue);
		
		// Font
		Font font = new Font("맑은 고딕", Font.BOLD, 20);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
				
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		
		//add
		f.add(l1); // 이미지
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		//action
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 클릭했을 때 처리 내용을 넣어줌
				
				// 1. 입력한 값을 가지고 온다
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				// 2. DB 처리하는 부품을 사용
				MemberDAO dao = new MemberDAO();
				
				// 3. DB 처리하는 부품에 입력한 값을 주면서 DB해달라고 요청
				dao.insert(id, pw, name, tel);
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//탈퇴할 id를 입력 받으세요
				String id = JOptionPane.showInputDialog("탈퇴할 id를 입력하세요");
				MemberDAO dao = new MemberDAO();
				dao.delete(id);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 회원정보 수정
				String id = JOptionPane.showInputDialog("tel을 수정할 id를 입력하세요");
				String tel = JOptionPane.showInputDialog("수정할 tel을 입력하세요");
				MemberDAO dao = new MemberDAO();
				dao.update(id, tel);
			}
		});
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
