package ca.ioxom.part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class averageOfList {
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
        //get the sum
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println("average: " + ((double) sum / list.size()));
    }
}
