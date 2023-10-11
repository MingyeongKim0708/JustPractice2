package 상속응용;

public class 카운터스레드 extends Thread {

	@Override
	public void run() {
		// 동시에 처리하고 싶은 내용!
		for (int i = 500; i >= 0; i--) {
			System.out.println("카운터 >> " + i);
			try {
				Thread.sleep(1000); //1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); //에러출력 (에러에 대한건 e 변수에 들어있음)
				//이메일 보내는 처리, 문자로 보내는 처리 등등을 넣을 수 있다
			}
			//외부의 자언 cpu를 연결할 때는 아주 위험한 순간이기 때문에 위험한 순간이 발생했을 때 어떻게 처리할지 명시해줘야함.
			// -> try 위험한 순간이 발생하면catch. Interrupted(중단하기)
		}
	}
}
