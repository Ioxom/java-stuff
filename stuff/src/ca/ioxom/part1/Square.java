package ca.ioxom.part1;

import java.util.Scanner;

public class Square {

    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        double value = Double.parseDouble(scanner.nextLine());
        System.out.println("square of " + value + " is " + (value * value));
    }
}
