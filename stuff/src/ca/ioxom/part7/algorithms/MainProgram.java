package ca.ioxom.part7.algorithms;

import java.util.Arrays;

public class MainProgram {
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int n1 = array[index1];
        array[index1] = array[index2];
        array[index2] = n1;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            MainProgram.swap(array, i, indexOfSmallestFrom(array, i));
        }
        System.out.println(Arrays.toString(array));
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int index = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] arrgs) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
