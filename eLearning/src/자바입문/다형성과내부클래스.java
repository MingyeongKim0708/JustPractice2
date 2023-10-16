package 자바입문;

public class 다형성과내부클래스 {

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();
		
		print(s);
		print(m);
		print(c);

	}

	public static void print(Employee e) {
		if (e instanceof Salesman) {
			System.out.println("Salesman 입니다.");
		} else if (e instanceof Manager) {
			System.out.println("Manager 입니다.");
		} else if (e instanceof Consultant) {
			System.out.println("Consultant 입니다.");
		}
	}

}
