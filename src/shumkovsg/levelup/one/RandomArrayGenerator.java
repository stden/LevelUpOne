package shumkovsg.levelup.one;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by CBSH-SergeyShumkov on 21.11.2016.
 */
public class RandomArrayGenerator {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(randomArrGen(40, 1.0, 2)));

    }

    public static double[] randomArrGen(int arrSize, double min, double max) {
        double[] array = new double[arrSize];
        Random rand = new Random();
        for (int i = 0; i < arrSize; i++) {
            array[i] = rand.nextDouble() * (max - min) + min;
        }
        return array;
    }

}


