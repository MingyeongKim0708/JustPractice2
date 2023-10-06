package 연습;

import javax.swing.JOptionPane;

public class 연습문제1 {

	public static void main(String[] args) {
		String w = JOptionPane.showInputDialog("몸무게");
		String h = JOptionPane.showInputDialog("신장");
		
		//형변환
		double w2 = Double.parseDouble(w);
		double h2 = Double.parseDouble(h);
		
		double bmi = w2 / (h2 * h2);
		
		System.out.println(bmi);
		
	}

}
