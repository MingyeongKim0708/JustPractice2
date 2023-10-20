package 상품정보;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import 회원정보.MemberVO;

public class ProductDAO {
	// 전역변수 설정
	Connection con = null;
	
	public ProductDAO() {
		try {
			// 1. 연결할 부품(커넥터, driver, 드라이버) 설정
			// 외부자원연결(db,network,cpu,file,...). 위험 상황이 발생했을 때 어떻게 대처할지를 반드시 써주어야 함. try-catch
			Class.forName("com.mysql.cj.jdbc.Driver"); // 패키지.대표클래스
			System.out.println("1. 커넥터 연결 성공!!");

			// 2. 1번 설정을 커넥터로 db연결하고 승인
			// url - ip + port+ db명, id, pw
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";

			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. shop db 연결 성공!!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 파일을 찾을 수 없음");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("mySQL 연결할 때 문제가 생김");
		}
	}

	// insert
	public void insert(ProductVO bag) {
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into product values (?, ?, ?, ?, ?, ?)";
			// String site = "http://www.naver.com";
			// 해당 부품으로 만들어주어야 한다.
			// sql ==> PreparedStatement
			// site ==> URL
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getContent());
			ps.setInt(4, bag.getPrice());
			ps.setString(5, bag.getCompany());
			ps.setString(6, bag.getImg());

			System.out.println("3. sql문 생성 성공!!");

			// 4. 3번에서 생성된 sql문을 mySQL로 전송
			int rowCount = ps.executeUpdate(); // insert문 실행한 row 수, int
			if (rowCount == 1) {
				System.out.println("상품 추가 성공!");
			}
			System.out.println("4. SQL문 mySQL로 전송 성공!!");

		} catch (Exception e) { // 모든 에러를 catch 함 Exception == Error
			e.printStackTrace();
			System.out.println("에러발생");
		}

	}

	// delete
	public void delete(ProductVO bag) {
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "delete from product where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());

			System.out.println("3. sql문 생성 성공!!");

			// 4. 3번에서 생성된 sql문을 mySQL로 전송
			int rowCount = ps.executeUpdate();
			if (rowCount == 1) {
				System.out.println("상품 삭제 성공!");
			}
			System.out.println("4. SQL문 mySQL로 전송 성공!!");

		} catch (Exception e) { // 모든 에러를 catch 함 Exception == Error
			e.printStackTrace();
			System.out.println("에러발생");
		}

	}

	// update
	public void update(ProductVO bag) {
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "update product set name = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getName());
			ps.setString(2, bag.getId());

			System.out.println("3. sql문 생성 성공!!");

			// 4. 3번에서 생성된 sql문을 mySQL로 전송
			int rowCount = ps.executeUpdate();
			if (rowCount == 1) {
				System.out.println("상품 수정 성공!");
			}
			System.out.println("4. SQL문 mySQL로 전송 성공!!");

		} catch (Exception e) { // 모든 에러를 catch 함 Exception == Error
			e.printStackTrace();
			System.out.println("에러발생");
		}

	}

	// one - select
	public ProductVO one(String id) {
		ProductVO bag = new ProductVO();
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "select * from product where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			System.out.println("3. sql문 생성 성공!!");

			// 4. 3번에서 생성된 sql문을 mySQL로 전송
			ResultSet table = ps.executeQuery();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			
			if (table.next()) { // table 안에 검색결과인 row가 있는지 체크
				String id2 = table.getString("id"); // id는 컬럼명
				String name = table.getString("name");
				String content = table.getString("content");
				int price = table.getInt("price");
				String company = table.getString("company");
				String img = table.getString("img");

				System.out.println(id2);
				System.out.println(name);
				System.out.println(content);
				System.out.println(price);
				System.out.println(company);
				System.out.println(img);
				
				bag.setId(id2);
				bag.setName(name);
				bag.setContent(content);
				bag.setPrice(price);
				bag.setCompany(company);
				bag.setImg(img);

			} else {
				System.out.println("검색결과가 없음.");
			}

		} catch (Exception e) { // 모든 에러를 catch 함 Exception == Error
			e.printStackTrace();
			System.out.println("에러발생");
		}
		return bag;

	}//one

}
