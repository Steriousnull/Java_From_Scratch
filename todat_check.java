package Learning;

import java.util.Scanner;

public class todat_check {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an Number : ");
		num = sc.nextInt();
		System.out.println("Welcome");
		for (int i=1;i<=5;i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
		

}
