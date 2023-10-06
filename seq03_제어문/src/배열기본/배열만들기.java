package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		// 1.배열 만들 때 기준 - 값을 모르고 있는 경우
		int[] s = new int[5];
		// 2.배열 만들 때 기준 - 값을 이미 알고 있는 경우
		int[] s2 = { 1, 2, 3, 4, 5 };

		// s가 가리키고 있는 첫번째 값에 100 넣기
		s[0] = 100;
		// s가 가리키고 있는 세번째 값에 200 넣기
		s[2] = 200;
		// s가 가리키고 있는 마지막 값에 300 넣기
		s[s.length - 1] = 300;

		// s와 s2의 개수(사이즈 size, 길이 length)를 프린트
		System.out.println("s의 length >> " + s.length);
		System.out.println("s2의 length >> " + s2.length);
		// s가 가리키는 첫번째 값 프린트
		System.out.println("s의 첫번째 값 >> " + s[0]);
		// s가 가리키는 세번째 값 프린트
		System.out.println("s의 세번째 값 >> " + s[2]);
		// s가 가리키는 마지막 값 프린트
		System.out.println("s의 마지막 값 >> " + s[s.length - 1]);

		// s가 가리키고 있는 첫번째 값과 세번째 값을 더해서 프린트
		System.out.println(s[0] + s[2]);
		// s가 가리키고 있는 첫번째 값과 세번째 값이 동일한지 프린트
		System.out.println(s[0] == s[2]);
		
		//C언어에서 사용하던 for문 문법. s[0]부터 s[마지막]까지 출력하기
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		//for each 방식
		for (int x : s) {
			//출력용으로만 사용 가능. 입력 불가능
			System.out.println(x);
		}
	}

}
