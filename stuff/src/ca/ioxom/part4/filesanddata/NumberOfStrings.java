package ca.ioxom.part4.filesanddata;

import java.util.Scanner;

public class NumberOfStrings {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        int stringCount = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            stringCount++;
        }
        System.out.println(stringCount);
    }
}
