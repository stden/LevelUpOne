package shumkovsg.levelup.one;

import java.util.Scanner;

public class MinFromThree {

    public static void main(String[] args) {
        System.out.println("Finding min of three numbers: a, b, c!");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number, a: ");
        double a = readConsoleDouble(in);
        System.out.print("Enter first number, b: ");
        double b = readConsoleDouble(in);
        System.out.print("Enter first number, c: ");
        double c = readConsoleDouble(in);

        System.out.println(" Ok! We have three numbers: " + a + " " + b + " " + c);


        System.out.println("My way! Min is " + minFromThree(a, b, c)); //свой алгоритм поиска
        System.out.println();
        System.out.println();
        System.out.println("Oracle way! Min is " + minFromThreeOracle(a, b, c)); //стандартная библиотека классов

    }

    private static double minFromThree(double a, double b, double c) {
        if (a <= b && a < c) {
            return a;
        } else if (b < a && b <= c) {
            return b;
        } else if (c < b && c <= a) {
            return c;
        } else {
            return a;
        }
    }

    private static double minFromThreeOracle(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
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
}
