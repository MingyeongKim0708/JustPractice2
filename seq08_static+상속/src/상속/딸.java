package 상속;

public class 딸 {
	String name;
	String gender;
	static int dadW = 10000;
	static int count;
	
	public 딸(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		count++;
		dadW = dadW - 1000;
	}

	public void tv보다() {
		System.out.println("tv를 본다");
	}

	@Override
	public String toString() {
		return count + " 딸의 이름 : " + name + ", 딸의 성별 : " + gender;
	}
}
