package 자바입문;

public class 기본API활용 {

	public static void main(String[] args) {
		String address[] = { "경기도 남양주 별내동", "서울시 영등포구 당산동", "충남 천안시 서북구", "서울시 양천구 목동", "서울시 송파구 석촌동", "전북 부안군 부안읍" };

		//서울시의 주소만 출력하는 코드
		for (int i = 0; i < address.length; i++) {
			if (address[i].startsWith("서울시")) {
				System.out.println(address[i]);
			}
		}
	}

}
