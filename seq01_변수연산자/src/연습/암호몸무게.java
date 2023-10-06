package 연습;

import javax.swing.JOptionPane;

public class 암호몸무게 {

	public static void main(String[] args) {
		char pw = 'p';
		String in1 = JOptionPane.showInputDialog("암호 한 글자 입력 하세요");
		char pw2 = in1.charAt(0); //캐릭터로 변환. q
		
		//int result1 = 0; // PASS인지 재입력인지에 대한 것
		
		if(pw == pw2) {
			//result1 = 0;
			JOptionPane.showMessageDialog(null, "PASS!");
			System.out.println("PASS!");
		}else {
			//result1 = 1;
			JOptionPane.showMessageDialog(null, "재입력!");
			System.out.println("재입력!");
			
		}
		
		double change = 2.2; //어제와 오늘의 몸무게 변화
		
		//int result2 = 0; //몸무게 변화값이 true/false인지
		
		if(change > 2) {
			//result2 = 0;
			JOptionPane.showMessageDialog(null, "다이어트 성공!");
			System.out.println("다이어트 성공!");
		}else {
			//result2 = 1;
		}
		
		if (pw == pw2 && change > 2) {
			JOptionPane.showMessageDialog(null, "오늘은 성공!!");
		}else {
			JOptionPane.showMessageDialog(null, "내일 다시 도전");
		}
		
//		if(result1 == 0 && result2 == 0) {
//			System.out.println("오늘은 성공!");
//		}else {
//			System.out.println("내일 다시 도전!");
//		}
		
	}

}
