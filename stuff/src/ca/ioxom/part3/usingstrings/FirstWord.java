package ca.ioxom.part3.usingstrings;

import java.util.Scanner;

public class FirstWord {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            System.out.println(text.split(" ")[0]);
        }
    }
}
