package programmers;

import java.util.ArrayList;

public class d5_22등차수열의특정한항만더하기 {

	public static void main(String[] args) {
		Solution22 s = new Solution22();
		int a = 3;
		int b = 4;
		boolean[] inc = {true, false, false, true, true};
		System.out.println(s.solution(a, b, inc));

	}

}

class Solution22 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < included.length; i++) {
			list.add(a+d*i);
			if (included[i] == true) {
				answer += list.get(i);
			}
		}
        System.out.println(list);
        System.out.println(answer);
        
        return answer;
    }
}