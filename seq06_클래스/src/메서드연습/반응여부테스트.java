package 메서드연습;

import javax.swing.JOptionPane;

public class 반응여부테스트 {

	public static void main(String[] args) {
		int x = Integer.parseInt("100"); //100
		System.out.println(x); //void

		String data = JOptionPane.showInputDialog("이름을 입력"); // void X
		//입력한 데이터를 가져다 여기에 주기 때문
		
		JOptionPane.showMessageDialog(null, data);
	}

}
