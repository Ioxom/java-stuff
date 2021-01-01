package ca.ioxom.part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        int greatest = list.get(0);
        //shorthand for a for loop that ends once it gets to list.size()
        for (Integer integer : list) {
            if (greatest < integer) {
                greatest = integer;
            }
        }
        System.out.println("greatest: " + greatest);
    }
}
