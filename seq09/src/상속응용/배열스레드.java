package 상속응용;

public class 배열스레드 extends Thread {

	@Override
	public void run() {
		// 동시에 처리하고 싶은 내용!
		String[] list = {"1.png","2.png","3.png","4.png","5.png"};
		for (int i = 0; i < list.length; i++) {
//			if (i == 4) {
//				i = -1;
//			} //계속 반복하는건데 마지막에 카운터랑 같이 끝내고 싶을 땐 어떻게 하지 생각해보기
			System.out.println("이미지 >> " + list[i]);
			try {
				Thread.sleep(5000); //5초. 밀리세컨즈
			} catch (InterruptedException e) {
				e.printStackTrace(); //에러출력 (에러에 대한건 e 변수에 들어있음)
			}
		}
	}
}