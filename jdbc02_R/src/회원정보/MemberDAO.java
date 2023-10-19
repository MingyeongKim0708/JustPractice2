package 회원정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO { // member 테이블에 crud를 하고 싶으면 MemberDAO를 사용하면 됨.
	// DAO = DB Access Object
	// shop DB member table에 접근해서 처리하는 객체

	// insert
	public int insert(MemberVO bag) {
		int result = 0;
		// Java-DB 연결 (JDBC) 4단계

		// 1. 연결할 부품(커넥터, driver, 드라이버) 설정
		// 외부자원연결(db,network,cpu,file,...)
		// 상황이 발생했을 때 어떻게 대처할지를 반드시 써주어야 함. try-catch
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 패키지.대표클래스
			System.out.println("1. 커넥터 연결 성공!!");

			// 2. 1번 설정을 커넥터로 db연결하고 승인
			// 1) url - ip + port+ db명
			// 2) id, pw
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db 연결 성공!!");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into member values (?, ?, ?, ?)";
			// String site = "http://www.naver.com";
			// 해당 부품으로 만들어주어야 한다.
			// sql ==> PreparedStatement
			// site ==> URL
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId()); // 첫번째 물음표에 id 넣기
			ps.setString(2, bag.getPw()); // 두번째 물음표에 pw 넣기
			ps.setString(3, bag.getName()); // 세번째 물음표에 name 넣기
			ps.setString(4, bag.getTel()); // 네번째 물음표에 tel 넣기
			System.out.println("3. sql문 생성 성공!!");

			// 4. 3번에서 생성된 sql문을 mySQL로 전송
			result = ps.executeUpdate(); // int
			System.out.println("4. SQL문 mySQL로 전송 성공!!");

			// db연결자원해제 - RAM 삭제
			ps.close();
			con.close();

		} catch (Exception e) { // 모든 에러를 catch 함 Exception == Error
			e.printStackTrace();
			System.out.println("에러발생");
		}
		return result;

	}

	// delete
	public int delete(MemberVO bag) {
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공!!");

			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db 연결 성공!!");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "delete from member where id = ?";
			// 해당 부품으로 만들어주어야 한다.
			// sql ==> PreparedStatement
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId()); // 첫번째 물음표에 id 넣기
			System.out.println("3. sql문 생성 성공!!");

			// 4. 3번에서 생성된 sql문을 mySQL로 전송
			result = ps.executeUpdate(); // int
			System.out.println("4. SQL문 mySQL로 전송 성공!!");

			// db연결자원해제 - RAM 삭제
			ps.close();
			con.close();

		} catch (Exception e) { // 모든 에러를 catch 함 Exception == Error
			e.printStackTrace();
			System.out.println("에러발생");
		}
		return result;

	}

	// update
	public int update(MemberVO bag) {
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 패키지.대표클래스
			System.out.println("1. 커넥터 연결 성공!!");

			
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db 연결 성공!!");

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "update member set tel = ? where id = ?";
			// 해당 부품으로 만들어주어야 한다.
			// sql ==> PreparedStatement
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());
			System.out.println("3. sql문 생성 성공!!");

			// 4. 3번에서 생성된 sql문을 mySQL로 전송
			result = ps.executeUpdate(); // int
			System.out.println("4. SQL문 mySQL로 전송 성공!!");

			// db연결자원해제 - RAM 삭제
			ps.close();
			con.close();
			
		} catch (Exception e) { // 모든 에러를 catch 함 Exception == Error
			e.printStackTrace();
			System.out.println("에러발생");
		}
		
		return result;

	}

	// one - select
	public MemberVO one(String id) {
		MemberVO bag = new MemberVO();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 커넥터 연결 성공!!");

			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db 연결 성공!!");

			String sql = "select * from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. sql문 생성 성공!!");

			// select의 결과는 테이블. 검색결과가 없어도 테이블! 검색결과가 없는 경우에는 데이터가 없음
			ResultSet table = ps.executeQuery(); // 테이블로 mysql로부터 받아온다
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			// System.out.println(table.next()); //table 안에 데이터가 있으면 true, 없으면 false
			// (ResultSet에 있는 것)
			if (table.next()) { // table 안에 검색결과인 row가 있는지 체크
				String id2 = table.getString("id"); // id는 컬럼명
				String pw = table.getString("pw");
				String name = table.getString("name");
				String tel = table.getString("tel");

				System.out.println(id2);
				System.out.println(pw);
				System.out.println(name);
				System.out.println(tel);

				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);

			} else {
				System.out.println("검색결과가 없음.");
			}

			// db연결자원해제 - RAM 삭제
			ps.close();
			con.close();
			table.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러발생");
		}
		return bag;

	}// one

}
