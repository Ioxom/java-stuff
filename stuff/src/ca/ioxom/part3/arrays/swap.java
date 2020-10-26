package ca.ioxom.part3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void swapValues(int[] array, int index1, int index2) {
        int saved = array[index1];
        array[index1] = array[index2];
        array[index2] = saved;
    }
    public static void main(String[] arrgs) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give two indices to swap:");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        swapValues(array, index1, index2);
        System.out.println(Arrays.toString(array));
    }
}
