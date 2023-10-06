package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// 적정 몸무게 계산
		
		//입력받는 데이터의 타입은 무조건 String(문자열)
		//입력받기 위한 부품이 필요???
		//망치? 벽돌?
		//망치 - 망치.두들기다(), 망치.날카롭게자르다()
		//		부품이름.함수이름() = 부품이름.기능이름() 선택
		
		
		String height = JOptionPane.showInputDialog("키를 입력하세요. (숫자만)");
		double height2 = Double.parseDouble(height);
		double weight = (height2 - 100) * 0.9;
		
		System.out.printf("소수점 2자리까지는 %.2f", weight);
		JOptionPane.showMessageDialog(null,"키가 " + height2 + "cm일 때 적정몸무게는 : " + weight + "kg입니다.");
		
		
		//소수점 표기
		double pie = 3.1494949498;
		
		System.out.println(Math.round(pie)); // 3
		System.out.println(Math.round(pie*100)/100.0); //3.15
		System.out.println(Math.ceil(pie*100)/100.0); //3.15
		System.out.println(Math.floor(pie*100)/100.0); //3.14
		System.out.println(String.format("%.2f", pie)); //3.15
	}

}
