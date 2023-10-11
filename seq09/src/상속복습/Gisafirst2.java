package 상속복습;

public class Gisafirst2 {
	public static void main(String[] args) {
		B2 b = new B2();
		b.paint();
		b.draw();
	}
}
class A2{
	public void paint() {
		System.out.print("A");
		draw();
	}
	public void draw() {
		System.out.print("B");
		draw();
	}
}
class B2 extends A2 {
	public void paint() {
		super.draw(); //A2에서 상속받은 draw -> B
		System.out.print("C"); //C
		this.draw(); //이 클래스의 draw -> D
	}
	public void draw() {
		System.out.print("D"); //D
	}
}
