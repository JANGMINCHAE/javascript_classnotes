package week6;
class Pizza {
	int radius;
	
	Pizza(int r){
		radius = r;
	}
	Pizza whosLargest(Pizza p1, Pizza p2) {
		if(p1.radius > p2.radius) {
			return p1;
		} else {
			return p2;
		}
	}
}
public class PizzaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pizza obj1 = new Pizza(14);
			Pizza obj2 = new Pizza(18);
			
			System.out.println(obj1.whosLargest(obj1, obj2).radius + "인치 피자가 더 큽니다.");
	}

}
