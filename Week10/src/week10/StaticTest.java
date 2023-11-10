package week10;
interface Myinterface2{
	static void print(String msg) {
		System.out.println(msg + " : 인터페이스의 정적메소드호출");
	}
}
public class StaticTest {

	public static void main(String[] args) {
		Myinterface2.print("Java 8");
	}

}
