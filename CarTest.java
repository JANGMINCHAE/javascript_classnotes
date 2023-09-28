package week5_project;

class Car {
	String color;
	int speed;
	int gear;
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) { gear = g;}
	void changeColor(String c) { color = c; }
	void speedUp() { speed+= 10;}
	void speedDown() { speed-= 10; }
		
	}

public class CarTest {
	public static void main(String[] args) {
		//202221226 장민채
		Car myCar = new Car();
		myCar.changeGear(1);
		myCar.speedUp();
		System.out.println(myCar);
		
		Car yourCar = new Car();
		yourCar.changeGear(2);
		yourCar.changeColor("blue");
		yourCar.speedUp();
		yourCar.speedUp();
		yourCar.speedDown();
		System.out.println(yourCar);
	}

}
