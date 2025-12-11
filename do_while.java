package Learning;

import java.util.Scanner;

public class do_while {
	public static void main(String[] args) {
		int i=1;
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Stars You Need : ");
		n = sc.nextInt();
		
		;
		// in do while loop atleast one time execution is occured.
		// Give Input 0 it will print * one time.
		do {
			System.out.print("*");
			i++;
		}while(i<=n);
		
	}

}
