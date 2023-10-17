package week7;
//생성자 오버로
public class 르세라핌 {
	String name, role;
	int age;
	
	
	public 르세라핌(String name) {
		this(name,"미정",21);
	}
	


	public 르세라핌(String name, int age) {
		this(name,"미정",age);
	}
	
	
	public 르세라핌(String name, String role, int age) {
		super();
		this.name = name;
		this.role = role;
		this.age = age;
	}
	
	String getSome() {
		return this.name + this.age + this.role;
	}

	public static void main(String[] args) {
	르세라핌 l1 = new 르세라핌("사쿠라", 21);
	르세라핌 l2 = new 르세라핌("카즈", "랩", 21);
	System.out.println(l1.getSome());
	}

}
