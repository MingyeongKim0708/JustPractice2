package 자바입문;

public class 객체지향구현 {
	public static void main(String[] args) {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor("mark6", 180);
		System.out.println(suit1.getName() + ":" + suit1.getHeight()); // 출력 : mark0 : 200
		System.out.println(suit2.getName() + ":" + suit2.getHeight()); // 출력 : mark6 : 180
	}	

}
class Armor {
	private String name;
	private int height;

	Armor() {
		name = "mark0";
		height = 200;
	}

	Armor(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}