package ca.ioxom.part3.usingstrings;

import java.util.ArrayList;
import java.util.Scanner;

public class NameOfOldest {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }
        int index = 0;
        int largest = Integer.parseInt(list.get(0).split(", ")[1]);
        for (int i = 0; i < list.size(); i++) {
            if (Integer.parseInt(list.get(i).split(", ")[1]) > largest) {
                index = i;
            }
        }
        System.out.println(list.get(index).split(", ")[0]);
    }
}
