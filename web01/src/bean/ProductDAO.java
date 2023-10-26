package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {
	Connection con = null; // 클래스 바로 아래에 만들어주면 클래스 전체영역에서 사용 가능
	DBConnectionMgr dbcp; // null

	public ProductDAO() {
		try {
			dbcp = DBConnectionMgr.getInstance();
			con = dbcp.getConnection();// 임대
		} catch (Exception e) {
			System.out.println("에러발생!!");
		}
	}

	public void insert(ProductVO bag) {
		try {

			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into product values (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, bag.getId()); // 물음표 번호 1번에 title에 저장한 변수값을 넣어줘!
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getContent());
			ps.setInt(4, bag.getPrice());
			ps.setString(5, bag.getCompany());
			ps.setString(6, bag.getImg());

			System.out.println("3. sql문 생성 성공!!");

			// URL site = new URL(site);

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			int rowCount = ps.executeUpdate(); // insert문 실행한 row수,int
			if (rowCount == 1) {
				System.out.println("상품 추가 성공!");
			}
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
	}

	public int delete(String id) {
		int result = 0;
		try {
			String sql = "delete from product where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공!!");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}

		return result;
	}

	public int update(int price, String content, String id) {
		// Java-DB연결 (JDBC) 4단계
		// 1. 연결할 부품(커넥터, driver, 드라이버) 설정
		int result = 0;
		try {
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "update product set price = ?, content = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setInt(1, price);
			ps.setString(2, content);
			ps.setString(3, id); //
			System.out.println("3. sql문 생성 성공!!");

			// URL site = new URL(site);

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			result = ps.executeUpdate();
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
		return result;
	} // update

	public ProductVO one(String id) {
		ProductVO bag = new ProductVO();
		try {

			String sql = "select * from product where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 물음표 번호 1번에 id에 저장한 변수값을 넣어줘!
			System.out.println("3. sql문 생성 성공!!");

			ResultSet table = ps.executeQuery(); // 테이블로 mysql로 받아온다.
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			// System.out.println(table.next()); //table안에 데이터가 있으면 true
			if (table.next()) { // table안에 검색결과인 row가 있는지 체크
				bag.setId(table.getString(1));
				bag.setName(table.getString(2));
				bag.setContent(table.getString(3));
				bag.setPrice(table.getInt(4));
				bag.setCompany(table.getString(5));
				bag.setImg(table.getString(6));
			} else {
				System.out.println("검색결과가 없음.");
			}
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
		return bag;
	} // one

	public ArrayList<ProductVO> list() {
//		int result = 0;
		ArrayList<ProductVO> list = new ArrayList<>();
		// ArrayList<넣을 데이터 타입>, ArrayList<ProductVO> ==> ProductVO만 넣는 리스트
		try {
			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql); //
			System.out.println("3. sql문 생성 성공!!");

			ResultSet table = ps.executeQuery(); // 테이블로 mysql로 받아온다.
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			while (table.next()) { // table안에 검색결과인 row가 있는지 체크
				// table.next()는 행에 데이터가 있는지 체크해준다.
				// 반복할 떄마다 행을 가리키고 있는 커서가 하나씩 밑으로 내려간다.
				// 만약에 있으면 table.next()가 true가 된다.
				// 1. 가리키고 있는 row의 각 컬럼을 꺼내서 넣어줄 가방 만들기
				// 2. table에서 한행씩 꺼내서 가방에 넣자
				// 3. 데이터가 들어있는 가방을 list에 넣자
				ProductVO bag = new ProductVO();
				bag.setId(table.getString("id"));
				bag.setName(table.getString("name"));
				bag.setContent(table.getString("content"));
				bag.setPrice(table.getInt("price"));
				bag.setCompany(table.getString("company"));
				bag.setImg(table.getString("img"));
				list.add(bag); // bag들을 모두 list에 더함
			}
			dbcp.freeConnection(con, ps, table);// 반납
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
		return list;
	} // list
}
