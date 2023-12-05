package 문자열관련;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		
		Solution3 s = new Solution3();
		int[] num_list = {1, 1, 3, 3, 0, 1, 1};
		int[] result = s.solution(num_list);
		System.out.println(Arrays.toString(result));
	}
}

class Solution3 {
	public int[] solution(int[] num_list) {
		//정답 = 가변. ArrayList를 쓰고 다 모으면 배열로 옮기기
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(num_list[0]);
		//앞의 위치의 값과 다르면 list.add(값);
		int before = num_list[0];
		
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] != before) {
				list.add(num_list[i]);
				before = num_list[i];
			}
		}
		System.out.println(list);
		
//		HashSet<Integer> set = new HashSet<Integer>();
//		for (int i = 0; i < num_list.length; i++) {
//			set.add(num_list[i]);
//		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
	
	
	
	//스택으로 푸는 방법
//	 public int[] solution(int []arr) { //1,1,3,3,0,1,1
//	        Stack<Integer> stack = new Stack<>();
//	        stack.push(arr[0]); //[1]
//	        for(int i = 1; i < arr.length; i++){
//	            if(arr[i] != stack.peek()){
//	                stack.push(arr[i]); //[1,3,0,1]
//	            }
//	        }
//	        int[] answer = new int[stack.size()];
//	        //stack get(i) --> array[i] answer
//	        for(int i = 0; i< answer.length; i++){
//	            answer[i] = stack.get(i);
//	        }
//	        return answer;
//	    }
}