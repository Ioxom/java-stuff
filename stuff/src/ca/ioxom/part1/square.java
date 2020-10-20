package ca.ioxom.part1;

import java.util.Scanner;

public class square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = Double.parseDouble(scanner.nextLine());
        System.out.println("square of " + value + " is " + (value * value));
    }
}
