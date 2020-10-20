package ca.ioxom.part1;

import java.util.Scanner;

public class squarerootsum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number:");
        double value1 = Double.parseDouble(scanner.nextLine());
        System.out.println("enter second number:");
        double value2 = Double.parseDouble(scanner.nextLine());
        System.out.println("square root of sum: " + (Math.sqrt(value1 + value2)));
    }
}
