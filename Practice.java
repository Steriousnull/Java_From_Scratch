/*
package Learning;
import java.util.Scanner;


public class Practice {
	public static void main(String args[]) {
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a Number");
		int num = sc.nextInt();
	
		for(int i=1; i<=5; i++){
			for(int j=1;j<=(5-i);j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			
			System.out.println("");
		}

		
		
		
	}
	
}

*/

package Learning;
import java.util.Scanner;

public class Practice{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e;
		
		
		
		System.out.println("Please enter 1st number:");
		a = sc.nextInt();
		System.out.println("Please enter 2nd number");
		b = sc.nextInt();
		
		c = a++;
		d = ++a;
		
		System.out.println(c);
		System.out.println(d);
		
	}
}
