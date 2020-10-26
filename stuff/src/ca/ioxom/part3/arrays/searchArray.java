package ca.ioxom.part3.arrays;

import java.util.Scanner;

public class searchArray {
    public static void main(String[] arrgs) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;
        System.out.println("search for?");
        Scanner scanner = new Scanner(System.in);
        int search = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (search == array[i]) {
                System.out.println(search + " was found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(search + " was not found");
        }
    }
}
