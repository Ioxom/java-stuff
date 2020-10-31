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
        int index = 0;
        int largestName = list.get(0).split(", ")[0].length();
        int birthYearSum = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).split(", ")[0].length()) > largestName) {
                index = i;
            }
            birthYearSum = birthYearSum + Integer.parseInt((list.get(i).split(", "))[1]);
        }
        System.out.println("longest name: " + list.get(index).split(", ")[0] + "\naverage birth year: " + ((double) birthYearSum / list.size()));
    }
}
