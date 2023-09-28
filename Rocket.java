package week4_temp;

public class Rocket{
	
	int x,y;
	
	public Rocket(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveUp() {
		this.y++;
	}
	
	@Override
	public String toString() {
		return "Rocket [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) {
		Rocket rc = new Rocket(0, 3);
		
		System.out.println(rc.toString());
		rc.moveUp();
		System.out.println(rc.toString());

	}

}
