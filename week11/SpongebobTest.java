package week11;

interface 학생{
	public void 공부한다();
	public void 시험본다();
}

interface 집게리아사원{
	public void 패티굽는다();
}

class 스폰지밥 implements 학생, 집게리아사원{

	@Override
	public void 패티굽는다() {
		// TODO Auto-generated method stub
		System.out.println("난 집게리아에서 패티를 구워");
	}
	
	@Override
	public void 공부한다() {
	// TODO Auto-generated method stub
		System.out.println("퐁퐁부인에게 운전을 배우는 학생이야");
	}

	@Override
	public void 시험본다() {
	// TODO Auto-generated method stub
		System.out.println("나는 퐁퐁부인의 학원에서 운전 시험을 봐");
	}

}

public class SpongebobTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		스폰지밥 s = new 스폰지밥();
		s.패티굽는다();
		s.공부한다();
		s.시험본다();

	}
}