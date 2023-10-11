package 클론코딩;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import 상속응용.스레드그래픽.배열스레드;
import 상속응용.스레드그래픽.시각스레드;
import 상속응용.스레드그래픽.카운터스레드;

public class 스레드 extends JFrame {
	//전역변수 선언
	JLabel count, image, day;
	
	//생성자
	public 스레드() {
		setTitle("PC방 카운터");
		setSize(600, 300);
		
		//라벨 만들기 new
		count = new JLabel("카운터 위치");
		image = new JLabel();
		day = new JLabel("시간 위치");
		
		//폰트
		Font font = new Font("맑은 고딕", Font.BOLD, 30);
		count.setFont(font);
		image.setFont(font);
		day.setFont(font);
		
		//add
		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);
		
		//스레드를 가져옴 (아래에 있는 inner클래스로부터)
		카운터스레드 counter = new 카운터스레드();
		시각스레드 timer = new 시각스레드();
		배열스레드 array = new 배열스레드();

		//가져온 스레드 실행
		counter.start();
		timer.start();
		array.start();
		
		//종료 및 표시
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	//메인
	public static void main(String[] args) {
		스레드 th = new 스레드();
	}
	
	//inner클래스
	public class 카운터스레드 extends Thread {

		@Override
		public void run() {
			// 동시에 처리하고 싶은 내용!
			for (int i = 500; i >= 0; i--) {
				// System.out.println("카운터 >> " + i);
				count.setText("카운터! >> " + i);
				try {
					Thread.sleep(1000); // 1초
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace(); // 에러출력 (에러에 대한건 e 변수에 들어있음)
					// 이메일 보내는 처리, 문자로 보내는 처리 등등을 넣을 수 있다
				}
				// 외부의 자언 cpu를 연결할 때는 아주 위험한 순간이기 때문에 위험한 순간이 발생했을 때 어떻게 처리할지 명시해줘야함.
				// -> try 위험한 순간이 발생하면catch. Interrupted(중단하기)
			}
		}
	}// 카운터클래스

	public class 시각스레드 extends Thread {

		@Override
		public void run() {
			// 동시에 처리하고 싶은 내용!
			for (int i = 500; i >= 0; i--) {
				Date date = new Date();
				// System.out.println("시각 >> " + date);
				day.setText(date + "");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}// 시각스레드
	}

	public class 배열스레드 extends Thread {

		@Override
		public void run() {
			// 동시에 처리하고 싶은 내용!
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 0; i < list.length; i++) {
//				if (i == 4) {
//					i = -1;
//				} //계속 반복하는건데 마지막에 카운터랑 같이 끝내고 싶을 땐 어떻게 하지 생각해보기
				// System.out.println("이미지 >> " + list[i]);
				// image.setText("이미지 >> " + list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000); // 5초. 밀리세컨즈
				} catch (InterruptedException e) {
					e.printStackTrace(); // 에러출력 (에러에 대한건 e 변수에 들어있음)
				}
			}
		}
	}

}
