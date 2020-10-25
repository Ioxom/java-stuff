package ca.ioxom.part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class indexOfSmallest {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        //get a list of integers
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        System.out.println("search for?");
        int numberToFind = scanner.nextInt();
        int index = numberToFind;
        //find the number
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == numberToFind) {
                index = i;
            }
        }
        //if the number isn't found print "integer not found in list."
        if (!(index == numberToFind)) {
            System.out.println(numberToFind + " is at index " + index);
        } else {
            System.out.println("integer not found in list.");
        }
    }
}
