package bean;

public class MainCar {

	public static void main(String[] args) {
		Car car1 = new Car("red", 200, 2000); //16byte 무더기(힙영역) ==> new로 불러낼 때마다 힙영역이 늘어남.
		Car car2 = new Car("blue", 150, 1500); //16byte
		Car car3 = new Car("green", 100, 1000); //16byte
		//싱글톤을 쓴다면 힙영역이 늘지 않음
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}

}
