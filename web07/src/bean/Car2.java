package bean;

public class Car2 {
	//멤버변수 + 멤버메서드
	String color; //4byte
	int speed; //4byte
	int price; //4byte
	public static Car2 car2;
	
	//외부에서 Car2가 하나 만들어놓은 객체를 주세요
	//Car2.getInstance();
	public static Car2 getInstance() {
		if(car2 == null) {
			car2 = new Car2("검정", 120, 1200);
		}
		return car2;
	}
	
	private Car2(String color, int speed, int price) {
		this.color = color;
		this.speed = speed;
		this.price = price;
	}
	
}
