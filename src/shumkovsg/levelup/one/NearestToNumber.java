package shumkovsg.levelup.one;

import java.util.Scanner;

public class NearestToNumber {

    public static void main(String[] args) {
        System.out.println(" Define number from 'a' and 'b' nearest to number 'c'! ");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number a: ");
        double a = readConsoleDouble(in);
        System.out.print("Enter number b: ");
        double b = readConsoleDouble(in);
        System.out.print("Enter number c: ");
        double c = readConsoleDouble(in);


        System.out.println(" Number a = " + a);
        System.out.println(" Number b = " + b);
        System.out.println(" Number c = " + c);

        System.out.print("Nearest to " + c + " is " + nearestNumber(a, b, c));

    }

    private static double readConsoleDouble(Scanner in) {
        while (true) {
            if (in.hasNextDouble()) {
                double temp = in.nextDouble();
                if (Double.isFinite(temp)) {
                    return temp;
                } else {
                    System.out.print("Not a number! Enter again: ");
                }
            } else {
                System.out.print("Not a number! Enter again: ");
                in.next();
            }
        }
    }

    private static double nearestNumber(double a, double b, double c) {
        if (Math.abs(c - b) < Math.abs(c - a)) {
            return b;
        } else {
            return a;
        }
    }
}
