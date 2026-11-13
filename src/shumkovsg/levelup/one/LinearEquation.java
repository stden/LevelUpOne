package shumkovsg.levelup.one;

import java.util.Scanner;

/**
 * Created by Sergei on 20.11.2016.
 */
public class LinearEquation {
    public static void main(String[] args) {

        System.out.println(" Solving equation ax+b=0. ");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = readConsoleDouble(in);
        System.out.print("Enter coefficient b: ");
        double b = readConsoleDouble(in);

        System.out.println(" Coefficient a = " + a);
        System.out.println(" Coefficient b = " + b);

        solvingLinearEquation(a, b);
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

    private static void solvingLinearEquation(double a, double b) {
        if (a != 0) {
            System.out.print(" Radical x = ");
            System.out.println(-b / a);
        } else if (b == 0) {
            System.out.println(" Trivial equation! ");
        } else {
            System.out.println(" Error! Wrong Equation! ");
        }
    }
}
