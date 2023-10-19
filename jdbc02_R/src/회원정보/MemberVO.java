package 회원정보;

public class MemberVO {
	String id;
	String pw;
	String name;
	String tel;
	
	// 가방에 데이터를 하나씩 넣는 기능 => 함수(메서드)
	public void setId(String id) { // setter
		this.id = id; // this.id(MemberVO의 id) = 입력한 id
	}
	
	// 가방에서 데이터를 하나씩 꺼내는 기능 => 함수(메서드)
	public String getId() { // getter
		return id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	// class 안쪽에 두고 Source - Generate Getters and Setters
	// Select All - Generate

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
}
