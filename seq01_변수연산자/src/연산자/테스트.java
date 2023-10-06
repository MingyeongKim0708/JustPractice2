package 연산자;

public class 테스트 {

	public static void main(String[] args) {
		String s = "a100"; // a ==> 0(주소), 1 ==> 1(주소), ... 
		System.out.println(s.charAt(0)); // 0번째 주소에 있는 것을 갖고 오기
		System.out.println(s.charAt(1));

		char c1 = s.charAt(0); // 'a'
		char c2 = s.charAt(1); // '1'
		
		if (c1 == 'a') {
			System.out.println("기획O");
		} else {
			System.out.println("기획");
		}
	}

}
