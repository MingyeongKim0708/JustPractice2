package 연산자;

public class 연산시주의점 {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 4;
		
		int sum = n1 + n2;
		//자바의 연산지 정수와 정수 연산은 무조건 정수
		int avg = sum / 2;
		System.out.println(avg);
		
		System.out.println("--------------------");
		
		//자바의 연산시 하나라도 실수면 무조건 실수
		//double avg2 = sum / 2.0;
		
		//이미 sum이 int로 선언됐기 때문에 double로 강제타입변환 --> 강제형변환 
		double avg2 = (double)sum / 2;
		System.out.println(avg2);
	}

}
