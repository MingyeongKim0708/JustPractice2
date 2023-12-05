package 배열메서드입출력;

public class 머쓱이보다키큰사람수 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		int[] numbers = {180, 120, 140};
		int height = 190;
		int result = s.solution(numbers, height);
		System.out.println(result);

	}

}
class Solution5 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
			if (array[i] > height) {
				answer++;
			}
		}
        return answer;
    }
}