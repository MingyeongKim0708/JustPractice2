package programmers;

import java.util.Scanner;

public class d2_07문자열붙여출력하기 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String a2 = a.replaceAll(" ", "");
        String b2 = b.replaceAll(" ", "");
        System.out.print(a);
        System.out.print(b);
    }
}
