package week5_project;

class A{
	private int a; // private 전용
	int b; // default
	public int c; // public 공용
}
public class test {
	public static void main(String[] args) {
		//202221226 장민채
		A obj = new A();
		//obj.a = 10;
		obj.b = 20;
		obj.c = 30;
	}

}
