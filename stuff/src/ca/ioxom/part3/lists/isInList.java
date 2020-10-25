package ca.ioxom.part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class isInList {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        //get a list of integers
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }
        System.out.println("Search for?");
        String search = scanner.nextLine();
        for (String i : list) {
            if (i.equals(search)) {
                System.out.println(search + " was found");
            }
        }
        System.out.println(search + " was not found");
    }
}
