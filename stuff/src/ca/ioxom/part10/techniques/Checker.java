package ca.ioxom.part10.techniques;

import java.util.Scanner;

public class Checker {
    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public boolean allVowels(String string) {
        return string.matches("[aeiou]+");
    }

    public boolean timeOfDay(String string) {
        return string.matches("(([0-1][0-9]|2[0-4]):)(([0-5][0-9]):)[0-5][0-9]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();

        System.out.println("Enter a string (day of week):");
        if (checker.isDayOfWeek(scanner.nextLine())) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

        System.out.println("Enter a string (all vowels):");
        if (checker.allVowels(scanner.nextLine())) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }

        System.out.println("Enter a string (time of day):");
        if (checker.timeOfDay(scanner.nextLine())) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
