package bean;

public class MainCar2 {

	public static void main(String[] args) {
		Car2 car1 = Car2.getInstance(); //200번지
		Car2 car2 = Car2.getInstance(); //200번지
		Car2 car3 = Car2.getInstance(); //200번지
		car1.color = "purple";
		//car2, car3 = ??? ==> 모두 purple로 변경됨
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
	}

}
