
package 부품사용하기;

import 부품만들기.강아지;
import 부품만들기.전화기;
import 부품만들기.텔레비전;

public class 내방만들기 {

	public static void main(String[] args) {
		// 전화기를 사용하고 싶어요
		전화기 phone = new 전화기();
		phone.카톡하다();
		phone.인터넷하다();
		
		강아지 dog = new 강아지();
		dog.짖다();
		
		텔레비전 tv = new 텔레비전();
		tv.on();

	}

}
