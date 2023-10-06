package 복습;

public class 커피문제 {

	public static void main(String[] args) {
		int count = 5;
		int price = 5000;
		int result = count * price;
		
		String answer = "";
		if (result > 20000) {
			answer = "할인해드릴게요.";
		}else {
			answer  = "총 커피값을 내세요.";
		}
		
		System.out.println(answer);
	}

}
