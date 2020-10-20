package ca.ioxom.part1;

import java.util.Scanner;

public class systemIn {
    public static void main(String[] args) {
        System.out.println("enter text to be repeated");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println(input);
        }
    }
}
