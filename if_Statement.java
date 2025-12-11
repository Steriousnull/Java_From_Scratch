package Learning;
import java.util.Scanner;

public class if_Statement {
	public static void main(String args[]) {
		int mark;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a Number: ");
		mark = sc.nextInt();
		
		if(mark >= 90) 
			System.out.println("Grade A");
		else if (mark>=80)
			System.out.println("Grade B");
		else if (mark >= 70)
			System.out.println("Grade C");
		else
			System.out.println("Just pass");
		
		
		
		
	}

}
