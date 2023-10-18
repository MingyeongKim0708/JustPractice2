package 게시판정보;

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

import 회원정보.MemberDAO;

public class 게시판UI {

	public static void main(String[] args) {
		// 필요한 부품들을 RAM에 가져다놓아야한다

		// JFrame
		JFrame f = new JFrame();
		f.setSize(300, 500);
		f.setTitle("나의 게시판UI");
		f.getContentPane().setBackground(Color.gray);
		
		// FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// JLabel
		JLabel l1 = new JLabel("나의 게시판");
		JLabel l2 = new JLabel("게시판 제목 : ");
		JLabel l3 = new JLabel("게시판 내용 : ");
		JLabel l4 = new JLabel("게시판 작성자 : ");
		
		// JTextField 4
		JTextField t1 = new JTextField(10); //10 글자수
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		t1.setBackground(Color.pink);
		t2.setBackground(Color.pink);
		t3.setBackground(Color.pink);
		t1.setForeground(Color.red);
		t2.setForeground(Color.red);
		t3.setForeground(Color.red);

		// JButton 2
		JButton b1 = new JButton("게시물 작성 요청");
		JButton b2 = new JButton("게시물 삭제 요청");
		JButton b3 = new JButton("게시물 수정 요청");
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.yellow);
		b1.setForeground(Color.blue);
		b2.setForeground(Color.blue);
		b3.setForeground(Color.blue);
		
		// Font
		Font font = new Font("맑은 고딕", Font.BOLD, 20);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 30);
		
		l1.setFont(font2);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
				
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		
		//add
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		//action
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 클릭했을 때 처리 내용을 넣어줌
				
				// 1. 입력한 값을 가지고 온다
				String title = t1.getText();
				String content = t2.getText();
				String writer = t3.getText();
				
				// 2. DB 처리하는 부품을 사용
				BbsDAO dao = new BbsDAO();
				
				// 3. DB 처리하는 부품에 입력한 값을 주면서 DB해달라고 요청
				dao.insert(title, content, writer);
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 입력한 값을 가지고 온다
				String no = JOptionPane.showInputDialog("no를 입력하세요");
				
				// 2. DB 처리하는 부품을 사용
				BbsDAO dao = new BbsDAO();
				
				// 3. DB 처리하는 부품에 입력한 값을 주면서 DB해달라고 요청
				dao.delete(Integer.parseInt(no));
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String no = JOptionPane.showInputDialog("수정할 no");
				String title = t1.getText();
				String content = t2.getText();
				
				BbsDAO dao = new BbsDAO();
				
				dao.update(title, content, Integer.parseInt(no));
			}
		});
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
