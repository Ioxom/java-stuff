package ca.ioxom.part7.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

//I don't choose the names anymore this is what you get
public class Main {
    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Arrays.sort(integers.toArray());
    }

    public static void sortStrings(ArrayList<String> strings) {
        Arrays.sort(strings.toArray());
    }
}
