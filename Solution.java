package week7;
class Animal{
	void walk() {
		System.out.println("I am walking");
	}
	
}
class Bird extends Animal{ // Animal 상
	void fly() {
		System.out.println("I am flying");
	};
	void sing() {
		System.out.println("I am singing");
	}
	
}
public class Solution {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.sing();
		bird.fly();
		bird.walk();

	}

}
