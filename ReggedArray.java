package week4;

import java.util.*;

public class ReggedArray {

	public static void main(String[] args) {
		int[][] ragged = new int[3][];
		ragged[0] = new int[] {1,2,3,4};
		ragged[1] = new int[] {5,6,7};
		ragged[2] = new int[] {8,9};
		
		for(int[] row:ragged) {
			System.out.println(Arrays.toString(row));
		}
	}

}
