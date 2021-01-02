package ca.ioxom.part1;

import java.util.Scanner;

public class SecondsInDay {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        double number = Double.parseDouble(scanner.nextLine());
        double secondsInNumber = number * 86400;
        System.out.println("seconds in " + number + " days: " + secondsInNumber);
    }
}
