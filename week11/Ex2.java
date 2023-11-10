package week11;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex2 {
public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);
Iterator<Integer> it = numbers.iterator();
while(it.hasNext()) {
Integer i = it.next();
if(i<30)
it.remove();
}
System.out.println(numbers);
}
}

