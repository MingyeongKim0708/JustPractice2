package 배열기본;

public class 아파트집찾기 {

	public static void main(String[] args) {
		int[] s = { 10, 15, 20, 10 };
		System.out.println("배열이 들어있는 주소 >> " + s);
		// s 안에 들어있는 주소가 가리키는 첫번째 값 프린트
		System.out.println("배열이 가리키는 첫번째 값>> " + s[0]);
		System.out.println("전체 s가 가리키는 방의 수>> " + s.length);

		int[] s2 = { 1, 2, 3 };
		// 전체 변수의 개수, 메모리 크기
		// 참조형 변수는 4바이트 크기라고 가정. 총 20바이트를 사용하고 있음. 배열의 끝에는 항상 길이가 저장되어있음. 값 3개+주소+선언한것?
		
	}

}
