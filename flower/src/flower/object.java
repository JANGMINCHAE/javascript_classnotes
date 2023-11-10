package flower;

public abstract class object {
	protected int distance; // 한 번에 이동 거리
	protected int x,y; // 현재 위치
	protected char shape;
	
	
	protected abstract boolean move(); //이동 후 새로운 위치로 x,y 변경 
	protected abstract char GetShape(); // 객체의 모양을 나타내는 문자 리턴 
	public void SetShape(flowers a) {
		a.shape = '$';
	}
	public object(int startx, int starty, int distance) { //초기위치 이동거리 설정 
		this.x = startx;
		this.y = starty;
		this.distance = distance;
	}
	
	public object(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() { return x;}
	public int getY() { return y;}
	
	public boolean grow(object p) {
		if(x + 1 == p.getX() && y == p.getY()) {
			return true;
		} else
			return false;
	}
	public void setShape(char s) {
		// TODO Auto-generated method stub
		
	}
}
