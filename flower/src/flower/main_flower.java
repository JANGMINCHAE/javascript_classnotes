package flower;

import java.util.Scanner;

public class main_flower {
	private char flower_map[][] = new char[10][20];
	private object [] place_object = new object[7];
	int count = 0;
	
	Scanner sc = new Scanner(System.in);
	char c;
	
	public main_flower() {
		for(int y = 0; y<10; y++) {
			for(int x = 0; x<20; x++) {
				flower_map[y][x] = '_';
			}
		}
		//물뿌리개, 꽃 배치 
		place_object[0] = new me(0,0,1);
		place_object[1] = new flowers(1,5);
		place_object[2] = new flowers(10,2);
		place_object[3] = new flowers(18,9);
		place_object[4] = new flowers(8,10);
		place_object[5] = new flowers(15,7);
		place_object[6] = new flowers(7,1);
		
		//꽃 모양 설정
		for(int i = 1; i<7; i++) {
			place_object[i].setShape('f');
		}
		
	}
	
	public void draw() {
		
		System.out.println();
		for(int y=0; y<10; y++) {
			for(int x=0; x<20; x++) {
				System.out.print(flower_map[y][x]);
			}System.out.println();
		}
	}
	
	private void update() {
	    for (int i = 0; i < place_object.length; i++) {
	        int x = place_object[i].getX();
	        int y = place_object[i].getY();

	        if (x >= 0 && x < 20 && y >= 0 && y < 10) {
	            flower_map[y][x] = place_object[i].GetShape();
	        }
	    }
	}

	
	private void clear() {
	    for (int i = 0; i < place_object.length; i++) {
	        int x = place_object[i].getX();
	        int y = place_object[i].getY();

	        if (x >= 0 && x < 20 && y >= 0 && y < 10) {
	            flower_map[y][x] = '_';
	        }
	    }
	}

	private void run() {
        update(); // 새로운 상태 업데이트
        draw();   // 그리기
        while(count < 3) {
        	clear(); 
        	if(place_object[0].move()) {
        		isGrow();
        	}
        	update();
			draw();
        }
		
	}
	
	private void isGrow() {
		for(int i = 1; i<7; i++) {
			if(place_object[0].grow(place_object[i])) {
				place_object[i].setShape('W');
				count++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main_flower game = new main_flower();
		game.run();

	}

}
