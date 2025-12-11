package Learning;

public class diamond_demo {
	public static void main(String[] args) {
        int row = 7;

        // Upper part
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part
        for(int i = 0; i < row - 1; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < row - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}