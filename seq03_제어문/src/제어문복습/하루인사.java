package 제어문복습;

import java.util.Date;

public class 하루인사 {

	public static void main(String[] args) {
		// Date ==> 필요할 때 ram에 가져다놓고 cpu가 가져다사용하는 부품
		Date date = new Date();
		int h = date.getHours();
		System.out.println(h);
		
		String result = "";
		if(h<11) {
			result = "굿모닝";
		}else if(h<15) {
			result = "굿애프터눈";
		}else if(h<19) {
			result = "굿이브닝";
		}else {
			result = "굿나잇";
		}
		System.out.println(result);
	}

}
