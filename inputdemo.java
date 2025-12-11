/*
  package Learning;

public class inputdemo {

}
 */
package Learning;
import java.util.Scanner;



public class inputdemo {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is Your name : ");
		String name = scanner.nextLine();
		System.out.println("What is you age");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Hello " + name);
		System.out.println("Your age is "+ age);
		System.out.println("Enter your Email ");
		String Email = scanner.nextLine();
		
		System.out.println("Program end");
		
	}
}