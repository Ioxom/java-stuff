package ca.ioxom.part2.loops.repeating;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 0;
        while (true) {
            System.out.println("Give a number:");
            if (Integer.parseInt(scanner.nextLine()) == 0) {
                break;
            } else {
                numberCount++;
            }
        }
        System.out.println("number count: " + numberCount);
    }
}
