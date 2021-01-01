package ca.ioxom.fun;

import java.util.Scanner;

public class GetIntInfo {
    public static void main(String[] arrgs) {
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
