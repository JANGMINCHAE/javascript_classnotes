package week6;
class Single {
	private static Single instance = new Single();
	private Single() {
		
	}
	public static Single getInstance() {
		return instance;
	}
	
}//싱글톤 패턴 -> 객체 하나를 돌려씀

public class SingleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single sg1 = Single.getInstance();
		Single sg2 = Single.getInstance();
		System.out.println(sg1);
		System.out.println(sg2);
	}

}
