package 게시판정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 회원정보.MemberVO;

public class BbsDAO { // member 테이블에 crud를 하고 싶으면 MemberDAO를 사용하면 됨.
	// DAO = DB Access Object
	// shop DB member table에 접근해서 처리하는 객체
	
	// insert
	public void insert(String title, String content, String writer) {
		// Java-DB 연결 (JDBC) 4단계

		// 1. 연결할 부품(커넥터, driver, 드라이버) 설정
		// 외부자원연결(db,network,cpu,file,...)
		// 상황이 발생했을 때 어떻게 대처할지를 반드시 써주어야 함. try-catch
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 패키지.대표클래스
			System.out.println("1. 커넥터 연결 성공!!");

			// 2. 1번 설정을 커넷터로 db연결하고 승인
			// 1) url - ip + port+ db명
			// 2) id, pw
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db 연결 성공!!");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into bbs values (null, ?, ?, ?)";
			// String site = "http://www.naver.com";
			// 해당 부품으로 만들어주어야 한다.
			// sql ==> PreparedStatement
			// site ==> URL
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);
			System.out.println("3. sql문 생성 성공!!");

			// 4. 3번에서 생성된 sql문을 mySQL로 전송
			ps.execute();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");

		} catch (Exception e) { // 모든 에러를 catch 함 Exception == Error
			e.printStackTrace();
			System.out.println("에러발생");
		}

	}
	
	// delete
	public void delete(int no) {
		// Java-DB 연결 (JDBC) 4단계

		// 1. 연결할 부품(커넥터, driver, 드라이버) 설정
		// 외부자원연결(db,network,cpu,file,...)
		// 상황이 발생했을 때 어떻게 대처할지를 반드시 써주어야 함. try-catch
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 패키지.대표클래스
			System.out.println("1. 커넥터 연결 성공!!");

			// 2. 1번 설정을 커넷터로 db연결하고 승인
			// 1) url - ip + port+ db명
			// 2) id, pw
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db 연결 성공!!");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "delete from bbs where no = ?";
			// 해당 부품으로 만들어주어야 한다.
			// sql ==> PreparedStatement
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			System.out.println("3. sql문 생성 성공!!");

			// 4. 3번에서 생성된 sql문을 mySQL로 전송
			ps.execute();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");

		} catch (Exception e) { // 모든 에러를 catch 함 Exception == Error
			e.printStackTrace();
			System.out.println("에러발생");
		}

	}
	
	// update
	public void update(String title, String content, int no) {
		// Java-DB 연결 (JDBC) 4단계

		// 1. 연결할 부품(커넥터, driver, 드라이버) 설정
		// 외부자원연결(db,network,cpu,file,...)
		// 상황이 발생했을 때 어떻게 대처할지를 반드시 써주어야 함. try-catch
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 패키지.대표클래스
			System.out.println("1. 커넥터 연결 성공!!");

			// 2. 1번 설정을 커넷터로 db연결하고 승인
			// 1) url - ip + port+ db명
			// 2) id, pw
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db 연결 성공!!");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "update bbs set title = ?, content = ? where no = ?";
			// 해당 부품으로 만들어주어야 한다.
			// sql ==> PreparedStatement
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, no);
			System.out.println("3. sql문 생성 성공!!");

			// 4. 3번에서 생성된 sql문을 mySQL로 전송
			ps.execute();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");

		} catch (Exception e) { // 모든 에러를 catch 함 Exception == Error
			e.printStackTrace();
			System.out.println("에러발생");
		}

	}
	
	// one - select
		public BbsVO one(int no) {
			BbsVO bag = new BbsVO();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("1. 커넥터 연결 성공!!");

				String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
				String user = "root";
				String password = "1234";

				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2. shop db 연결 성공!!");

				String sql = "select * from bbs where no = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, no);
				System.out.println("3. sql문 생성 성공!!");

				// select의 결과는 테이블. 검색결과가 없어도 테이블! 검색결과가 없는 경우에는 데이터가 없음
				ResultSet table = ps.executeQuery(); //테이블로 mysql로부터 받아온다
				System.out.println("4. SQL문 mySQL로 전송 성공!!");
				// System.out.println(table.next()); //table 안에 데이터가 있으면 true, 없으면 false (ResultSet에 있는 것)
				if (table.next()) { // table 안에 검색결과인 row가 있는지 체크
					int no2 = table.getInt("no");
					String title = table.getString("title");
					String content = table.getString("content");
					String writer = table.getString("writer");
					
					System.out.println(no2);
					System.out.println(title);
					System.out.println(content);
					System.out.println(writer);
					
					bag.setNo(no2);
					bag.setTitle(title);
					bag.setContent(content);
					bag.setWriter(writer);
					
				}else {
					System.out.println("검색결과가 없음.");
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("에러발생");
			}
			return bag;
			
		} //one

}
