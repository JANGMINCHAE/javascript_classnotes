package week6;

public class Rect {
	int width, height;

	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return (double) width * height;
	}
}
