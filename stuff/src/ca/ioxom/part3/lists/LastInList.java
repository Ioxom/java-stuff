package ca.ioxom.part3.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {
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
        System.out.println(list.get(list.size() - 1));
    }
}
