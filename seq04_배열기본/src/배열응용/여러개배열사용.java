
package 배열응용;

public class 여러개배열사용 {

	public static void main(String[] args) {
		String[] 식구 = {"아버지", "어머니", "형", "나", "동생"};
		int[] 나이 = {100, 99, 88, 77, 55};
		double[] 키 = {199.9, 188.8, 177.7, 166.6, 155.5};
		
		System.out.println("=======================");
		System.out.println("======== 우리가족 ========");
		System.out.println("=======================");
		for (int i = 0; i < 키.length; i++) {
			System.out.println(식구[i] + "\t" + 나이[i] + "\t" + 키[i]); //\t 탭만큼 여유공간 생김			
		}
		System.out.println("=======================");
		
		//우리가족 내년 나이 + 1
		for (int i = 0; i < 키.length; i++) {
			나이[i]++;
				
		}
		//동생만 키가 5cm가 큼
		//1. 동생이 어디 있는지 알고있으면 바로 5 더애서 저장 (**index 4위치)
		키[4] = 키[4] + 5;
		

		for (int i = 0; i < 키.length; i++) {
			System.out.println(식구[i] + "\t" + 나이[i] + "\t" + 키[i]); //\t 탭만큼 여유공간 생김			
		}
	}

}
