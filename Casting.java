package week7;

class Parent{
	void print() {
	System.out.println("Parent 메소드 호출");
	}
}

class child extends Parent{
	
	@Override
	void print() {
		System.out.println("child 메소드 호출");
		}
}
public class Casting {
	
	public static void main(String[] args) {
		Parent p = new child();
		p.print();

		child c = (child)p; //p를 자식 객체로 형변환
		c.print();
	}

}
