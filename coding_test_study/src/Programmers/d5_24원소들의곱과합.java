package Programmers;

public class d5_24원소들의곱과합 {

	public static void main(String[] args) {
		Solution24 sol = new Solution24();
		// int[] num_list = { 3, 4, 5, 2, 1 };
		int[] num_list = { 5, 7, 8, 3 };
		sol.solution(num_list);

	}

}

class Solution24 {
	public int solution(int[] num_list) {
		int answer = 0;
		int mul = 1;
		int add = 0;
		int sq = 0;

		for (int i = 0; i < num_list.length; i++) {
			mul = mul * num_list[i];
			add += num_list[i];
		}
		sq = add * add;

		if (mul < sq) {
			answer = 1;
		}

		System.out.println(mul);
		System.out.println(add);
		System.out.println(sq);
		System.out.println(answer);
		return answer;
	}
}
