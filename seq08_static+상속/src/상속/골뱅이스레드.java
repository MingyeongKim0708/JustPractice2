package 상속;

public class 골뱅이스레드 extends Thread {

	// 동시에 처리하고 싶은 코드를 넣어주세요
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("@");
		}
	}
}
