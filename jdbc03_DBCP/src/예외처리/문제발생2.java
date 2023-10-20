package 예외처리;

public class 문제발생2 {

	// exception을 케이스마다 다르게 처리하는 방법
	// 문제 발생부분 드래그 - 우클릭 - Try/multi catch block - 안되면 손으로...
	public static void main(String[] args) {
		System.out.println("1. 나는 실행됨");

		try {
			//System.out.println("2. 0으로 나누기" + 10/0); // 0으로 나누기 --> 수학적 에러 --> 런타임 에러

			int[] num = {1,2};
			num[2] = 22;
			//여러개의 catch를 써주는 경우에는 위는 작은것에서부터 아래는 큰것으로 써주어야한다 (if else 같은 느낌)
		} catch (ArithmeticException e1) { // import java.lang.*; 수학적 에러
			e1.printStackTrace();
			System.out.println("수학 연산 에러 발생함");
		} catch (ArrayIndexOutOfBoundsException e2) { // 배열 에러
			e2.printStackTrace();
			System.out.println("배열 인덱스 에러 발생함");
		} catch (Exception e) { //수학연산에러, 배열에러도 아닌 경우
			System.out.println("기타 에러 발생함");
		}
		
		System.out.println("3. 여기는 프린트 될까요?");
	}

}
