package 변수;

public class 기본형심화_타입변환 {

	public static void main(String[] args) {
		byte age = 127; //1byte
		int age2 = age; //4byte
		//큰방 <-- 작은방 : 자동으로 알아서 들어감
		
		int age3 = 127; //4byte
//		byte age4 = age3; //1byte.오류발생
		byte age4 = (byte)age3;
		//작은방 <-- (작은방의타입)큰방 : 강제로 잘라서 넣어주어야함.
		//강제 타입 변환 (강제형변환)

	}

}
