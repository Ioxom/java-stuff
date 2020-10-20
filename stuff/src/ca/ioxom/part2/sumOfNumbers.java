package ca.ioxom.part2;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int addition = Integer.parseInt(scanner.nextLine());
            if (addition == 0) {
                break;
            }
            sum += addition;
        }
        System.out.println("sum of numbers: " + sum);
    }
}
