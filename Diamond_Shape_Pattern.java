package Learning;
import java.util.Scanner;

public class Diamond_Shape_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows for the top half (e.g. 5): ");
        int n = sc.nextInt();               // n = number of rows in the upper half
        // Upper half (including middle line)
        for (int i = 1; i <= n; i++) {
            // print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // print stars (2*i - 1 stars)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half (below the middle line)
        for (int i = n - 1; i >= 1; i--) {
            // print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // print stars (2*i - 1 stars)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
