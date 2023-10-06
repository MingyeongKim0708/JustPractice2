package 배열문제;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class 다양한타입배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] location = { "부산", "홍천", "대전", "천안", "광주" };
		char[] color = { 'r', 'g', 'b', 'w', 'b' };
		double[] actor = { 155.5, 166.6, 177.7, 188.8, 199.9 };
		
		System.out.println(Arrays.toString(location));
		System.out.println(Arrays.toString(color));
		System.out.println(Arrays.toString(actor));
		
		for (int i = 0; i < actor.length; i++) {
			System.out.println(actor[i]);
		}
		
		double sum = 0.0;
		for (double d : actor) {
			System.out.println(d);
			sum = sum + d;
		}
		
		System.out.println("평균은 >> " +  sum/actor.length);
	}

}
