package flower;

public class flowers extends object{
	char shape;
	public void setShape(char s) {
		this.shape = s;
	}
	public flowers(int x, int y) {
		super(x,y);
	}
	@Override
	protected boolean move() {
		//꽃은 이동하지 않음.
		return false;
	}
	@Override
	protected char GetShape() {
		// TODO Auto-generated method stub
		return this.shape;
	}

}
