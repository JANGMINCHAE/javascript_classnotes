package week7;
class Animal1 {
	public static void A() {
		System.out.println("static method in Animal");
	}
}

public class Dog extends Animal1{
	public static void A() {
		System.out.println("static method in Dog");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal1 a = dog;
		a.A();
		dog.A();
	}

}
