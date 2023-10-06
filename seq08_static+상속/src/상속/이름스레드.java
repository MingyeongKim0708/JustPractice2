package 상속;

public class 이름스레드 extends Thread {
	//동시에 돌아가는 부품이 됨.
	//run() -> 동시에 실행하고 싶은 프로세스를 넣어주면 됨
	//start() -> 동시에 시작하렴!
	
	@Override // @ - Annotation(표시)
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("홍길동");
		}
	}
}
