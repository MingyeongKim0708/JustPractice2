package 연산자;

import javax.swing.JOptionPane;

public class 입출력 {

	public static void main(String[] args) {
		//망치.망치질하다();
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		//큰창 위에 띄울때 null 위치에 큰창의 이름을 적는데 큰창이 없으니 null이라고 적음
		JOptionPane.showMessageDialog(null, "당신의 이름은 " + name + "이군요.");
		System.out.println("당신의 이름은 " + name + "이군요.");
		
		//당신의 취미는 무엇인가요?
		String hobby = JOptionPane.showInputDialog("당신의 취미는 무엇인가요?");
		//홍길동님의 취미는 테니스입니다.
		JOptionPane.showMessageDialog(null, name + "님의 취미는 " + hobby + "입니다.");
		System.out.println(name + "님의 취미는 " + hobby + "입니다.");
		
		//당신은 몇시에 일어나나요? 9시
		String time = JOptionPane.showInputDialog("당신은 몇시에 일어나나요? (숫자만 입력)");
		//테니스는 9시에 시작할 수 있군요!
		JOptionPane.showMessageDialog(null, hobby + "는 " + time + "시에 시작할 수 있군요!");
		System.out.println(hobby + "는 " + time + "시에 시작할 수 있군요!");
		
		//일어나고 나서 1시간 있다가 테니스를 시작한다면
		//문자열을 숫자로 변경해주는 작업을 굉장히 자주 사용해야함
		//지금 상황에서 time + 1 = "9" + 1 = 91 이 됨
		int time2 = Integer.parseInt(time);
		int result = time2 + 1; // 9+1=10
		System.out.println(hobby + "는 " + result + "시에 합시다.");
	}

}
