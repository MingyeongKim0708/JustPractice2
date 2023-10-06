package 생성자복습;

public class Bbs {

	public int no;
	public String title;
	public String content;
	public String writer;
	
	//생성자
	public Bbs(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	//멤버 메서드가 있다면 여기에
	
	//toString
	@Override
	public String toString() {
		return no + "\t" + title + "\t" + content + "\t" + writer;
	}

	// 객체생성시 4개의 멤버변수를 초기화하고 싶으면 클래스와 동일한 대문자로 시작하는 메서드를 하나 만들기
	// ==>생성자 메서드, constructor
	// 객체생성(new)시 자동 호출됨
	//다른 생성자가 없으면, 파라메터 없는 생성자가 묵시적으로 하나 자동 생성된다(안보임)

}
