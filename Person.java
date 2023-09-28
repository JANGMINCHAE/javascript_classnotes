package week4_temp;

class PersonInfo {
	public String name, mobile, office, email;
	
	public PersonInfo(String n,String m,String o,String e) {
		super();
		this.name = n;
		this.mobile = m;
		this.office = o;
		this.email = e;
	}

	@Override
	public String toString() {
		return "PersonInfo [name=" + name + ", mobile=" + mobile + ", office=" + office + ", email=" + email + "]";
	}
	
	
}
public class Person {
	public static void main(String[] args) {
		
		PersonInfo ps = new PersonInfo("Jang", "01046512256", "0246212256", 
				"zzzxxccbbtrsgjo@gmail.com");
		
		System.out.println(ps.toString());
	}
}
