package week6;
public class PizzaTest2 {
	public static void main(String[] args) {
		Pizza2 p1 = new Pizza2("Super supreme");
		Pizza2 p2 = new Pizza2("파인애플");
		Pizza2 p3 = new Pizza2("게살1");
		Pizza2 p4 = new Pizza2("게살2");
		Pizza2 p5 = new Pizza2("게살3");
		int n = Pizza2.count;
		System.out.println("지금까지 판매된 피자 개수 : " + n);
	}

}
