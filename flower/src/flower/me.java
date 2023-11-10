package flower;

import java.util.Scanner;

public class me extends object {
	private Scanner sc = new Scanner(System.in);

	char shape = '#';
	
	public me(int startx, int starty, int distance) {
		super(startx, starty, distance);
		// TODO Auto-generated constructor stub
	}


	@Override
	protected boolean move() {
		// TODO Auto-generated method stub
		System.out.print("왼쪽(a), 아래(s), 오른쪽(d), 위(w) ==> ");
		char c;
		boolean a = false;
		c = sc.next().charAt(0); //키보드를 입력받는 것 중의 첫 번째를 받아옴
		
		switch(c) {
		
		case 'a':
			x--;
			if(x<0) x=0; a = false; break;
		case 's':
			y++;
			if(y<0) y=0; a = false; break;
		case 'd':
			x++;
			if(x>=20) x = 20 - 1; a = false; break;
		case 'w':
			y--;
			if(y>=10) y = 10 - 1; a = false; break;
		case 'A':
			a = true; break;
		}
		return a;
		
	}

	@Override
	protected char GetShape() {
		// TODO Auto-generated method stub
		return this.shape;
	}
	
}
