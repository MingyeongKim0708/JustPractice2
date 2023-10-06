package 상속;

public class 볼펜Main {

	public static void main(String[] args) {
		볼펜 bp = new 볼펜();
		
		bp.company = "동아";
		bp.price = 500;
		bp.thick = "굵음";
		
		System.out.println(bp.company);
		System.out.println(bp.price);
		System.out.println(bp.thick);
		bp.글을쓰다();
		bp.사다();

	}

}
