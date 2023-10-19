package 상품정보;

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
import 회원정보.MemberVO;

public class 상품정보UI {

	public static void main(String[] args) {
		// 필요한 부품들을 RAM에 가져다놓아야한다

		// JFrame
		JFrame f = new JFrame();
		f.setSize(300, 700);
		f.setTitle("나의 상품정보UI");
		f.getContentPane().setBackground(Color.magenta);

		// FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		// JLabel
		JLabel l1 = new JLabel("<<상품정보>>");
		JLabel l2 = new JLabel("상품 번호 : ");
		JLabel l3 = new JLabel("상품 이름 : ");
		JLabel l4 = new JLabel("상품 내용 : ");
		JLabel l5 = new JLabel("상품 가격 : ");
		JLabel l6 = new JLabel("상품 회사 : ");
		JLabel l7 = new JLabel("상품 이미지 : ");

		// JTextField
		JTextField t1 = new JTextField(10); // 10 글자수
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		JTextField t5 = new JTextField(10);
		JTextField t6 = new JTextField(10);
		t1.setBackground(Color.pink);
		t2.setBackground(Color.pink);
		t3.setBackground(Color.pink);
		t4.setBackground(Color.pink);
		t5.setBackground(Color.pink);
		t6.setBackground(Color.pink);
		t1.setForeground(Color.red);
		t2.setForeground(Color.red);
		t3.setForeground(Color.red);
		t4.setForeground(Color.red);
		t5.setForeground(Color.red);
		t6.setForeground(Color.red);

		// JButton
		JButton b1 = new JButton("상품 정보 추가");
		JButton b2 = new JButton("상품 정보 삭제");
		JButton b3 = new JButton("상품 정보 수정");
		JButton b4 = new JButton("상품 정보 검색");
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.yellow);
		b4.setBackground(Color.yellow);
		b1.setForeground(Color.blue);
		b2.setForeground(Color.blue);
		b3.setForeground(Color.blue);
		b4.setForeground(Color.blue);

		// Font
		Font font = new Font("맑은 고딕", Font.BOLD, 20);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 30);

		l1.setFont(font2);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		l6.setFont(font);
		l7.setFont(font);

		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		t5.setFont(font);
		t6.setFont(font);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		// add
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(l6);
		f.add(t5);
		f.add(l7);
		f.add(t6);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b3);
		f.add(b4);

		// action
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 클릭했을 때 처리 내용을 넣어줌

				// 1. 입력한 값을 가지고 온다
				String id = t1.getText();
				String name = t2.getText();
				String content = t3.getText();
				String price = t4.getText();
				String company = t5.getText();
				String img = t6.getText();

				// 2. DB 처리하는 부품을 사용 (DAO)
				ProductDAO dao = new ProductDAO();

				// 가방필요 --> 데이터를 넣고 --> 가방을 전달 (VO)
				ProductVO bag = new ProductVO();

				bag.setId(id);
				bag.setName(name);
				bag.setContent(content);
				bag.setPrice(Integer.parseInt(price));
				bag.setCompany(company);
				bag.setImg(img);

				// 3. 입력한 정보를 주면서 Product insert 요청
				dao.insert(bag);

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 입력한 값을 가지고 온다
				String id = JOptionPane.showInputDialog("삭제할 id를 입력하세요");

				// 2. DB 처리하는 부품을 사용
				ProductDAO dao = new ProductDAO();

				// 보내는 쪽 1. 가방 만들기
				ProductVO bag = new ProductVO();

				// 보내는 쪽 2. 가방에 넣기
				bag.setId(id);

				// 3. DB 처리하는 부품에 입력한 값을 주면서 DB해달라고 요청
				dao.delete(bag);

			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 입력한 값을 가지고 온다
				String id = JOptionPane.showInputDialog("이름를 수정할 id를 입력하세요");
				String content = JOptionPane.showInputDialog("수정할 이름을 입력하세요");

				// 2. DB 처리하는 부품을 사용
				ProductDAO dao = new ProductDAO();

				// 보내는 쪽 1. 가방 만들기
				ProductVO bag = new ProductVO();

				// 보내는 쪽 2. 가방에 넣기
				bag.setId(id);
				bag.setContent(content);

				// 3. DB 처리하는 부품에 입력한 값을 주면서 DB해달라고 요청
				dao.update(bag);

			}
		});


		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 입력한 값을 가지고 온다
				String id = JOptionPane.showInputDialog("검색할 id를 입력하세요");

				// 2. DB 처리하는 부품을 사용
				ProductDAO dao = new ProductDAO();

				// one(id) 호출, id를 주면서 row 하나 검색 요청
				ProductVO bag = dao.one(id);
				JOptionPane.showMessageDialog(f, bag);
				

			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
