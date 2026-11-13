package shumkovsg.levelup.one;

import java.util.Scanner;

public class IsEven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter integer: ");
        long a = readConsoleInteger(in);
        if ((a % 2) == 0) {
            System.out.println("It's Even!");
        } else {
            System.out.println("It's Uneven!");
        }

    }

    private static long readConsoleInteger(Scanner in) {
        while (true) {
            if (in.hasNextLong()) {
                return in.nextLong();
            } else {
                System.out.print("Please, enter Integer! Try again: ");
                in.next();
            }
        }
    }
}
