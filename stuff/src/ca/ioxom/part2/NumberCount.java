package ca.ioxom.part2;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 0;
        while (true) {
            System.out.println("Give a number:");
            if (Integer.parseInt(scanner.nextLine()) == 0) {
                break;
            } else {
                numberCount++;
            }
        }
        System.out.println("number count: " + numberCount);
    }
}
