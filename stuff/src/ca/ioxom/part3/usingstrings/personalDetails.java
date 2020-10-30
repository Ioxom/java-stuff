package ca.ioxom.part3.usingstrings;

import java.util.ArrayList;
import java.util.Scanner;

public class personalDetails {
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
        int largestName = array[0].split(", ")[0].length();
        int birthYearSum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i].split(", ")[0].length()) > largestName) {
                index = i;
            }
            System.out.println(i);
            birthYearSum = birthYearSum + Integer.parseInt((array[i].split(", "))[1]);
        }
        System.out.println("longest name: " + array[index].split(", ")[0] + "\naverage birth year: " + ((double) birthYearSum / array.length));
    }
}
