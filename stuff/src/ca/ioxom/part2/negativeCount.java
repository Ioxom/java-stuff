package ca.ioxom.part2;

import java.util.Scanner;

public class negativeCount {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            } else if (input < 0) {
                numberCount++;
            }
        }
        System.out.println("number count: " + numberCount);
    }
}
