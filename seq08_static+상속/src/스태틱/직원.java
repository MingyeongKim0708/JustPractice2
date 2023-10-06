package 스태틱;

public class 직원 {
	public String name;
	public int age;
	public String gender;
	public static int count; //직원수. 직원 뽑을 때마다 자동 count
	public static int sumAge; //직원나이합산
	
	
	public 직원(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		sumAge = sumAge + age;
	}
	
	//평균 나이 구하는 메서드. static 붙여서 아무때나 호출 가능하도록 함.
	public static int getAvg() {
		//static 메서드 안에서 instance 변수를 쓰면 에러가 남 (ex. age 등등)
		//static 안에서는 static 변수만 써야함
		//힙 영역의 변수는 객체 생성 후에 만들어진다. (instance 변수 - 힙 영역의 변수)
		return sumAge / count;
	}
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
