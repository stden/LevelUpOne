package shumkovsg.levelup.one;

import java.util.Scanner;

/**
 * Created by CBSH-SergeyShumkov on 21.11.2016.
 */
public class DivisionOnTwoFourEight {
    public static void main(String[] args) {
        System.out.println("Division on 2, 4 and 8!");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int num = readConsoleInt(in);
        System.out.println(num + "/ 2 = " + (num >> 1));
        System.out.println(num + "/ 4 = " + (num >> 2));
        System.out.println(num + "/ 8 = " + (num >> 3));

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
