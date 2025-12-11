package Learning;
import java.util.Scanner;

public class PATTERN_TEST {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		int num = sc.nextInt();

		int rows = 7;

		for (int i = 1; i <= rows; i++) {

			// ✅ Correct space printing
			for (int space = rows - i; space > 0; space--) {
				System.out.print(" ");
			}

			// ✅ Number pattern
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print(num);
			}

			// ✅ Move to next line
			System.out.println();
		}

		sc.close();
	}
}
