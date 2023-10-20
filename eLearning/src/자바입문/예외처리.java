package 자바입문;

public class 예외처리 {

	public static void main(String[] args) {
		try {
			String s = new String("java");
			int len1 = s.length();
			s = null;
			int len2 = s.length();
		} catch (NullPointerException e) {
			System.out.println("오류 발생");
		}
		System.out.println("OK");
	}

}
