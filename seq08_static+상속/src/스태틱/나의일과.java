package 스태틱;

public class 나의일과 {

	public static int count = 0;
	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.print(Day.count + " "); // static 변수는 대문자로 시작. 클래스명.변수으로 접근.
		System.out.println(day1);
		
		Day day2 = new Day("여행", 15, "강원도");
		System.out.print(Day.count + " ");
		System.out.println(day2);

		Day day3 = new Day("운동", 11, "피트니스");
		System.out.print(Day.count + " ");
		System.out.println(day3);
		
		System.out.println("총 " + Day.sum + "시간");
	}

}
