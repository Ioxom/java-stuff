package ca.ioxom.part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class searchList {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        //get a list of integers
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        int index = 0;
        int smallest = list.get(0);
        //find the smallest and log its index
        for (int i = 0; i < list.size() + 1; i++) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
                index = i;
                break;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println(smallest + " is at index " + index);
    }
}
