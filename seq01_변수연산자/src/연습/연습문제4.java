package 연습;

import javax.swing.JOptionPane;

public class 연습문제4 {

	public static void main(String[] args) {
		String temp = JOptionPane.showInputDialog("현재 온도 입력");
		
		double temp2 = Double.parseDouble(temp);
		String answer = "";
		if (temp2 >= 25) {
			answer = "너무 더워요.";
		}else {
			answer = "괜찮아요.";
		}
		JOptionPane.showMessageDialog(null, answer);
	}

}
