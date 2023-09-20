package test;

class Math{
	int add(int x, int y) {return x+y;}
	int add(int x, int y, int z) {return x+y+z;}
	int add(int x, int y, int z, int w) {return x+y+z+w;}
}

public class MyMath {

	public static void main(String[] args) {
		Math obj = new Math();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));
		System.out.println(obj.add(10, 20, 30, 40));
	}

}
