package programmers2;

import java.util.Arrays;

public class d6_27수조작하기1 {

	public static void main(String[] args) {
		int n = 0;
		String control = "wsdawsdassw";
		
		char[] c = control.toCharArray();
		//System.out.println(Arrays.toString(c));
		
		for (int j = 0; j < c.length; j++) {
			if (c[j] == 'w') {
				n = n +1;
			}else if(c[j] == 's') {
				n = n -1;
			}else if (c[j] == 'd') {
				n = n +10;
			}else if (c[j] == 'a') {
				n = n -10;
			}
		}
		System.out.println(n);
		
	}

}
