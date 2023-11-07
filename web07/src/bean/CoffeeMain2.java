package bean;

public class CoffeeMain2 {

	public static void main(String[] args) {
		Coffee2 c1 = Coffee2.getInstance();
		Coffee2 c2 = Coffee2.getInstance();
		c1.name = "주스";
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.name);
		System.out.println(c2.name);
	}

}
