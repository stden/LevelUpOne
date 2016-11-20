package shumkovsg.levelup.one;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sergey on 21.11.16.
 */
public class FrequencyRatio {
    public static void main(String[] args) {
        System.out.println("Searching number's frequency ration in array!");
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

        System.out.println("Enter number to find: ");
        double numberToFind = readConsoleDouble(in);

        double ans = frequencyRatioFinder(array, numberToFind);
        if (ans != 0) {
            System.out.println("Number was found. It's frequency is: " + ans);
        } else {
            System.out.println("Number doesn't exists!");
        }
    }

    private static double frequencyRatioFinder(double[] arr, double num) {
        int freq = 0;
        for (double anArr : arr) {
            if (anArr == num) {
                freq++;
            }
        }
        return freq/arr.length;
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
