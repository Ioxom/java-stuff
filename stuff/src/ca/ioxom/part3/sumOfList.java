package ca.ioxom.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class sumOfList {
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
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println("sum: " + sum);
    }
}
