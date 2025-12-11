package Learning;
import java.util.Scanner;


public class Scan_All_Data_Type {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an Integer:");
		int i = sc.nextInt();
		
		System.out.print("Enter an Double:");
		double d = sc.nextDouble();
		
		System.out.print("Enter a Float:");
		float f = sc.nextFloat();
		
		System.out.print("Enter a character");
		char c = sc.next().charAt(0);
		
		sc.nextLine(); // To avoid buffer
		
		System.out.print("Enter a Boolean (True/False)");
		boolean b = sc.nextBoolean();
		
		System.out.println("\n----Output----");
		System.out.println("Integer."+i);
		System.out.println("Double."+d);
		System.out.println("Float."+f);
		System.out.println("Character."+c);
		System.out.println("Boolean."+b);
		
		sc.close();
		
		
	}

}
