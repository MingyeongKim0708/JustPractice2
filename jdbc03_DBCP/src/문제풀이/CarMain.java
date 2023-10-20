package 문제풀이;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		Truck truck = new Truck();
		
		car.color = "blue";
		car.price = 10000;
		car.count = 5;
		// car.developer = "홍길동";
		
		String s = car.toString();
		System.out.println(s);

		truck.move();
	}

}
