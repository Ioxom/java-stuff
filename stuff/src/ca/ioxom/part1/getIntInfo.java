package ca.ioxom.part1;

import java.util.Scanner;

public class getIntInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.println("enter an integer:");
            int integer = Integer.parseInt(scanner.nextLine());
            boolean isEven = integer % 2 == 0;
            boolean isPositive = integer > -1;
            System.out.println("even: " + isEven + "\npositive: " + isPositive+ "\nabsolute value: " + Math.abs(integer) + "\nsquare root: " + Math.sqrt(integer));
            System.out.println("continue?");
            if (scanner.nextLine().equals("no") || scanner.nextLine().equals("false")) {
                done = true;
            }
        }
    }
}
