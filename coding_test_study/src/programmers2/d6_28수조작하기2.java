package programmers2;

public class d6_28수조작하기2 {

	public static void main(String[] args) {
		String answer = "";
		StringBuffer sbf = new StringBuffer();
	
		int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
		
		for (int i = 1; i < numLog.length; i++) {
			int a = numLog[i] - numLog[i-1];
			if (a == 1) {
				sbf.append("w");
			}else if (a == -1) {
				sbf.append("s");
			}else if (a == 10) {
				sbf.append("d");
			}else if (a == -10) {
				sbf.append("a");
			}
		}
		answer = sbf.toString();
		System.out.println(answer);

	}

}
