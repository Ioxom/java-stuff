package ca.ioxom.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class greatestInList {
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
        for (Integer integer : list) {
            if (greatest < integer) {
                greatest = integer;
            }
        }
        System.out.println("greatest: " + greatest);
    }
}
