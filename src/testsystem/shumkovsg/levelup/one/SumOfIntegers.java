package testsystem.shumkovsg.levelup.one;

import java.util.Scanner;

/**
 * Created by CBSH-SergeyShumkov on 21.11.2016.
 */
public class SumOfIntegers {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int[] array = new int[40];
        for (int i = 0; i < array.length; i++) {
            if (in.hasNextInt()) {
                array[i] = in.nextInt();
            } else {
                break;
            }
        }

        System.out.println(sumOfElements(array));

    }

    private static int sumOfElements(int[] arr) {
        int sum = 0;
        for (double anArr : arr) {
            sum += anArr;
        }
        return sum;
    }
}
