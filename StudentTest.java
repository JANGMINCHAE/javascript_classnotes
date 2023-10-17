package week7;
class Student extends week7temp.Person{
	int id;
}
public class StudentTest {
	

	public static void main(String[] args) {
		Student obj = new Student();
		//obj.regnumber = "123123123";
		//obj.weight = 75.0;
		obj.setWeight(75.0);
		obj.age = 21;
		//obj.name = "Jang";
	}

}
