package ca.ioxom.part3.usingstrings;

import java.util.Scanner;

public class lastWord {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] text = scanner.nextLine().split(" ");
            if (text[0].equals("")) {
                break;
            }
            System.out.println(text[text.length - 1]);
        }
    }
}
