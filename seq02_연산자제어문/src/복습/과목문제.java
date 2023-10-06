package 복습;

public class 과목문제 {

	public static void main(String[] args) {
		int kor = 75;
		int math = 50;
		int sum = kor + math;
//		double avg = sum / 2.0; //그냥 2라고 적으면 int/int라서 결과가 int로 나옴. 2.0으로 실수로 적기
		double avg = (double)sum / 2; //강제형변환 방식
		System.out.println(avg);
	}

}
