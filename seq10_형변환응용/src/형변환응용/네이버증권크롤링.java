package 형변환응용;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) {
		String company = JOptionPane.showInputDialog("코드를 입력하세요");
		// 005930 삼성전자, 086520 에코프로, 022100 포스코DX
		Connection conn = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + company); // Connection이라는
																										// 부품 return
		System.out.println(conn); // 연결을 담당하는 객체
		try {
			Document doc = conn.get(); // html문서
			System.out.println(doc);
			System.out.println("======================");
			Elements list = doc.select("span.code"); // ArrayList--상속-->Elements //span 태그를 쓰는 것들을 list에 넣음
			// 조건에 맞는 태그들의 리스스트를 객체 {태그, 태그, 태그, ...}
			// 태그(태그명), 클래스(.클래스명), id(#id명)
			// Element == tag
			// Elements == tag리스트 {tag, tag, tag, ...}
			System.out.println(list.size());
			System.out.println("======================");
			System.out.println(list);
			System.out.println("======================");
			String code = list.get(0).text();
			System.out.println("코드는 : " + code);
//			for (int i = 0; i < list.size(); i++) {
//				// <span>자동저장 끄기</span> 
//				System.out.println(list.get(i).text()); //텍스트만 추출
//			}

			System.out.println("--------------------");
			Elements list2 = doc.select("td.first span.blind");
			System.out.println(list2.size());
			// System.out.println(list2.get(0).text());
			System.out.println(list2.get(1).text());
			String yes = list2.get(0).text();
			String start = list2.get(1).text();
			System.out.println("전일가>> " + yes);
			System.out.println("시작가>> " + start);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 연결한 사이트에서 코드를 다 가지고 온다.
		// 위험한 상황 - 외부자원 연결(cpu, file), network
		// 위험한 상황에 대해서는 그 상황이 발생했을 때 어떻게 처리할지를 반드시 명시
	}

}
