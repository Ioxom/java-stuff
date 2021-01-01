package ca.ioxom.part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            }
            list.add(input);
        }
        System.out.println(list.get(1) + list.get(2));
    }
}
