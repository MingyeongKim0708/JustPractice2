package 배열기본;

public class 배열최소값찾기 {

	public static void main(String[] args) {
		int[] n = { 90, 80, 20, 60, 70 };
		int min = n[0];
		for (int x : n) {
			if (x < min) {
				min = x;
			}
		}
		System.out.println(min);
		Print.arr(n);
	}

}
