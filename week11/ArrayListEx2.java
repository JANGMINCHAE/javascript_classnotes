package week11;
import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);
		numbers.remove(1);
		System.out.println(numbers);
		numbers.set(2, 35);
		System.out.println(numbers);
		numbers.add(1, 15);
		System.out.println(numbers);
	}
}
