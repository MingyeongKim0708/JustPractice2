package programmers;

public class d5_23주사위게임2 {

	public static void main(String[] args) {
		Solution23 sol = new Solution23();
		int a = 4;
		int b = 4;
		int c = 4;
		
		sol.solution(a, b, c);
	}

}

class Solution23 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if (a == b) {
			if (b == c) {
				answer = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
			}else {
				answer = (a + b + c) * (a*a + b*b + c*c);
			}
		}else if (a != b) {
			if (a == c) {
				answer = (a + b + c) * (a*a + b*b + c*c);
			}else if(b == c) {
				answer = (a + b + c) * (a*a + b*b + c*c);
			}else {
				answer = a + b + c;
			}
		}
        System.out.println(answer);
        return answer;
    }
}
