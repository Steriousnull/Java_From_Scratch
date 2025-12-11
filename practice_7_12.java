package Learning;

import java.util.Scanner;

public class practice_7_12 {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please Enter a Number : ");
		num = scanner.nextInt();                             // 4
		
		for(int i=1;i<=num;i++) {
			for(int space = num-i;space>0;space--) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
