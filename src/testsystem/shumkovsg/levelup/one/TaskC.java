package testsystem.shumkovsg.levelup.one;

import java.util.Scanner;

/**
 * Created by CBSH-SergeyShumkov on 21.11.2016.
 */
public class TaskC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = readConsoleDouble(in);
        double b = readConsoleDouble(in);
        double c = readConsoleDouble(in);

        final double EPS = 1e-12;

        if (Math.abs((a + b) - c) < EPS) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
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
