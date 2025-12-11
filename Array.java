package Learning;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int marks[] = {1,2,3,4,5,6};
		System.out.println(marks[0]);
		
		int mark[][] = new int [3][4];
		
		mark[0][0] = 85;
		mark[0][1] = 75;
		
		System.out.println(mark[0][0]);
		
		int z[][]= {
				{2,3,4,5},
				{6,7,8,9,},
				{10,11,12,13}
				
		};
		System.out.println(Arrays.deepToString(z));
		
		
	
		
	}

}
