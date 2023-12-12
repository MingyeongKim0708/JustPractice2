package programmers;

public class d5_25이어붙인수 {

	public static void main(String[] args) {
		//Solution25 sol = new Solution25();
		int[] num_list = { 3, 4, 5, 2, 1 };
		// int[] num_list = { 5, 7, 8, 3 };

		String a = "";
		String b = "";
		
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				a = a + num_list[i];
			} else {
				b += num_list[i];
			}
		}

		int a2 = Integer.parseInt(a);
		int b2 = Integer.parseInt(b);
		
		System.out.println(a2+b2);
		
	}

}

class Solution25 {
	public int solution(int[] num_list) {
		int answer = 0;
		return answer;
	}
}