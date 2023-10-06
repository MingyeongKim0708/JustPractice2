package 연습;

import javax.swing.JOptionPane;

public class 문제풀이1_순차문 {

	public static void main(String[] args) {
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?"); //월요일
		String doing = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?"); //놀기

		String result = "오늘 " + day + "에 수업 후 나는 " + doing + "할 예정";
		System.out.println(result);
		
	}

}
