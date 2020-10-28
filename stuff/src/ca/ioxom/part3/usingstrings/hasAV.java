package ca.ioxom.part3.usingstrings;

import java.util.Scanner;

public class hasAV {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] string = scanner.nextLine().split(" ");
            if (string[0].equals("stop")) {
                break;
            }
            for (String s : string) {
                if (s.contains("av")) {
                    System.out.println(s);
                }
            }
        }
    }
}
