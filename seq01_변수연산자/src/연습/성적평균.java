package 연습;

import javax.swing.JOptionPane;

public class 성적평균 {

	public static void main(String[] args) {
		int pt = 66;
		int math = 77;
		int eng = 88;
		int kor = 99;
		
		int sum = pt + math + eng + kor;
		
		double avg = sum / 4.0;
		System.out.println(avg);
		
		System.out.println("---------------------------");
		
		final double PI = 3.14; //절대 변하면 안되는 값. 상수. final. 가독성을 위해 대문자로 적는 것 추천
		double r = 2.2;
		
		double extent = PI * r * r;
		System.out.printf("원의 면적 : %.2f" ,extent);
		
		String extent2 = String.format("원의 면적 : %.2f", extent);
		JOptionPane.showMessageDialog(null, extent2);
	}

}
