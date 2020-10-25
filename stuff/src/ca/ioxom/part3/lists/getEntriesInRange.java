package ca.ioxom.part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class getEntriesInRange {
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
        System.out.println("from where? ");
        int start = scanner.nextInt();
        System.out.println("to where?");
        int finish = scanner.nextInt();
        for (int i = start; i < finish + 1; i++) {
            System.out.println(list.get(i));
        }
    }
}
