package test;

public class CircleTest {

	public static void main(String[] args) {
		Circle obj;
		obj = new Circle();
		obj.radius = 100;
		obj.color = "blue";
		double area = obj.getArea();
		System.out.println("원의 면적: "+area);
		
		Circle obj2;
		obj2 = new Circle();
		obj2.radius = 200;
		obj2.color = "red";
		double area2 = obj2.getArea();
		System.out.println("원의 면적: "+area2);
		
		

	}

}
