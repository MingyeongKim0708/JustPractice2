package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 한번입력받아스트링배열로 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String data = sc.next(); //흐림,맑음,흐림
		String[] data2 = data.split(",");
		System.out.println(Arrays.toString(data2));
		
		//흐림이 몇개인지, 맑음이 몇개인지 세어보세요.
		int cloud = 0, sky = 0; //흐림, 맑음
		for (String x : data2) {
			if(x.equals("흐림")) {
				cloud++;
			}else {
				sky++;
			}
		}//for
		
		System.out.println(cloud + " " + sky);
	}

}
