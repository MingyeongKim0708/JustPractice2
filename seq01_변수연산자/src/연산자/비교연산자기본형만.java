package 연산자;

import javax.swing.JOptionPane;

public class 비교연산자기본형만 {

	public static void main(String[] args) {
		String id = "root";
		String pw = "1111";
		
		//id에 들어간 건 주소이므로 실제로 들어간 값을 알기 위해선 .contentEquals()를 써야한다.
		if (id.contentEquals("root") && pw.contentEquals("1234")) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
		}

	}

}
