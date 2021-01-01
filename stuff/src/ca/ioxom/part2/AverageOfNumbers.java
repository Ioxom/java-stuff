package ca.ioxom.part2;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberCount = 0;
        while (true) {
            System.out.println("Give a number:");
            int addition = Integer.parseInt(scanner.nextLine());
            if (addition == 0) {
                break;
            }
            sum += addition;
            numberCount++;
        }
        System.out.println("average: " + ((double) sum / (double) numberCount));
    }
}
