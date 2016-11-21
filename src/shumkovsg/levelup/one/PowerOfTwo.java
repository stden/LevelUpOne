package shumkovsg.levelup.one;

import java.util.Scanner;

/**
 * Created by sergey on 21.11.16.
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Power of two!");
        System.out.print("Enter power in [0, 60]: ");

        Scanner in = new Scanner(System.in);
        int pow = readConsoleInt(in);

        System.out.println("2 raised to the power of " + pow + " is: " + power(pow));
    }

    private static long power(int pow) {
        while (true) {
            if (pow >= 0 && pow <= 60) {
                return 1 << pow;
            }  else {
                System.out.println("Power must be in [0, 60]! Try again: ");
            }
        }
    }

    private static int readConsoleInt(Scanner in) {
        while (true) {
            if (in.hasNextInt()) {
                return in.nextInt();
            } else {
                System.out.print("Not a integer! Enter again: ");
                in.next();
            }
        }
    }

}
