package ca.ioxom.part3.usingstrings;

import java.util.ArrayList;
import java.util.Scanner;

public class nameOfOldest {
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
        String[] array = list.toArray(new String[0]);
        int index = 0;
        int largest = Integer.parseInt(array[0].split(", ")[1]);
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(array[i].split(", ")[1]) > largest) {
                index = i;
            }
        }
        System.out.println(array[index].split(", ")[0]);
    }
}
