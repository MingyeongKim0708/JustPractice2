package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

	public static void main(String[] args) {
		Connection conn = Jsoup.connect("http://www.naver.com"); // Connection이라는 부품 return
		System.out.println(conn);
		try {
			Document doc = conn.get();
			System.out.println(doc);
			System.out.println("======================");
			Elements list = doc.select("span"); // ArrayList--상속-->Elements //span 태그를 쓰는 것들을 list에 넣음
			// 조건에 맞는 태그들의 리스스트를 객체 {태그, 태그, 태그, ...}
			// 태그(태그명), 클래스(.클래스명), id(#id명)
			// Element == tag
			// Elements == tag리스트 {tag, tag, tag, ...}
			System.out.println(list.size());
			System.out.println("======================");
			System.out.println(list);
			System.out.println("======================");
			for (int i = 0; i < list.size(); i++) {
				// <span></span> 자동저장 끄기
				System.out.println(list.get(i).text()); //텍스트만 추출
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 연결한 사이트에서 코드를 다 가지고 온다.
			// 위험한 상황 - 외부자원 연결(cpu, file), network
			// 위험한 상황에 대해서는 그 상황이 발생했을 때 어떻게 처리할지를 반드시 명시
	}

}
