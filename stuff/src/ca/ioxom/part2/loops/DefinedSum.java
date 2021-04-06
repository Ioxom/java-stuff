package ca.ioxom.part2.loops;

import java.util.Scanner;

public class DefinedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number?");
        int firstInt = Integer.parseInt(scanner.nextLine());
        System.out.println("last number?");
        int lastInt = Integer.parseInt(scanner.nextLine());
        int number2 = 0;
        for (int i = firstInt + 1; i < lastInt + 1; i++) {
            number2 += i;
        }
        System.out.println("the sum is: " + number2);
    }
}
