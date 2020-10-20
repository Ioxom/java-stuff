package ca.ioxom.part2;

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Give a number:");
        } while (Integer.parseInt(scanner.nextLine()) != 4);
    }
}
