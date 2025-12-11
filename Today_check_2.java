package Learning;

import java.util.Scanner;

public class Today_check_2 {
	public static void main(String[] args) {
		int row,i,j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		row = sc.nextInt();
		
		for(i=0;i<row;i++) {
			for(j=0;j<row-1-i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(i=0;i<row-1;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<row-1-i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
	

}
