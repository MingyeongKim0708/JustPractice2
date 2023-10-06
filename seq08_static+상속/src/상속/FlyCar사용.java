package 상속;

public class FlyCar사용 {

	public static void main(String[] args) {
		FlyCar fly = new FlyCar();
		fly.color = "red";
		fly.fly = true;
		fly.fly();
		System.out.println("색상 : "+ fly.color + " 날수 있어? : " + fly.fly);
	}

}
