package 메서드활용;

public class 내카페4 {

	public static void main(String[] args) {
		int countC = 5;
		int priceC = 2000;
		int countM = 2;
		int priceM = 3000;
		
		Cal4 c4 = new Cal4();
		
		int coffee = c4.sum(countC, priceC);
		int milktea = c4.sum(countM, priceM);
		
		int price = c4.total(coffee, milktea);
		int person = c4.total(countC, countM);
		int total = c4.div(price, person);
		
		System.out.println(coffee);
		System.out.println(milktea);
		System.out.println(total);

	}

}
