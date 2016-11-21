package testsystem.shumkovsg.levelup.one;

import java.util.Scanner;

/**
 * Created by CBSH-SergeyShumkov on 21.11.2016.
 */
public class QuadraticEquation {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        double a = readConsoleDouble(in);
        double b = readConsoleDouble(in);
        double c = readConsoleDouble(in);


        solvingQuadraticEquation(a, b, c);
    }

    private static void solvingQuadraticEquation(double a, double b, double c) {
        if (a != 0) {
            double discr = b * b - 4.0 * a * c;
            final double EPS = 1e-6;
            if (Math.abs(discr) < EPS) {
                System.out.println("1 " + (-b / 2.0 / a));
            } else if (discr < 0) {
                System.out.println("0");
            } else {
                System.out.printf("2 %.10f %.10f ", (-b + Math.sqrt(discr)) / 2.0 / a, (-b - Math.sqrt(discr)) / 2.0 / a);

            }
        } else if (b != 0) {
            System.out.println("1 " + (-c / b));
        } else if (c == 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
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

