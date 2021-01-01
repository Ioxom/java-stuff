package ca.ioxom.part2;

import java.util.Scanner;

public class AnotherTextPrinter {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many times?");
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < input; i++) {
            printText();
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
