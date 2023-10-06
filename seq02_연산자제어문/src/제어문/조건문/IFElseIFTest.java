package 제어문.조건문;

public class IFElseIFTest {

	public static void main(String[] args) {
		String name = "자바";
		
		//String은 기본형 데이터가 아니기 때문에
		//name = "변수값"이 아니라 변수.equals("변수값")으로 "변수값"과 같은지 확인해야함
		if (name.equals("자바")) {
			System.out.println("1101호로 go!");
		}else if(name.equals("파이썬")) {
			System.out.println("1102호로 go!");
		}else if(name.equals("리눅스")) {
			System.out.println("1103호로 go!");
		}else {
			System.out.println("카운터에 가서 문의하세요");
		}
		
		//데이터타입: long X, 정수만 가능 ,실수 X
		//			char, String 사용 가능 
		switch (name) {
		case "자바":
			System.out.println("1101호로 go!");
			// break를 포함하고 있는 {}를 찾으세요
			break; // 벗어남
		case "파이썬":
			System.out.println("1102호로 go!");
			break;
		case "리눅스":
			System.out.println("1103호로 go!");
			break;
		default:
			System.out.println("카운터에 가서 문의하세요");
			break;
		}

	}

}
