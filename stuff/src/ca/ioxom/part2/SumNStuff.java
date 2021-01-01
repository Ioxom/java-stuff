package ca.ioxom.part2;

import java.util.Scanner;

public class SumNStuff {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("last number?");
        int number = Integer.parseInt(scanner.nextLine());
        int number2 = 0;
        for (int i = 1; i < number + 1; i++) {
            number2 += i;
        }
        System.out.println("the sum is: " + number2);
    }
}
