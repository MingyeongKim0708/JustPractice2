package 제어문.조건문;

public class SwitchTest1 {

	public static void main(String[] args) {
		String name = "자바";
		
		switch (name) {
		case "자바":
			System.out.println("1101호로 go!");
			//break를 포함하고 있는 {}를 찾으세요
			break; //벗어남
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
