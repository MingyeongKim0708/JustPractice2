package 배열응용고급;

import java.util.Arrays;

public class 깊은복사성적문제 {

	public static void main(String[] args) {
		String[] 과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] term1 = { 44, 66, 22, 99, 100 };
		int[] term2 = term1.clone();

		term2[0] = 22;
		term2[2] = 88;

		System.out.println(Arrays.toString(term1));
		System.out.println(Arrays.toString(term2));

		int same = 0, up = 0;
		System.out.print("성적이 오른 과목명 : ");
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				same++;
			}else if (term1[i] < term2[i]) {
				up++;
				System.out.print(과목명[i] + " ");
			}
		}//for
		System.out.println();
		System.out.println("성적 동일 과목 수 : " + same);
		System.out.println("성적 오른 과목 수 : " + up);
	}

}
