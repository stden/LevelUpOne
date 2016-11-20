package shumkovsg.levelup.one;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sergey on 20.11.16.
 */
public class MinSearchAlg {
    public static void main(String[] args) {

        System.out.println("Searching minimum number im array!");
        System.out.print("Enter size of array: ");

        Scanner in = new Scanner(System.in);
        int arraySize = (int) readConsoleDouble(in);

        if (arraySize > 0) {
            double[] array = new double[arraySize];

            System.out.println("Enter elements of array!");
            for (int i = 0; i < array.length; i++) {
                System.out.print("Element " + i + " = ");
                array[i] = readConsoleDouble(in);
            }

            System.out.println("Your array is:");
            System.out.println(Arrays.toString(array));

            System.out.print("Min element is: ");
            System.out.println(minSearch(array));
        }
        else {
            System.out.println("Array size must be above zero!");
        }
    }

    private static double minSearch(double[] arr) {
        if (arr.length > 1) {
            double min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            return min;
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

}
