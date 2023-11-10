package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> foodArr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<4;i++) {
			System.out.print("음식의 이름을 입력하세요: ");
			String food = sc.next();
			foodArr.add(food);
		}
		String a = foodArr.get(0);
		for(int i = 1; i<foodArr.size(); i++) {
			String name = foodArr.get(i);
			if(a.length() < name.length()) {
				a = name;
			}
		}
		System.out.println(a);
	}
}
