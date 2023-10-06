package 상속;

public class 스레드프로그래밍2 {

	public static void main(String[] args) {
		증가스레드 add = new 증가스레드();
		감소스레드 minus = new 감소스레드();
		별스레드 t1 = new 별스레드();
		이름스레드 name = new 이름스레드();
		add.start();
		minus.start();
		t1.start();
		name.start();
	}

}
