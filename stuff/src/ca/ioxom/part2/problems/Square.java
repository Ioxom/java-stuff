package ca.ioxom.part2.problems;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = Double.parseDouble(scanner.nextLine());
        System.out.println("square of " + value + " is " + (value * value));
    }
}
