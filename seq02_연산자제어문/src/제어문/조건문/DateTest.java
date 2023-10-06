package 제어문.조건문;

import java.util.Date; //sql말고 util

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		//Calander라는 최신버전이 나와서 예전 버전이라고 취소선으로 그어줌 deprecated. 자바 1.8에선 되지만 다른 곳에선 아예 삭제됐을 수 있음
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
		
		int year = date.getYear() + 1900; // 1900년기준이라  +1900
		int month = date.getMonth() + 1; // 음력기준이라 +1
		int today = date.getDate();
		
		System.out.println(year + "년 " + month + "월 " + today + "일");
		
		//요일
		int day = date.getDay();
		System.out.println(day);

	}

}
