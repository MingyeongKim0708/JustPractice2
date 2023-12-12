package programmers;

public class d3_14더크게합치기 {

	public static void main(String[] args) {
		int a = 89;
		int b = 8;
		int answer = 0;
		
		String a1 = Integer.toString(a);
		String b1 = Integer.toString(b);
		
		String add1 = a1 + b1;
		String add2 = b1 + a1;
		
		int rs1 = Integer.parseInt(add1);
		int rs2 = Integer.parseInt(add2);
		
		
		
		if (rs1 < rs2) {
			answer = rs2;
		}else {
			answer = rs1;
		}
		
		System.out.println(answer);
	}
}
