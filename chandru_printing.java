package Learning;
import java.util.Scanner;

public class chandru_printing {

	static void delay(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
        }
    }

    // Move cursor UP by given lines
    static void moveCursorUp(int lines) {
        System.out.print("\033[" + lines + "A");
    }

    // Clear current line
    static void clearLine() {
        System.out.print("\033[2K");
    }

    static String[][] CHANDRU = {
        {" ***** ", "      *", "      *", "      *", " ***** "},   // C
        {"*     *", "*     *", "*******", "*     *", "*     *"},/ / H
        {" ***** ", "*     *", "*******", "*     *", "*     *"}, // A
        {"*     *", "**    *", "* *   *", "*  *  *", "*     *"}, // N
        {"*****  ", "*    * ", "*     *", "*    * ", "*****  "}, // D
        {"*****  ", "*    * ", "*****  ", "*   *  ", "*    * "}, // R
        {"*     *", "*     *", "*     *", "*     *", " ***** "}  // U
    };

    static void printCHANDRU() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < CHANDRU.length; j++) {
                System.out.print(CHANDRU[j][i] + "   ");
            }
            System.out.println();
            delay(200);
        }
    }

    static void clearCHANDRU() {
        for (int i = 0; i < 5; i++) {
            clearLine();
            System.out.println();
        }
        moveCursorUp(5);
    }

    static void blinkEffect() {
        for (int i = 0; i < 8; i++) {
            delay(350);
            clearCHANDRU();   // OFF
            delay(350);
            printCHANDRU();   // ON
            moveCursorUp(5);  // Keep same position
        }
    }

    public static void main(String[] args) {

        // First animation
        printCHANDRU();

        delay(1200);

        // Blink in same position
        blinkEffect();
    }
}