package shumkovsg.levelup.one;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by CBSH-SergeyShumkov on 21.11.2016.
 */
public class MaxSearchAlg {
    public static void main(String[] args) {

        System.out.println("Searching minimum number im array!");
        System.out.print("Enter size of array: ");

        Scanner in = new Scanner(System.in);
        int arraySize = readArraySize(in);

        double[] array = new double[arraySize];

        System.out.println("Enter elements of array!");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + i + " = ");
            array[i] = readConsoleDouble(in);
        }

        System.out.println("Your array is:");
        System.out.println(Arrays.toString(array));

        System.out.print("Min element is: ");
        System.out.println(maxSearch(array));


    }

    private static double maxSearch(double[] arr) {
        if (arr.length > 1) {
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        } else  {
            return arr[0];
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

    private static int readArraySize(Scanner in) {
        int arraySize;
        while (true) {
            if (in.hasNextInt()) {
                if ((arraySize = in.nextInt()) <= 0) {
                    System.out.print("Size of array must be above zero! Try again: ");
                } else {
                    return arraySize;
                }
            } else {
                System.out.print("Size of array must be integer! Try again: ");
                in.next();
            }
        }
    }
}
