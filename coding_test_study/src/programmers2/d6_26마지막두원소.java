package programmers2;

import java.util.Arrays;

public class d6_26마지막두원소 {

	public static void main(String[] args) {
		int[] num_list = { 2, 1, 6 };

		int[] answer = {};
		int a = num_list[num_list.length - 1];
		int b = num_list[num_list.length - 2];

		answer = Arrays.copyOf(num_list, num_list.length + 1);

		if (a > b) {
			answer[num_list.length] = a - b;
		} else {
			answer[num_list.length] = a * 2;
		}
		System.out.println(Arrays.toString(answer));

	}

}
