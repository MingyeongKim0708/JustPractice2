package 리펙토링;

public class 직원 {
	public String name; // 아무데서나 접근 가능 [동일클래스, 동일패키지 다른클래스, 다른 패키지 상속 클래스, 다른 패키지 다른 클래스]
	String address; //default, 같은 패키지에서 접근 가능 [동일클래스, 동일패키지 다른클래스, 다른 패키지 상속 클래스]
	protected int salary; // 상속 받은 곳에서 접근 가능 (다른 패키지도 가능) [동일클래스, 동일패키지 다른클래스]
	private int rrn; //주민번호, 이 클래스 내에서만 접근 가능 [동일클래스]
	
	public String toString() {
		return name + " " + address + " " + salary + " " + rrn;
	}
}
