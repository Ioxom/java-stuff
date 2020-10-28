package ca.ioxom.part3.usingstrings;

import java.util.Scanner;

public class lineByLine {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] string = scanner.nextLine().split(" ");
            if (string[0].equals("stop")) {
                break;
            }
            for (String s : string) {
                System.out.println(s);
            }
        }
    }
}
