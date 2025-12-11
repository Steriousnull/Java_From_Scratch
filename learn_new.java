package Learning;

import java.util.Scanner;

public class learn_new {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        a = sc.nextInt();

        System.out.println("Enter Second Number:");
        b = sc.nextInt();

        char operator;
        System.out.println("Enter the operator +, -, *, / or % :");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + "+" + b + "=" + (a + b));
                break;

            case '-':
                System.out.println(a + "-" + b + "=" + (a - b));
                break;

            case '*':
                System.out.println(a + "*" + b + "=" + (a * b));
                break;

            case '/':
                if (b != 0)
                    System.out.println(a + "/" + b + "=" + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;

            case '%':
                System.out.println(a + "%" + b + "=" + (a % b));
                break;

            default:   // ✅ NOW IT IS IN THE RIGHT PLACE
                System.out.println("You have entered wrong value");
        }
    }
}
