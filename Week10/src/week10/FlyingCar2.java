package week10;
interface Flyable2 { void fly2(); }
//다중 상속
class  Car{
	int speed;
	void setSpeed(int s) {
		this.speed = s;
	}
}
public class FlyingCar2 extends Car implements Flyable2 {
	public void fly2() {
		System.out.println("I'm flying");
	}
	public static void main(String[] args) {
		FlyingCar2 obj = new FlyingCar2();
		obj.setSpeed(300);
		obj.fly2();

	}

}
