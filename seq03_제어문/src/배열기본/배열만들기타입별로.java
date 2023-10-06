package 배열기본;

public class 배열만들기타입별로 {

	public static void main(String[] args) {
		// int, char, String, JButton, double, boolean

		int[] age = { 200, 100, 50, 10 }; // 4개 고정
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}
		System.out.println();
		for (int x : age) {
			System.out.print(x + " ");
		}
		System.out.println();

		double[] weight = { 99.9, 88.8, 77.7, 66.6 };
		for (int i = 0; i < weight.length; i++) {
			System.out.print(weight[i] + " ");
		}
		System.out.println();
		for (double d : weight) {
			System.out.print(d + " ");
		}
		System.out.println();
		
		//가족 이름
		String[] name = {"김아빠", "김엄마", "김형", "김나"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		for (String s : name) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//성별
		char[] gender = {'M', 'F', 'M', 'M'};
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		for (char c : gender) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		//아침여부
		boolean[] food = {true, true, false, true};
		for (int i = 0; i < food.length; i++) {
			System.out.print(food[i] + " ");
		}
		System.out.println();
		for (boolean b : food) {
			System.out.print(b + " ");
		}
		//food 배열의 size=length = 4
	}

}
