package ca.ioxom.part2;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int addition = Integer.parseInt(scanner.nextLine());
            //end if the input is 0
            if (addition == 0) {
                break;
            }
            //add to sum
            sum += addition;
        }
        System.out.println("sum of numbers: " + sum);
    }
}
