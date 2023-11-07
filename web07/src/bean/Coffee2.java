package bean;

public class Coffee2 {
	int price;
	String name;
	public static Coffee2 coffee2;
	
	public static Coffee2 getInstance() {
		if(coffee2 == null) {
			coffee2 = new Coffee2(1000, "라떼");
		}
		return coffee2;
	}
	
	//Source - Generate Constructor using fields == > 생성자 private 설정
	private Coffee2(int price, String name) {
		this.price = price;
		this.name = name;
	}
}
