package ca.ioxom.part2.loops.repeating;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Give a number:");
        } while (Integer.parseInt(scanner.nextLine()) != 4);
    }
}