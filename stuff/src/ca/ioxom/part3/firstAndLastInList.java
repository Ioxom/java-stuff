package ca.ioxom.part3;

import java.util.ArrayList;
import java.util.Scanner;

public class firstAndLastInList {
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
        System.out.println("first: " + list.get(0) + "\nlast: " + list.get(list.size() - 1));
    }
}
