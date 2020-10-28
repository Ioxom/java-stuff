package ca.ioxom.part3.usingstrings;

import java.util.Scanner;

public class isItTrue {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word:");
        String word = scanner.nextLine();
        if (word.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
