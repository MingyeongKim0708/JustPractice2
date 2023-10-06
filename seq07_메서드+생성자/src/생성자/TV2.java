package 생성자;

public class TV2 {

	//멤버변수와 멤버메서드는 동일함.
	public int ch;
	public int vol;
	public boolean onOff;
	public TV2(int ch, int vol, boolean onOff) {
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
		
		//this.ch ==> 현재 클래스 밑에 있는 ch 변수
		//this ==> 현재클래스 지정하고 싶을 때
	}
	
	public TV2(int ch, int vol) {
		this.ch = ch;
		this.vol = vol;
	}
	
	
	//생성자를 하나도 만들어주지 않는 경우에는 눈에 보이지 않지만 자동으로 클래스와 동일한 생성자 메서드를 만들어준다.
	
	//생성자는 무조건 void라서 쓰지 않음
	//클래스이름과 동일해야 객체생성시 자동호출
	//생성자메서드(=생성자, constructor)
	//Source- Generate Constructor using field - 생성자 자동생성
	
	
	//아래는 내가 직접 만든거
//	public TV2(int c, boolean o, int v) {
//		ch = c;
//		vol = v;
//		onOff = o;
//	}
//	
//	public TV2(int c, boolean o) {
//		ch = c;
//		onOff = o;
//	}
//
//	@Override
//	public String toString() {
//		return "TV2 [채널=" + ch + ", 볼륨=" + vol + ", 온오프=" + onOff + "]";
//	}
}
