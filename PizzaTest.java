package test;

class Pizza{
	int size;
	String type;
	
	public Pizza() {
		size = 12;
		type = "슈퍼슈프림";
	}
	public Pizza(int size, String type) {
		super();
		this.size = size;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", type=" + type + "]";
	}
	
}

public class PizzaTest {

	public static void main(String[] args) {
		Pizza obj1 = new Pizza();
		System.out.println("("+obj1.type+", "+obj1.size+")");
		System.out.println(obj1);
		Pizza obj2 = new Pizza(24, "포테이토");
		System.out.println("("+obj2.type+", "+obj2.size+")");
		System.out.println(obj2);
		
	}

}
