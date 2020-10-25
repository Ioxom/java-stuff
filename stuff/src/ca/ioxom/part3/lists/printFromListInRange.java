package ca.ioxom.part3.lists;

import java.util.ArrayList;

public class printFromListInRange {
    public static void printNumbersInRange(ArrayList<Integer> list, int lowerLimit, int UpperLimit) {
        for (int number: list) {
            if (number < UpperLimit && number > lowerLimit) {
                System.out.println(number);
            }
        }
    }
    public static void main(String[] arrgs) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }
}
