package week11;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListIterator {
public static void main(String[] args) {
// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("numbers Array: "+numbers);
		Iterator<Integer> it = numbers.iterator();
		int sum = 0;
		while(it.hasNext()) {
			sum += it.next();
		}
	System.out.println("합: "+sum);
	}
}