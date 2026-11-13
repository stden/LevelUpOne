package shumkovsg.levelup.one;

import java.util.Scanner;

/**
 * Created by Sergei on 20.11.2016.
 */
public class QuadraticEquation {
    public static void main(String[] args) {

        System.out.println(" Solving equation ax^2+bx+c=0. ");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = readConsoleDouble(in);
        System.out.print("Enter coefficient b: ");
        double b = readConsoleDouble(in);
        System.out.print("Enter coefficient c: ");
        double c = readConsoleDouble(in);

        System.out.println(" Coefficient a = " + a);
        System.out.println(" Coefficient b = " + b);
        System.out.println(" Coefficient c = " + c);

        solvingQuadraticEquation(a, b, c);
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

    private static void solvingQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            solvingLinearEquation(b, c);
        } else {
            double discr = b * b - 4.0 * a * c;
            final double EPS = 1e-6;
            if (Math.abs(discr) < EPS) {
                System.out.println("Equation has one radical!");
                System.out.println("x = " + (-b / 2.0 / a));
            } else if (discr < 0) {
                System.out.println("No radicals!");
            } else {
                System.out.println("Equation has two radicals!");
                System.out.println("x1 = " + ((-b + Math.sqrt(discr)) / 2.0 / a));
                System.out.println("x2 = " + ((-b - Math.sqrt(discr)) / 2.0 / a));
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
