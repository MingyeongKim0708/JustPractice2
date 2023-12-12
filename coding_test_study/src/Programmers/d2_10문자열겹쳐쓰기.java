package programmers;

public class d2_10문자열겹쳐쓰기 {
	public String solution(String my_string, String overwrite_string, int s) {
        
		StringBuffer sbf = new StringBuffer();
		
		String answer = "";
        String answer2 = "";
        String answer3 = "";
        
        //글자수 길이
        int l = my_string.length();
        int l2 = overwrite_string.length();
        
        //글자수 길이 체크
        System.out.println(l);
        System.out.println(s);
        System.out.println(l2);
        
        answer2 = my_string.substring(0, s);
        System.out.println(answer2);
        
        if (l - s > l2) {
        	answer3 = my_string.substring(l2+s, l);
		}
        System.out.println(answer3);
        
        sbf.append(answer2);
        sbf.append(overwrite_string);
        sbf.append(answer3);
        answer = sbf.toString();
        
        return answer;
    }
	
	
}
