package 형변환개념;

public class 기본형형변환 {

	public static void main(String[] args) {
		// 정수형 1,2,4,8
		// byte,short,int,long
		byte x = 127; //0110
		int y = x; //0000000000000110
		// 형변환(int(큰) <-- byte(작))
		// 자동으로 타입이 변경되어 들어감. ==> 자동 형변환
		byte z = (byte)y; //0110
		// 형변환(byte(작) <-- int(큰))
		// 강제로 cpu가 가지고 와서 잘라서 램에 집어넣는다. ==> 강제 형변환
		int a = 1000;
		byte b = (byte)a;
		
		System.out.println(b);
	}

}
